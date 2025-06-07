/**********************************/
/* Table Name: 사용자 */
/**********************************/
CREATE TABLE tb_user(
                        email                         		VARCHAR(50)		 NOT NULL COMMENT '사용자 이메일',
                        password                      		VARCHAR(100)		 NULL  COMMENT '사용자 비밀번호',
                        nickname                      		VARCHAR(20)		 NOT NULL COMMENT '사용자 닉네임',
                        tel_number                    		VARCHAR(15)		 NULL  COMMENT '사용자 휴대전화번호',
                        address                       		TINYTEXT		 NULL  COMMENT '사용자 주소',
                        address_detail                		TINYTEXT		 NULL  COMMENT '사용자 상세 주소',
                        profile_image                 		TINYTEXT		 NULL  COMMENT '사용자 프로필 사진'
) COMMENT='사용자';

/**********************************/
/* Table Name: 게시물 테이블 */
/**********************************/
CREATE TABLE tb_board(
                         board_number                  		INT(10)		 NOT NULL COMMENT '게시물 번호',
                         title                         		TEXT		 NULL  COMMENT '게시물 제목',
                         content                       		TEXT		 NULL  COMMENT '게시물 내용',
                         write_datetime                		DATETIME		 NULL  COMMENT '게시물 작성 날짜',
                         favorit_count                 		INT(10)		 NULL  COMMENT '게시물 좋아요 수',
                         comment_count                 		INT(10)		 DEFAULT 0		 NULL  COMMENT '게시물 댓글 수',
                         view_count                    		INT(10)		 DEFAULT 0		 NULL  COMMENT '게시물 조회 수',
                         writer_email                  		VARCHAR(50)		 NULL  COMMENT '사용자 이메일'
) COMMENT='게시물 테이블';

/**********************************/
/* Table Name: 게시물 이미지 테이블 */
/**********************************/
CREATE TABLE tb_image(
                         board_number                  		INT(10)		 NULL  COMMENT '게시물 번호',
                         image                         		TEXT		 NULL  COMMENT '게시물 이미지 URL'
) COMMENT='게시물 이미지 테이블';

/**********************************/
/* Table Name: 좋아요 테이블 */
/**********************************/
CREATE TABLE tb_favorite(
                            email                         		VARCHAR(50)		 NULL  COMMENT '사용자 이메일',
                            board_number                  		INT(10)		 NULL  COMMENT '게시물 번호'
) COMMENT='좋아요 테이블';

/**********************************/
/* Table Name: 댓글 테이블 */
/**********************************/
CREATE TABLE tb_comment(
                           comment_count                 		INT(10)		 NOT NULL COMMENT '댓글 번호',
                           content                       		TEXT		 NULL  COMMENT '댓글 내용',
                           write_datetime                		DATETIME		 NULL  COMMENT '작성 날짜 및 시간',
                           board_number                  		INT(10)		 NULL  COMMENT '게시물 번호',
                           user_email                    		VARCHAR(50)		 NULL  COMMENT '사용자 이메일'
) COMMENT='댓글 테이블';

/**********************************/
/* Table Name: 검색 기록 테이블 */
/**********************************/
CREATE TABLE tb_search_log(
                              sequence                      		INT(10)		 NOT NULL AUTO_INCREMENT COMMENT '시퀀스',
                              search_word                   		TEXT		 NOT NULL COMMENT '검색어',
                              relation_word                 		TEXT		 NULL  COMMENT '관련 검색어',
                              relation                      		BOOLEAN		 NULL  COMMENT '관련 검색어 여부'
) COMMENT='검색 기록 테이블';


ALTER TABLE tb_user ADD CONSTRAINT IDX_tb_user_PK PRIMARY KEY (email);

ALTER TABLE tb_board ADD CONSTRAINT IDX_tb_board_PK PRIMARY KEY (board_number);
ALTER TABLE tb_board ADD CONSTRAINT IDX_tb_board_FK0 FOREIGN KEY (writer_email) REFERENCES tb_user (email);

ALTER TABLE tb_image ADD CONSTRAINT IDX_tb_image_FK0 FOREIGN KEY (board_number) REFERENCES tb_board (board_number);

ALTER TABLE tb_favorite ADD CONSTRAINT IDX_tb_favorite_FK0 FOREIGN KEY (email) REFERENCES tb_user (email);
ALTER TABLE tb_favorite ADD CONSTRAINT IDX_tb_favorite_FK1 FOREIGN KEY (board_number) REFERENCES tb_board (board_number);

ALTER TABLE tb_comment ADD CONSTRAINT IDX_tb_comment_PK PRIMARY KEY (comment_count);
ALTER TABLE tb_comment ADD CONSTRAINT IDX_tb_comment_FK0 FOREIGN KEY (board_number) REFERENCES tb_board (board_number);
ALTER TABLE tb_comment ADD CONSTRAINT IDX_tb_comment_FK1 FOREIGN KEY (user_email) REFERENCES tb_user (email);

ALTER TABLE tb_search_log ADD CONSTRAINT IDX_tb_search_log_PK PRIMARY KEY (sequence);


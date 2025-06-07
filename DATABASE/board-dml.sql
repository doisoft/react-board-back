-- 사용자 등록
INSERT INTO tb_user VALUES ('admin@email.com',
                            'P!ssw0rd',
                            'matthew',
                            '01012341234',
                            '경기도 수원시 영통구',
                            '신원로 284',
                            null);

select * from tb_user;

-- 게시물 작성
INSERT INTO tb_board (title, content, write_datetime, favorite_count, comment_count, view_count, writer_email)
VALUES ('제목입니다. ', '내용입니다. ', now(), 0, 0, 0, 'admin@email.com');

SELECT * FROM tb_board;

DESC tb_comment;
INSERT INTO tb_comment (content, write_datetime, user_email, board_number)
VALUES ('반갑습니다.', now(), 'admin@email.com', 1);

INSERT INTO tb_favorite VALUES ('admin@email.com', 1);

-- VIEW 생성
CREATE OR REPLACE VIEW board_list_view AS
SELECT B.board_number,
       B.title,
       B.content,
       B.favorite_count,
       B.comment_count,
       B.view_count,
       B.write_datetime,
       I.image AS title_image,
       U.email AS writer_email,
       U.nickname AS writer_nickname,
       U.profile_image AS writer_profile_image
FROM tb_board AS B INNER JOIN tb_user AS U ON B.writer_email = U.email
LEFT JOIN (SELECT * FROM tb_image GROUP BY board_number) AS I ON B.board_number = I.board_number;
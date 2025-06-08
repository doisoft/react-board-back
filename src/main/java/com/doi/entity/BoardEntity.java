package com.doi.entity;

import com.doi.dto.request.board.PostBoardRequestDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * packageName  : com.doi.entity
 * fileName     : BoardEntity
 * author       : user01
 * date         : 2025. 5. 6.
 * description. :
 * ======================================================
 * DATE         AUTHOR          NOTE
 * ------------------------------------------------------
 * 2025. 5. 6.      user01         First creation
 */

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "board")
@Table(name = "tb_board")
public class BoardEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer boardNumber;

    private String title;

    private String content;

    private String writeDatetime;

    private int favoriteCount;

    private int commentCount;

    private int viewCount;

    private String writerEmail;

    public BoardEntity(PostBoardRequestDto dto, String email) {
        this.title = dto.getTitle();
        this.content = dto.getContent();
        this.writeDatetime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        this.writerEmail = email;
        this.favoriteCount = 0;
        this.commentCount = 0;
        this.viewCount = 0;
    }
}

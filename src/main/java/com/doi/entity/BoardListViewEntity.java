package com.doi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * packageName  : com.doi.entity
 * fileName     : BoardListViewEntity
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
@Entity(name = "board_list_view")
@Table(name = "board_list_view")
public class BoardListViewEntity {

    @Id
    private int boardNumber;

    private String title;

    private String content;

    private String titleImage;

    private int viewCount;

    private int favoriteCount;

    private int commentCount;

    private String writeDateTime;

    private String writerEmail;

    private String writerNickname;

    private String writerProfileImage;

}

package com.doi.dto.object;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * packageName  : com.doi.dto.object
 * fileName     : BoardListItem
 * author       : user01
 * date         : 2025. 4. 12.
 * description. :
 * ======================================================
 * DATE         AUTHOR          NOTE
 * ------------------------------------------------------
 * 2025. 4. 12.      user01         First creation
 */

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BoardListItem {
    private int boardNumber;
    private String title;
    private String content;
    private String boardTitleImage;
    private int favoriteCount;
    private int commentCount;
    private int viewCount;
    private String writeDateTime;
    private String writerNickname;
    private String writerProfileImage;
}

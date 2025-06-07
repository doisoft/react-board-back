package com.doi.dto.object;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * packageName  : com.doi.dto.object
 * fileName     : CommentListItem
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
public class CommentListItem {
    private String nickname;
    private String profileImage;
    private String writerDatetime;
    private String content;
}

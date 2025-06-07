package com.doi.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * packageName  : com.doi.entity
 * fileName     : CommentEntity
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
@Entity(name = "comment")
@Table(name = "tb_comment")
public class CommentEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer commentNumber;

    private String content;

    private String writeDatetime;

    private String userEmail;

    private int boardNumber;

}

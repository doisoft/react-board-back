package com.doi.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * packageName  : com.doi.entity
 * fileName     : ImageEntity
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
@Entity(name = "image")
@Table(name = "tb_image")
public class ImageEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer sequence;

    private int boardNumber;

    private String image;

    public ImageEntity(int boardNumber, String imageUrl) {
        this.boardNumber = boardNumber;
        this.image = imageUrl;
    }
}

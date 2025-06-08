package com.doi.service.impl;

import com.doi.dto.ResponseDto;
import com.doi.dto.request.board.PostBoardRequestDto;
import com.doi.dto.response.board.PostBoardResponseDto;
import com.doi.entity.BoardEntity;
import com.doi.entity.ImageEntity;
import com.doi.repository.BoardRepository;
import com.doi.repository.ImageRepository;
import com.doi.repository.UserRepository;
import com.doi.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName  : com.doi.service.impl
 * fileName     : BoardServiceImpl
 * author       : user01
 * date         : 2025. 6. 8.
 * description. :
 * ======================================================
 * DATE         AUTHOR          NOTE
 * ------------------------------------------------------
 * 2025. 6. 8.      user01         First creation
 */

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {

    private final UserRepository userRepository;

    private final BoardRepository boardRepository;

    private final ImageRepository imageRepository;

    @Override
    public ResponseEntity<? super PostBoardResponseDto> postBoard(PostBoardRequestDto dto, String email) {

        try {
            boolean existedEmail = userRepository.existsByEmail(email);
            if (!existedEmail) return PostBoardResponseDto.notExistUser();

            BoardEntity boardEntity = new BoardEntity(dto, email);
            boardRepository.save(boardEntity);

            int boardNumber = boardEntity.getBoardNumber();
            List<String> boardImageList = dto.getBoardImageList();
            List<ImageEntity> imageEntities = new ArrayList<>();

            for (String imageUrl : boardImageList) {
                ImageEntity imageEntity = new ImageEntity(boardNumber, imageUrl);
                imageEntities.add(imageEntity);
            }

            imageRepository.saveAll(imageEntities);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseDto.databaseError();
        }

        return PostBoardResponseDto.success();
    }
}

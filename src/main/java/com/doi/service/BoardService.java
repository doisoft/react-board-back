package com.doi.service;

import com.doi.dto.request.board.PostBoardRequestDto;
import com.doi.dto.response.board.PostBoardResponseDto;
import org.springframework.http.ResponseEntity;

/**
 * packageName  : com.doi.service
 * fileName     : BoardService
 * author       : user01
 * date         : 2025. 6. 8.
 * description. :
 * ======================================================
 * DATE         AUTHOR          NOTE
 * ------------------------------------------------------
 * 2025. 6. 8.      user01         First creation
 */

public interface BoardService {
    ResponseEntity<? super PostBoardResponseDto> postBoard(PostBoardRequestDto dto, String email);

}

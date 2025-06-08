package com.doi.controller;

import com.doi.dto.request.board.PostBoardRequestDto;
import com.doi.dto.response.board.PostBoardResponseDto;
import com.doi.service.BoardService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * packageName  : com.doi.controller
 * fileName     : BoardController
 * author       : user01
 * date         : 2025. 6. 8.
 * description. :
 * ======================================================
 * DATE         AUTHOR          NOTE
 * ------------------------------------------------------
 * 2025. 6. 8.      user01         First creation
 */

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/board")
public class BoardController {

    private final BoardService boardService;

    @PostMapping("/save")
    public ResponseEntity<? super PostBoardResponseDto> postBoard(@RequestBody @Valid PostBoardRequestDto boardRequestDto,
                                                                  @AuthenticationPrincipal String email) {
        ResponseEntity<? super PostBoardResponseDto> response = boardService.postBoard(boardRequestDto, email);
        return response;
    }
}

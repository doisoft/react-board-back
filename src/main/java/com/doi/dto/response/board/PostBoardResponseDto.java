package com.doi.dto.response.board;

import com.doi.common.ResponseCode;
import com.doi.common.ResponseMessage;
import com.doi.dto.ResponseDto;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * packageName  : com.doi.dto.response.board
 * fileName     : PostBoardResponseDto
 * author       : user01
 * date         : 2025. 6. 8.
 * description. :
 * ======================================================
 * DATE         AUTHOR          NOTE
 * ------------------------------------------------------
 * 2025. 6. 8.      user01         First creation
 */

@Getter
public class PostBoardResponseDto extends ResponseDto {

    public PostBoardResponseDto() {
        super(ResponseCode.SUCCESS, ResponseMessage.SUCCESS);
    }

    public static ResponseEntity<PostBoardResponseDto> success() {
        PostBoardResponseDto result = new PostBoardResponseDto();
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

    public static ResponseEntity<ResponseDto> notExistUser() {
        ResponseDto result = new ResponseDto(ResponseCode.NOT_EXISTED_USER, ResponseMessage.NOT_EXISTED_USER);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
}

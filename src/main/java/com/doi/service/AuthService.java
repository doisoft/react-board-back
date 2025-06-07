package com.doi.service;

import com.doi.dto.request.auth.SignInRequestDto;
import com.doi.dto.request.auth.SignUpRequestDto;
import com.doi.dto.response.auth.SignInResponseDto;
import com.doi.dto.response.auth.SignUpResponseDto;
import org.springframework.http.ResponseEntity;

/**
 * packageName  : com.doi.service
 * fileName     : AuthService
 * author       : user01
 * date         : 2025. 5. 9.
 * description. :
 * ======================================================
 * DATE         AUTHOR          NOTE
 * ------------------------------------------------------
 * 2025. 5. 9.      user01         First creation
 */

public interface AuthService {

    ResponseEntity<? super SignUpResponseDto> signUp(SignUpRequestDto dto);
    ResponseEntity<? super SignInResponseDto> signIn(SignInRequestDto dto);
}

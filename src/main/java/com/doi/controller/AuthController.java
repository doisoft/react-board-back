package com.doi.controller;

import com.doi.dto.request.auth.SignInRequestDto;
import com.doi.dto.request.auth.SignUpRequestDto;
import com.doi.dto.response.auth.SignInResponseDto;
import com.doi.dto.response.auth.SignUpResponseDto;
import com.doi.service.AuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * packageName  : com.doi.controller
 * fileName     : AuthController
 * author       : user01
 * date         : 2025. 5. 9.
 * description. :
 * ======================================================
 * DATE         AUTHOR          NOTE
 * ------------------------------------------------------
 * 2025. 5. 9.      user01         First creation
 */

@Slf4j
@RequiredArgsConstructor
@RequestMapping("/api/v1/auth")
@RestController
public class AuthController {

    private final AuthService authService;

    @PostMapping("/sign-up")
    public ResponseEntity<? super SignUpResponseDto> signUp(@RequestBody @Valid SignUpRequestDto  requestDto) {
        return authService.signUp(requestDto);
    }

    @PostMapping("/sign-in")
    public ResponseEntity<? super SignInResponseDto> signIn(@RequestBody @Valid SignInRequestDto requestDto) {
        log.info("signIn requestDto={}", requestDto);
        return authService.signIn(requestDto);
    }
}

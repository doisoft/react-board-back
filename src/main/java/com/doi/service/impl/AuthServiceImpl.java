package com.doi.service.impl;

import com.doi.dto.ResponseDto;
import com.doi.dto.request.auth.SignInRequestDto;
import com.doi.dto.request.auth.SignUpRequestDto;
import com.doi.dto.response.auth.SignInResponseDto;
import com.doi.dto.response.auth.SignUpResponseDto;
import com.doi.entity.UserEntity;
import com.doi.provider.JwtProvider;
import com.doi.repository.UserRepository;
import com.doi.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * packageName  : com.doi.service.impl
 * fileName     : AuthServiceImpl
 * author       : user01
 * date         : 2025. 5. 9.
 * description. :
 * ======================================================
 * DATE         AUTHOR          NOTE
 * ------------------------------------------------------
 * 2025. 5. 9.      user01         First creation
 */

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtProvider jwtProvider;

    @Override
    public ResponseEntity<? super SignUpResponseDto> signUp(SignUpRequestDto dto) {

        try {

            boolean existedEmail = userRepository.existsByEmail(dto.getEmail());
            if (existedEmail) return SignUpResponseDto.duplicateEmail();

            boolean existsByNickname = userRepository.existsByNickname(dto.getNickname());
            if (existsByNickname) return SignUpResponseDto.duplicateNickname();

            boolean existsByTelNumber = userRepository.existsByTelNumber(dto.getTelNumber());
            if (existsByTelNumber) return SignUpResponseDto.duplicateTelNumber();

            String encode = passwordEncoder.encode(dto.getPassword());
            dto.setPassword(encode);

            UserEntity userEntity = new UserEntity(dto);
            userRepository.save(userEntity);

        } catch (Exception e) {
            e.printStackTrace();
            return ResponseDto.databaseError();
        }

        return SignUpResponseDto.success();
    }

    @Override
    public ResponseEntity<? super SignInResponseDto> signIn(SignInRequestDto dto) {
        String token = null;

        try {
            UserEntity userEntity = userRepository.findByEmail(dto.getEmail());
            if (userEntity == null) return SignInResponseDto.signInFailed();

            boolean matches = passwordEncoder.matches(dto.getPassword(), userEntity.getPassword());
            if (!matches) return SignInResponseDto.signInFailed();

            token = jwtProvider.create(dto.getEmail());

        } catch (Exception e) {
            e.printStackTrace();
            return ResponseDto.databaseError();
        }

        return SignInResponseDto.success(token);
    }
}

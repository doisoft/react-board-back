package com.doi.service.impl;

import com.doi.dto.ResponseDto;
import com.doi.dto.response.user.GetSignInUserResponseDto;
import com.doi.entity.UserEntity;
import com.doi.repository.UserRepository;
import com.doi.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

/**
 * packageName  : com.doi.service.impl
 * fileName     : UserServiceImpl
 * author       : user01
 * date         : 2025. 6. 7.
 * description. :
 * ======================================================
 * DATE         AUTHOR          NOTE
 * ------------------------------------------------------
 * 2025. 6. 7.      user01         First creation
 */

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository UserRepository;

    @Override
    public ResponseEntity<? super GetSignInUserResponseDto> getSignInUser(String email) {

        UserEntity userEntity = null;
        try {

            userEntity = UserRepository.findByEmail(email);
            if (userEntity == null) return GetSignInUserResponseDto.notExistUser();

        } catch (Exception e) {
            e.printStackTrace();
            return ResponseDto.databaseError();
        }

        return GetSignInUserResponseDto.success(userEntity);
    }
}

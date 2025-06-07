package com.doi.service;

import com.doi.dto.response.user.GetSignInUserResponseDto;
import org.springframework.http.ResponseEntity;

/**
 * packageName  : com.doi.service
 * fileName     : UserService
 * author       : user01  
 * date         : 2025. 6. 7.
 * description. :
 * ======================================================
 * DATE         AUTHOR          NOTE
 * ------------------------------------------------------
 * 2025. 6. 7.      user01         First creation
 */

public interface UserService {

    ResponseEntity<? super GetSignInUserResponseDto> getSignInUser(String email);
}

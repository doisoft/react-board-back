package com.doi.dto.request.auth;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * packageName  : com.doi.dto.request.auth
 * fileName     : SignInRequestDto
 * author       : user01
 * date         : 2025. 5. 9.
 * description. :
 * ======================================================
 * DATE         AUTHOR          NOTE
 * ------------------------------------------------------
 * 2025. 5. 9.      user01         First creation
 */
@Getter
@Setter
@NoArgsConstructor
public class SignInRequestDto {

    @NotBlank
    private String email;
    @NotBlank
    private String password;
}

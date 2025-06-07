package com.doi.dto.request.auth;


import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * packageName  : com.doi.dto.request.auth
 * fileName     : SignUpRequestDto
 * author       : user01
 * date         : 2025. 5. 6.
 * description. :
 * ======================================================
 * DATE         AUTHOR          NOTE
 * ------------------------------------------------------
 * 2025. 5. 6.      user01         First creation
 */

@Getter
@Setter
@NoArgsConstructor
public class SignUpRequestDto {

    @NotBlank @Email
    private String email;
    @NotBlank @Size(min = 8, max = 20)
    private String password;
    @NotBlank
    private String nickname;
    @NotBlank
    @Pattern(regexp = "^01[016789][0-9]{3,4}[0-9]{4}$")
    private String telNumber;
    @NotBlank
    private String address;

    private String addressDetail;
    @NotNull @AssertTrue
    private Boolean agreedPersonal;
}

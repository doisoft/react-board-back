package com.doi.common;

/**
 * packageName  : com.doi.common
 * fileName     : ResponseMessage
 * author       : user01
 * date         : 2025. 4. 10.
 * description. :
 * ======================================================
 * DATE         AUTHOR          NOTE
 * ------------------------------------------------------
 * 2025. 4. 10.      user01         First creation
 */

public interface ResponseMessage {
    // 200
    public static final String SUCCESS = "Success.";
    // 400
    String VALIDATION_FAILED = "Validation failed.";
    String DUPLICATE_EMAIL = "Duplicate tel number.";
    String DUPLICATE_NICKNAME = "Duplicate nickname.";
    String DUPLICATE_TEL_NUMBER = "Duplicate tel number.";
    String NOT_EXISTED_USER = "This user does not exist.";
    String NOT_EXISTED_BOARD = "This board does not exist.";
    // 401
    String SIGN_IN_FAIL = "Login information mismatch.";
    String AUTHORIZATION_FAIL = "Authorization Failed.";
    // 403
    String NO_PERMISSION = "Do not have permission.";
    // 500
    String DATABASE_ERROR = "Database error.";
}

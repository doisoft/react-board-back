package com.doi.service;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

/**
 * packageName  : com.doi.service
 * fileName     : FileService
 * author       : user01
 * date         : 2025. 6. 8.
 * description. :
 * ======================================================
 * DATE         AUTHOR          NOTE
 * ------------------------------------------------------
 * 2025. 6. 8.      user01         First creation
 */

public interface FileService {

    String upload(MultipartFile file);
    Resource getImage(String fileName);
}

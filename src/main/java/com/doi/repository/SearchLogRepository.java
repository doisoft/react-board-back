package com.doi.repository;

import com.doi.entity.SearchLogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * packageName  : com.doi.repository
 * fileName     : SearchLogRepository
 * author       : user01
 * date         : 2025. 5. 6.
 * description. :
 * ======================================================
 * DATE         AUTHOR          NOTE
 * ------------------------------------------------------
 * 2025. 5. 6.      user01         First creation
 */

@Repository
public interface SearchLogRepository extends JpaRepository<SearchLogEntity, Integer> {
}

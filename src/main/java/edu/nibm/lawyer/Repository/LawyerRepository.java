package edu.nibm.lawyer.Repository;

import edu.nibm.lawyer.dto.LawyerEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LawyerRepository extends JpaRepository<LawyerEntity,String> {
    boolean existsByEmail(String email);
    LawyerEntity findByEmail(String email);
    LawyerEntity findById(int id);
}
package edu.nibm.lawyer.Service;


import edu.nibm.lawyer.dao.Lawyer;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Validated
public interface LawyerService {
    boolean addLawyer(Lawyer lawyer);

    List<Lawyer> getAllLawyers(int page, int size);

    int loginLawyer(String lawyerEmail, String lawyerPassword);

    Lawyer getLawyer(int id);
}

package com.vnrits.quizz.quizz_app;
import java.awt.print.Pageable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface OptionsRepo extends JpaRepository<Options, Long> {
	
	
	@Query(nativeQuery = true, value = "select id,option1,option2,option3,option4,answer from options where question_id=?1")
	Options findByquestion(int id);
}

package ac.daffodil.repository;

import ac.daffodil.model.Exam;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ExamRepository extends JpaRepository<Exam, Long> {
}

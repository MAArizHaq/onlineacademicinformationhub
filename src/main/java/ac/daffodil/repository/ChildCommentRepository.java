package ac.daffodil.repository;

import ac.daffodil.model.ChildComments;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ChildCommentRepository extends JpaRepository<ChildComments,Long> {
}

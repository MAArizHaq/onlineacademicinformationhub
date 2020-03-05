package ac.daffodil.repository;

import ac.daffodil.model.Comments;
import ac.daffodil.model.File;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CommentRepository extends JpaRepository<Comments,Long>{

}

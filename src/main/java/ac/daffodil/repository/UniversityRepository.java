package ac.daffodil.repository;

import ac.daffodil.model.University;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("universityRepository")
public interface UniversityRepository extends JpaRepository<University, Long>{
}

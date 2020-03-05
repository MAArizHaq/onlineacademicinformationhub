package ac.daffodil.repository;


import ac.daffodil.model.College;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("collegeRepository")
public interface CollegeRepository extends JpaRepository<College, Long> {


}

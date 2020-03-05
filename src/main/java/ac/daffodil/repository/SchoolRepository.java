package ac.daffodil.repository;


import ac.daffodil.model.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("schoolRepository")
public interface SchoolRepository extends JpaRepository<School, Long> {


}

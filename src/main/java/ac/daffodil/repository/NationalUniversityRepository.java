package ac.daffodil.repository;


import ac.daffodil.model.NationalUniversity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("nationalUniversityRepository")
public interface NationalUniversityRepository extends JpaRepository<NationalUniversity, Long> {


}

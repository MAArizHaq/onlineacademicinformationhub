package ac.daffodil.repository;

import ac.daffodil.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;



@Repository("roleRepository")
public interface RoleRepository extends JpaRepository<Role, Long> {

    @Query(value = "SELECT MAX(ROLE_ID) FROM ROLE", nativeQuery = true)
    long countForMaxId();

}

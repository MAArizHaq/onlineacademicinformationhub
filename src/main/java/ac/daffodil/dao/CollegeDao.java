package ac.daffodil.dao;

import ac.daffodil.model.College;
import ac.daffodil.repository.CollegeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;


@Repository
@Transactional
public class CollegeDao implements GenericInterface<College>{


    @Qualifier("collegeRepository")
    @Autowired
    private CollegeRepository collegeRepository;


    @Override
    public College save(College college) {

        collegeRepository.save(college);

        return college;
    }

    @Override
    public College update(College college) {
        collegeRepository.saveAndFlush(college);

        return college;
    }

    @Override
    public boolean delete(College college) {
        return false;
    }

    @Override
    public List<College> getAll() {
        return null;
    }

    @Override
    public Optional<College> find(Long id) {
        return null;
    }
}

package ac.daffodil.dao;


import ac.daffodil.model.School;
import ac.daffodil.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;


@Repository
@Transactional
public class SchoolDao implements GenericInterface<School>{


    @Qualifier("schoolRepository")
    @Autowired
    private SchoolRepository schoolRepository;


    @Override
    public School save(School school) {

        schoolRepository.save(school);

        return school;
    }

    @Override
    public School update(School school) {
        schoolRepository.saveAndFlush(school);

        return school;
    }

    @Override
    public boolean delete(School school) {
        return false;
    }

    @Override
    public List<School> getAll() {
        return schoolRepository.findAll();
    }

    @Override
    public Optional<School> find(Long id) {
        return null;
    }
}

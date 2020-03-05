package ac.daffodil.dao;


import ac.daffodil.model.NationalUniversity;
import ac.daffodil.repository.NationalUniversityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;


@Repository
@Transactional
public class NationalUniversityDao implements GenericInterface<NationalUniversity>{


    @Qualifier("nationalUniversityRepository")
    @Autowired
    private NationalUniversityRepository nationalUniversityRepository;


    @Override
    public NationalUniversity save(NationalUniversity nationalUniversity) {

        nationalUniversityRepository.save(nationalUniversity);

        return nationalUniversity;
    }

    @Override
    public NationalUniversity update(NationalUniversity nationalUniversity) {
        nationalUniversityRepository.saveAndFlush(nationalUniversity);

        return nationalUniversity;
    }

    @Override
    public boolean delete(NationalUniversity nationalUniversity) {
        return false;
    }

    @Override
    public List<NationalUniversity> getAll() {
        return null;
    }

    @Override
    public Optional<NationalUniversity> find(Long id) {
        return null;
    }
}

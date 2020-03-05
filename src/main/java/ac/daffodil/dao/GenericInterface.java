package ac.daffodil.dao;


import java.util.List;
import java.util.Optional;



public interface GenericInterface<T> {

    T save(T val);
    T update(T val);
    boolean delete(T val);
    List<T> getAll();
    Optional<T> find(Long id);
}

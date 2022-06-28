package fai.backend.BackEndFAI;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// save(object)

@Repository
public interface TelevisionInterface extends CrudRepository<Television, Integer> {

}

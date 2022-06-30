package fai.backend.BackEndFAI;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// save(object)

@Repository
public interface TelevisionInterface extends CrudRepository<Television, Integer> {
	public Optional<Television> findByBrand(String brand);
	public Optional<Television> findByCost(int cost);
}

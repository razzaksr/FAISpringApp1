package fai.backend.BackEndFAI;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// save(object), findById,findByProperty, findAll, findAllByProperty,delete,deleteById

@Repository
public interface TelevisionInterface extends CrudRepository<Television, Integer> {
	public Optional<Television> findByBrand(String brand);
	public List<Television> findAllByCost(int cost);
	
	@Query("from Television where brand=:bnd and inches>=:in")
	public List<Television> findAllByBrandAndInches(String bnd,double in);
	
	@Query("select brand from Television where type=:tp")
	public List<String> findAllByTypes(String tp);
}

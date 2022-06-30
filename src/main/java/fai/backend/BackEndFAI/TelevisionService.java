package fai.backend.BackEndFAI;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TelevisionService {
	
	@Autowired
	TelevisionInterface obj;
	
	// findByCost implementation
	public Optional<Television> makeReadCost(int rest){
		return obj.findByCost(rest);
	}
	
	//findById implementation
	public Optional<Television> makeRead(int key){
		return obj.findById(key);
	}
	
	// findAll implementation
	public List<Television> makeFetchAll(){
		return (List<Television>) obj.findAll();
	}
	
	
	// save implementation
	public Television makeNewOne(Television tele) {
		return obj.save(tele);
	}
}

package fai.backend.BackEndFAI;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TelevisionService {
	
	@Autowired
	TelevisionInterface obj;
	
	// updatePriceByBrand implementation
	public void makeUpdate(String which){
		obj.updatePriceByBrand(which);
	}
	
	// delete implementation
	public String makeDelete(Television tel) {
		String msg=tel.getModel()+" has deleted";
		obj.delete(tel);
		return msg;
	}
	
	// findAllByTypes implementation
	public List<String> makeFetchByTypes(String ty){
		return obj.findAllByTypes(ty);
	}
	
	// findAllByBrandAndInches implementation
	public List<Television> makeFetchByBrandInch(String alpha,double beta){
		return obj.findAllByBrandAndInches(alpha, beta);
	}
	
	// findAllByCost implementation
	public List<Television> makeReadCost(int rest){
		return obj.findAllByCost(rest);
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

package fai.backend.BackEndFAI;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TelevisionExecutive {
	@Autowired
	TelevisionService service;
	
	@GetMapping("/byprice/{value}")
	public Optional<Television> callingReadCost(@PathVariable("value") int value){
		return service.makeReadCost(value);
	}
	
	@GetMapping("/{hey}")
	public Optional<Television> callingRead(@PathVariable("hey") int hey){
		return service.makeRead(hey);
	}
	
	@GetMapping("/")
	public List<Television> callingTraverse(){
		return service.makeFetchAll();
	}
	
	@PostMapping("/new")
	public Television callingCreation(@RequestBody Television tel) {
		return service.makeNewOne(tel);
	}
}

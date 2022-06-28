package fai.backend.BackEndFAI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TelevisionExecutive {
	@Autowired
	TelevisionService service;
	
	@PostMapping("/new")
	public Television callingCreation(@RequestBody Television tel) {
		return service.makeNewOne(tel);
	}
}

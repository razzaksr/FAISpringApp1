package fai.backend.BackEndFAI;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class BackEndFaiApplication {
	
	@Autowired
	PasswordEncoder encoder;
	
	@Autowired
	ResourceService service;

	public static void main(String[] args) {
		SpringApplication.run(BackEndFaiApplication.class, args);
	}
	
//	@PostConstruct
//	public void zealous() {
//		Resource res=new Resource();
//		
//		res.setEmail("razzaksr@gmail.com");res.setEmpName("Razak Mohamed S");
//		res.setMobile(87654345678L);res.setPassword(encoder.encode("mohamed"));
//		res.setUsername("razak");
//		
//		service.implementSave(res);
//	}

}

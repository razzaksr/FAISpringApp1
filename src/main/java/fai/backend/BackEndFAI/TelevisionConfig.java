package fai.backend.BackEndFAI;

import java.util.Collection;
import java.util.stream.Stream;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class TelevisionConfig{
	
	@Bean
	public InMemoryUserDetailsManager silviya() {
		UserDetails myUser1=User.withDefaultPasswordEncoder().username("anu").
				password("ratsasi").roles("USER").build();
		UserDetails myUser2=User.withDefaultPasswordEncoder().username("prabakaran").
				password("ravanan").roles("USER").build();
		
		Collection<UserDetails> myusers=Stream.of(myUser1,myUser2).toList();
		
		return new InMemoryUserDetailsManager(myusers);
	}
	
	@Bean
	public SecurityFilterChain prabakaran(HttpSecurity hp) throws Exception {
		hp.authorizeRequests().anyRequest().authenticated();
		hp.csrf().disable();
		hp.httpBasic();
		hp.formLogin();
		return hp.build();
	}
}

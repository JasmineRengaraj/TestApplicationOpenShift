package com.openshifttest.TestApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestApplication {
@GetMapping("/")
	public String welcome(){
	return "welcome to openshift";
}

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}

}

package in.hcl.amar.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@CrossOrigin(origins = "*", allowedHeaders="*")
@Controller
public class LoginController {

	@CrossOrigin(origins = "http://localhost:4200",  allowedHeaders = "*")
	@GetMapping("/login")
	public void login() {
		System.out.println("Hello World!");
	}
}

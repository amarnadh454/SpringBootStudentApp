package in.hcl.amar.rest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.hcl.amar.config.AuthenticationBean;

@RestController
@RequestMapping("/api/v1")
public class BasicAuthController {

	@CrossOrigin(origins = "http://localhost:4200",  allowedHeaders = "*")
    @GetMapping(path = "/basicauth")
    public AuthenticationBean basicauth() {
        return new AuthenticationBean("You are authenticated");
    }
}

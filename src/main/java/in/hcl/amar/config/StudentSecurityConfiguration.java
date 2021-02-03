package in.hcl.amar.config;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
@Configuration
@EnableWebSecurity
public class StudentSecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	@Autowired
    CustomAuthenticationProvider customAuthProvider;
	
	@Autowired
	private BCryptPasswordEncoder pwdEncoder;
	
	//authentication
	 @Override 
	 protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	
		 auth.authenticationProvider(customAuthProvider);
    
		 auth.inMemoryAuthentication()
        .withUser("student")
        .password(pwdEncoder.encode("password"))
        .roles("USER");
    
	}
	 
	 
	 @Override
	    protected void configure(HttpSecurity http) throws Exception {
	        http.httpBasic()
	            .and()
	            .authorizeRequests()
	            .antMatchers("/api/**")
	            .authenticated();
	        
	        http.cors().configurationSource(corsConfigurationSource());
	        http.csrf().disable();
	    }
	    
	    CorsConfigurationSource corsConfigurationSource() {
	        CorsConfiguration configuration = new CorsConfiguration();
	        List<String> allowOrigins = Arrays.asList("*");
	        configuration.setAllowedOrigins(allowOrigins);
	        configuration.setAllowedMethods(Collections.singletonList("*"));
	        configuration.setAllowedHeaders(Collections.singletonList("*"));
	        //if authentication is enabled this flag MUST be set, or CORS requests will fail
	        configuration.setAllowCredentials(true);
	        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
	        source.registerCorsConfiguration("/**", configuration);
	        return source;
	    }
	}

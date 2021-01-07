package in.hcl.amar.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

public class StudentSecurityConfiguration extends WebSecurityConfigurerAdapter {
	/*
	 * 
	 * 
	 * //authentication
	 * 
	 * @Override protected void configure(AuthenticationManagerBuilder auth) throws
	 * Exception {
	 * 
	 * auth.inMemoryAuthentication().withUser("admin").password("{noop}admin").
	 * authorities("ADMIN");
	 * auth.inMemoryAuthentication().withUser("student").password("{noop}student").
	 * authorities("STUDENT");
	 * 
	 * 
	 * }
	 * 
	 * //authorization
	 * 
	 * @Override protected void configure(HttpSecurity http) throws Exception {
	 * 
	 * 
	 * http.authorizeRequests()
	 * 
	 * .antMatchers("/home").permitAll() .antMatchers("/save").hasAuthority("ADMIN")
	 * .antMatchers("/all").hasAuthority("ADMIN")
	 * .antMatchers("/remove/{id}").hasAuthority("ADMIN")
	 * .antMatchers("/modify/{id}").hasAuthority("ADMIN")
	 * .antMatchers("/one/{id}").hasAnyAuthority("ADMIN","STUDENT")
	 * .anyRequest().authenticated()
	 * 
	 * 
	 * .and() .formLogin() .defaultSuccessUrl("/welcome", true)
	 * 
	 * 
	 * .and() .logout() .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
	 * 
	 * 
	 * .and() .exceptionHandling() .accessDeniedPage("/denied")
	 * 
	 * .and().httpBasic() ;
	 * 
	 * }
	 * 
	 * 
	 */}

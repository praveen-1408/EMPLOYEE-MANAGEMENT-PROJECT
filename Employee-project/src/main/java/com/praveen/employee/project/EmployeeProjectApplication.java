package com.praveen.employee.project;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.praveen.employee.project.model.AppUser;
import com.praveen.employee.project.model.Role;
import com.praveen.employee.project.service.UserService;



@SpringBootApplication
public class EmployeeProjectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeProjectApplication.class, args);
	}

    @Autowired
    private BCryptPasswordEncoder encoder;

    @Autowired
    private UserService userService;

    @Override
    public void run(String... arg0) {
        //Remove or comment this part after first execution of application,
        //or else duplicate data will be inserted in the database
		/*AppUser admin = new AppUser();
		admin.setActive(true);
		admin.setPassword(encoder.encode("password"));
		admin.setUsername("admin");
		admin.setRoles(Arrays.asList(new Role("ADMIN")));
		userService.saveUser(admin);

		AppUser user = new AppUser();
		user.setActive(true);
		user.setPassword(encoder.encode("password"));
		user.setUsername("user");
		user.setRoles(Arrays.asList(new Role("USER")));
		userService.saveUser(user);
*/

    }
    

}

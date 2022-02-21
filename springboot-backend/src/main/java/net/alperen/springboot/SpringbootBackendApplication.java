package net.alperen.springboot;

import net.alperen.springboot.model.Employee;
import net.alperen.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		//Employee employee = new Employee();
		//employee.setFirstName("Alperen");
		//employee.setLastName("Akgün");
		//employee.setEmailId("alperenakgun010@gmail.com");
		//employeeRepository.save(employee);

		//Employee employee1 = new Employee();
		//employee1.setFirstName("Elon");
		//employee1.setLastName("Musk");
		//employee1.setEmailId("elonmusk@gmail.com");
		//employeeRepository.save(employee1);

	}
}

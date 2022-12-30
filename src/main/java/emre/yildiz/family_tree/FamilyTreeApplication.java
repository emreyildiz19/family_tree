package emre.yildiz.family_tree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class FamilyTreeApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(FamilyTreeApplication.class);
		app.setDefaultProperties(Collections
				.singletonMap("server.port", "8083"));
		app.run(args);
	}

}

package sk.dominanz.kontaktnyFormular;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class KontaktnyFormularApplication {

	public static void main(String[] args) {
		SpringApplication.run(KontaktnyFormularApplication.class, args);
	}

}

package motoboyofficiall.br;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
//@EntityScan(basePackages = "motoboyofficiall.br.entities")
@EnableJpaRepositories(basePackages = {"motoboyofficiall.br.repository"})
//@EnableTransactionManagement


public class MotoboyofficiallApplication {

	public static void main(String[] args) {
		SpringApplication.run(MotoboyofficiallApplication.class, args);
	}

}

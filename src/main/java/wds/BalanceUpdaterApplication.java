package wds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration()
@ComponentScan({"wds.service","wds.controller","wds.exception"})
@EnableJpaRepositories({"wds.repository"})
@EntityScan("wds.beans")
public class BalanceUpdaterApplication {

	public static void main(String[] args) {

		SpringApplication.run(BalanceUpdaterApplication.class, args);

	}

}

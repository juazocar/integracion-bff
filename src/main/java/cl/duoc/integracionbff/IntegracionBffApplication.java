package cl.duoc.integracionbff;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class IntegracionBffApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntegracionBffApplication.class, args);
	}

}

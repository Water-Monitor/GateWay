package watermonitor.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GatewayApplication {
//	@Bean
//	public ForwardedHeaderTransformer forwardedHeaderTransformer() {
//		return new ForwardedHeaderTransformer();
//	}

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}
}

package in.ksrt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		int i=10;
		int j=23;
		int c=i+j;
		
		System.out.println("sum :" + c);

	}

}

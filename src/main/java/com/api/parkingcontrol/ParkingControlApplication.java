package com.api.parkingcontrol;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ParkingControlApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ParkingControlApplication.class, args);

		System.out.println("\n\n\n\n"+ new BCryptPasswordEncoder().encode("admin") );
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("hello");
	}

}

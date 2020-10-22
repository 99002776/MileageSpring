package com.lts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.lts.mileage.VehicleDetails;

@SpringBootApplication
public class MileageApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(MileageApplication.class, args);
		
	}
	@Autowired
	ApplicationContext context;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		VehicleDetails vd=context.getBean(VehicleDetails.class);
		vd.getMileage("car");
		
	}

}

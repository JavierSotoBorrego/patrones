package com.nttdata.patronesdis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import Persona.Persona;
import singleton.Coche;

@SpringBootApplication
public class PatronesDis1Application {

	public static void main(String[] args) {
		SpringApplication.run(PatronesDis1Application.class, args);
		//SINGLETON
		Coche coche = Coche.getCoche("SEAT");
		System.out.println(coche.getmarca());
		//PROTOTYPE
		
		//BUILDER
		
	}

}

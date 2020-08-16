package com.example.demo;

import com.example.demo.dto.CarroDTO;
import com.example.demo.service.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	@Autowired
	CarroService carroService;

	@GetMapping("/carro")
	public CarroDTO carro(@RequestParam(value = "id") Integer id, @RequestParam(value= "cor") String cor) {

		return carroService.getCarro(id , cor);
	}

}

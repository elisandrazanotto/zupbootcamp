package com.example.demo.service;

import com.example.demo.dto.CarroDTO;
import org.springframework.stereotype.Component;

@Component
public class CarroService {

    public CarroDTO getCarro(Integer id, String cor) {

        CarroDTO fusca = new CarroDTO();

        fusca.setId(01);
        fusca.setModelo("Fusca 1968");
        fusca.setPlaca("ABC-1234");
        fusca.setCor("branco");

        CarroDTO ferrari = new CarroDTO();

        ferrari.setId(02);
        ferrari.setModelo("Ferrari 2020");
        ferrari.setPlaca("CBA-4321");
        ferrari.setCor("vermelho");

        CarroDTO carro = new CarroDTO();

        if(id.equals(01) || cor.equals("branco")) {
            carro = fusca;
        } else if(id.equals(02) || cor.equals("vermelho")) {
            carro = ferrari;
        }

        return carro;
    }
}

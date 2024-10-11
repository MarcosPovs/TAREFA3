package com.example.tarefa3;

import java.util.ArrayList;
import java.util.List;

public class CarrosRepository {

    private static final List<Carros> carros = new ArrayList<>();

    public static void adicionar(Carros carro) {
        carros.add(carro);
    }

    public static List<Carros> getCarros() {
        return new ArrayList<>(carros);
    }
}


package com.example.tarefa3;

import java.util.ArrayList;
import java.util.List;

public class AnimaisRepository {

    private static final List<Animais> animais = new ArrayList<>();

    public static void adicionar(Animais animal) {
        animais.add(animal);
    }

    public static List<Animais> getAnimais() {
        return new ArrayList<>(animais);
    }
}


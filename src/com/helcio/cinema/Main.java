package com.helcio.cinema;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Sessao> sessoes = new ArrayList<>();
        Sessao sessao14 = new Sessao(0L, 0L, 14, 16);
        sessoes.add(sessao14);

	    Cinema cineCatartas = new Cinema(0L, "Cine Cataratas", 14, 22, sessoes);
        System.out.println(cineCatartas);

        System.out.println(cineCatartas.getSessoes().get(0));
    }
}

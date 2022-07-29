package br.com;

import br.com.Model.Gato;
import br.com.Model.Livro;

public class Dio {
    public static void main(String[] args) {/*
        int a = 5;
        int b = 3;

        System.out.println("hello world!" + (a+b));*/
        Gato gato = new Gato();
        Livro livro = new Livro("O problema dos 3 corpos", 300);
        System.out.println(livro);
}
}
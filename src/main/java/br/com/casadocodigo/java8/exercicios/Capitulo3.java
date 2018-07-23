package br.com.casadocodigo.java8.exemplos.exercicios;

import br.com.casadocodigo.java8.exemplos.Usuario;

import java.util.Arrays;
import java.util.List;

public class Capitulo3 {

    public static void main(String ... args) {
//        Forma 1
        Runnable r = new Runnable(){
            public void run(){
                for (int i = 0; i <= 10; i++) {
                    System.out.println(i);
                }
            }
        };
        new Thread(r).start();

//        Forma 2
        Runnable r2 = () -> {
            for (int i = 0; i <= 10; i++) {
                System.out.println(i);
            }
        };
        new Thread(r2).start();

//        Forma 3
        new Thread(() -> {
            for (int i = 0; i <= 10; i++) {
                System.out.println(i);
            }
        }).start();

//        Validator
        Validador<String> validadorCEP = new Validador<String>() {
            public boolean valida(String valor) {
                return valor.matches("[0-9]{5}-[0-9]{3}");
            }
        };

        Validador<String> validadorCEP2 =
            valor -> {
                return valor.matches("[0-9]{5}-[0-9]{3}");
            };

        Validador<String> validadorCEP3 =
                valor -> valor.matches("[0-9]{5}-[0-9]{3}");

        boolean valida = validadorCEP3.valida("04101-300");
////        Listas
//        Usuario u1 = new Usuario("Paulo Silveira", 150);
//        Usuario u2 = new Usuario("Rodrigo Turini", 120);
//        Usuario u3 = new Usuario("Guilherme Silveira", 190);
//
//        List<Usuario> usuarios = Arrays.asList(u1, u2, u3);
//
//        usuarios.com
    }



}

package br.com.casadocodigo.java8.exemplos.exercicios;

@FunctionalInterface
interface Validador<T> {
    boolean valida(T t);
}
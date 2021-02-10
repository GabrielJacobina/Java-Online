package br.com.abc.javacore.ZZAGenerics.test;

import br.com.abc.javacore.ZZAGenerics.classes.Carro;
import br.com.abc.javacore.ZZAGenerics.classes.Computador;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTeste {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>();
        carrosDisponiveis.add(new Carro("Gol"));
        carrosDisponiveis.add(new Carro("BMW"));
        ObjetosAlugaveis<Carro> carroAlugavel = new ObjetosAlugaveis<>(carrosDisponiveis);
        Carro carro = carroAlugavel.getObjetosDisponivel();
        System.out.println("Usando o carro por um mes");
        carroAlugavel.devolverObjeto(carro);
        System.out.println("  --------------------------");

        List<Computador> computadoresDisponiveis = new ArrayList<>();
        computadoresDisponiveis.add(new Computador("Alianware"));
        computadoresDisponiveis.add(new Computador("HP"));
        ObjetosAlugaveis<Computador> computadorAlugavel = new ObjetosAlugaveis<>(computadoresDisponiveis);
        Computador computador = computadorAlugavel.getObjetosDisponivel();
        System.out.println("Usando computador");
        computadorAlugavel.devolverObjeto(computador);
    }
}

//Type
class ObjetosAlugaveis<T> {
    private List<T> objetosDisponiveis = new ArrayList<>();

    public ObjetosAlugaveis(List<T> objetosDisponiveis) {
        this.objetosDisponiveis = objetosDisponiveis;
    }
    // Alugar
    public T getObjetosDisponivel() {
        T t = objetosDisponiveis.remove(0);
        System.out.println("Alugando Objeto: "+t);
        System.out.println("Objetos disponiveis: " + objetosDisponiveis);
        return t;
    }

    public void devolverObjeto(T t) {
        System.out.println("Devolvendo objeto: "+t);
        objetosDisponiveis.add(t);
        System.out.println("Objetos disponiveis: " + objetosDisponiveis);
    }
}

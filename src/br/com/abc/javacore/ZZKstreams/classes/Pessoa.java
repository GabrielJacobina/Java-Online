package br.com.abc.javacore.ZZKstreams.classes;

import java.util.List;
import java.util.Objects;

import static java.util.Arrays.asList;

public class Pessoa {

    private String nome;
    private int idade;
    private double salario;

    public Pessoa(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public static List<Pessoa> bancoDePessoas()  {
        return asList(
                new Pessoa("William Suane", 22, 2000),
                new Pessoa("Mercy", 22, 3500),
                new Pessoa("Mercy", 22, 3500),
                new Pessoa("Ana", 19, 1895),
                new Pessoa("Thor", 23, 1980),
                new Pessoa("Hulk", 35, 8000),
                new Pessoa("Flash", 29, 3200),
                new Pessoa("Batman", 37, 10000),
                new Pessoa("Lanterna Verde", 24, 5000)
        );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return idade == pessoa.idade && Double.compare(pessoa.salario, salario) == 0 && Objects.equals(nome, pessoa.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

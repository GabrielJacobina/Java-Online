package br.com.abc.javacore.ZZFpadrosdeprojeto.test;

import br.com.abc.javacore.ZZFpadrosdeprojeto.classes.Pessoa;

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa p = new Pessoa.PessoaBuilder("William")
//                .nome("William")
                .nomeDoMeio("Suane")
                .ultimoNome("Queiroz")
                .nomeDoPai("William")
                .apelido("JirayaBolado")
                .build();

        System.out.println(p);
    }
}

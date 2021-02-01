package br.com.abc.javacore.Oexception.checkedexception.test;

import br.com.abc.javacore.Oexception.checkedexception.classes.Funcionario;
import br.com.abc.javacore.Oexception.checkedexception.classes.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionsTest {
    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        Pessoa p = new Pessoa();

        try {
            f.salvar();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

package br.com.abc.javacore.ZZFpadrosdeprojeto.test;

import br.com.abc.javacore.ZZFpadrosdeprojeto.classes.AviaoSingletonEnum;

public class AviaoSingletonEnumTest {
    public static void main(String[] args) {
        AviaoSingletonEnum.agendarAssento("1A");
        AviaoSingletonEnum.agendarAssento("1A");
    }
}

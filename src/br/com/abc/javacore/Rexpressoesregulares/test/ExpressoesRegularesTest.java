package br.com.abc.javacore.Rexpressoesregulares.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegularesTest {
    public static void main(String[] args) {
        // \d - todos os digitos
        // \D - tudo o que não for digito
        // \s - espaços em branco \t \n \f \r
        // \S - caracter que não é branco
        // \w - caracteres de palavras a-z A-Z, digitos e _
        // \W - tudo o que não for caractere de palavra
        // []
        // ? - zero ou uma
        // * - zero ou mais
        // + - uma ou mais
        // {n,m} - de n ate m
        // ( )
        // |
        // $
        // . coringa - ex: 1.3 = 123, 133, 1A3, 1#3, 1 3
//        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
//        String texto = "12 0x 0X 0x01FFABC 0x10G 0x1 ";
//        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";   // ([\\w\\.])+@([a-zA-Z])+(\.([a-zA-Z])+)+
//        String texto = "fulano@hotmail.com, 102Abc@gmail.com, 3@!abrao@mail.br, teste@gmail.com.br, teste@mail";

        String regex = "\\d{2}/\\d{2}/\\d{2,4}";   // dd/MM/yyyy
        String texto = "05/10/2010 05/05/2015 1/1/01 01/05/95";


        System.out.println("Email valido? " +"3@!abrao@mail.br".matches(regex));
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto:  "+texto);
        System.out.println("indice: 012345678901234567");
        System.out.println("expressao: "+matcher.pattern());
        System.out.println("posicoes encontradas");
        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group());
        }
    }
}

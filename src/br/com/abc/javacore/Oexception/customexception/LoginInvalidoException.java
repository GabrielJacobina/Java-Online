package br.com.abc.javacore.Oexception.customexception;

public class LoginInvalidoException extends Exception {

    public LoginInvalidoException() {
        super("Usuário ou senha inválidos");
    }
}

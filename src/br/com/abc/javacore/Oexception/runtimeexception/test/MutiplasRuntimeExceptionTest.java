package br.com.abc.javacore.Oexception.runtimeexception.test;

import java.awt.*;
import java.io.IOException;
import java.sql.SQLException;

public class MutiplasRuntimeExceptionTest {
    public static void main(String[] args) {
        try {
            throw new IndexOutOfBoundsException();
        } catch (IllegalArgumentException | IndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("dentro do ArrayIndexOutOfBoundsException");
        }
        System.out.println("final do programa");

        /**
         * Multi-catch no Java 7
         */
        try {
            talvezLanceException();
        } catch (Exception e) {
        }
    }

    private static void talvezLanceException() throws SQLException, AWTException, IOException {

    }
}

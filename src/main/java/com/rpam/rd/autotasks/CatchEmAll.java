package com.rpam.rd.autotasks;

import java.io.FileNotFoundException;
import java.io.IOException;

public class CatchEmAll {

    public static final String RESOURCE_IS_MISSING = "Resource is missing";
    public static final String RESOURCE_ERROR = "Resource error";
    public static Exception exception = new FileNotFoundException();

    public static void riskyMethod() throws Exception {
        throw exception;
    }

    public static void main(String[] args) throws Exception {
        try {
            riskyMethod();
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException(RESOURCE_IS_MISSING, e);
        } catch (IOException e) {
            throw new IllegalArgumentException(RESOURCE_ERROR, e);
        } catch (ArithmeticException | NumberFormatException e) {
            System.err.print(e.getMessage());
        }

    }
}

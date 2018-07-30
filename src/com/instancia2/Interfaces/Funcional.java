package com.instancia2.Interfaces;

public class Funcional implements IFuncional {


    @Override
    public String test(String mensaje) {

        return String.format("Hola %s estás en la clase de Java",mensaje);
    }

    @Override
    public String test2() {
        return null;
    }
}

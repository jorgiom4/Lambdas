package com.instancia2.Interfaces;


/**
 * Tiene que tener un unico método sin definir, puede tener mas métodos pero solo uno sin definir
 * Por defecto puede tener un método o mas de uno default
 */
@FunctionalInterface
public interface IFuncional {

    public  String test(String mensaje);

    default String test2(){
        return null;
    }
}

package com.instancia2;

import com.instancia2.Interfaces.Funcional;
import com.instancia2.Interfaces.IFuncional;

import java.io.File;

public class Main {

    public static void main(String[] args) {

        Funcional funcional = new Funcional();
        String texto = funcional.test("Gorka");
        System.out.println(texto);

        //Con Lambdas definimos la logica del mátodo cuando lo usamos
        IFuncional fi = mensaje -> String.format("Hola %s estas en el curso de Java", mensaje);
        String resp = fi.test("Gustavo");

        System.out.println(resp);

        fi = mensaje -> String.format("Hola %s estás en el curso de java",mensaje.toUpperCase());
        String resp1 = fi.test("Juan");
        System.out.println(resp1);

        fi = mensaje -> {
            if(mensaje.contains("@")){
                File f = new File("hola.txt");
            }else{
                String texto1 = "";
            }
            return "Hola";
        };

    }
}

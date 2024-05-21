package org.example.helpers.validaciones;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PanelValidacion {

    public boolean validarAutonomia(Double autonomia) throws Exception{

        //solo numeros
        String regex = "^[0-9]+$";
        String autonomiaCadena=String.valueOf(autonomia);
        Pattern patron = Pattern.compile(regex);
        Matcher coincidencia= patron.matcher(autonomiaCadena);
        if(!coincidencia.matches()){
            throw new Exception("solo se aceptan numeros revisa por favor");
        }

        //no negativos
        if(autonomia<0.0){
            throw new Exception("error el numero no puede ser negativo");
        }

        //numero maximo 30.0
        if(autonomia>30.0){
            throw new Exception("error el numero no puede ser mayor de 30");
        }

        return true;
    }

    public boolean validarCapacidad(Double capacidad)throws Exception{}

    public boolean validarTamano(String tamano)throws Exception{}

    public boolean validarFabricante(String fabricante)throws Exception{}

}

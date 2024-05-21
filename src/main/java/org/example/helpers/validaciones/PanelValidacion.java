package org.example.helpers.validaciones;

import org.example.helpers.generals.General;
import org.example.helpers.generals.Mensaje;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PanelValidacion {

    private General general = new General();

    public boolean validarAutonomia(Double autonomia) throws Exception{
        //solo numeros
        String regex = "^[0-9]+$";
        if(!this.general.validarRegex(regex,String.valueOf(autonomia))){
            throw new Exception(Mensaje.AUTONOMIA_FORMATO.getMensaje());
        }

        //no negativos
        if(autonomia<0.0){
            throw new Exception(Mensaje.AUTONOMIA_NEGATIVA.getMensaje());
        }

        //numero maximo 30.0
        if(autonomia>30.0){
            throw new Exception(Mensaje.AUTONOMIA_MUY_GRANDE.getMensaje());
        }

        return true;
    }

    public boolean validarCapacidad(Double capacidad)throws Exception{}

    public boolean validarTamano(String tamano)throws Exception{}

    public boolean validarFabricante(String fabricante)throws Exception{}

}

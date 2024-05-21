package org.example.helpers.generals;

public enum Mensaje {

    AUTONOMIA_NEGATIVA("No se pemriten negativos"),
    AUTONOMIA_MUY_GRANDE("Valor muy grande"),
    AUTONOMIA_FORMATO("fORMATO INVALIDO")

    ;

    private String mensaje;

    Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }
}

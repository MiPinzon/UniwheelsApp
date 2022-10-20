package com.uniwheelsapp.uniwheelsapp;

public class ElementsCardDriver {
    public String color;
    public String dia;
    public String cupos;
    public String salida;
    public String hora;
    public String destino;

    public ElementsCardDriver(String color, String dia, String cupos, String salida, String hora, String destino) {
        this.color = color;
        this.dia = dia;
        this.cupos = cupos;
        this.salida = salida;
        this.hora = hora;
        this.destino = destino;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getCupos() {
        return cupos;
    }

    public void setCupos(String cupos) {
        this.cupos = cupos;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
}

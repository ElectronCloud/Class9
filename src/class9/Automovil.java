/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class9;

/**
 *
 * @author Estudiante
 */
public class Automovil {
    private String marca;
    private int anio;
    private String modelo;
    private Llanta[] llanta;
    private Puerta[] puerta;
    private Motor motor;
    
    
    public Automovil(String marca, int anio, String modelo) {
        this.marca = marca;
        this.anio = anio;
        this.modelo = modelo;
        this.llanta=new Llanta[4];
        this.puerta=new Puerta[5];
    }

    public Automovil(String marca, int anio, String modelo, Llanta[] llanta, Puerta[] puerta, Motor motor) {
        this.marca = marca;
        this.anio = anio;
        this.modelo = modelo;
        this.llanta = llanta;
        this.puerta = puerta;
        this.motor = motor;
    }

    public Llanta[] getLlanta() {
        return llanta;
    }

    public void setLlanta(Llanta[] llanta) {
        this.llanta = llanta;
    }

    public Puerta[] getPuerta() {
        return puerta;
    }

    public void setPuerta(Puerta[] puerta) {
        this.puerta = puerta;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    
    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
}

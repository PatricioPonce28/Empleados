package org.example;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Empleados {
    private String nombre;
    private int edad;
    private double salario;

    public Empleados(String nombre, int edad, double salario){
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Empleados(){
    }

    public void Imprimir(){
        System.out.println("El nombre del empleado es: " + nombre);
        System.out.println("La edad del empleado es: " + edad);
        System.out.println("Su salario es de: " + salario + " dólares");
        System.out.println("--------------------------------------");
    }
}

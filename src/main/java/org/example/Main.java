package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Empleado con Datos quemados
        Empleados e1 = new Empleados("Juan", 22,420.00);

        e1.Imprimir();

        // Empleado con Scanner para realizar el deber
        Empleados e2 = new Empleados();

        System.out.println("Ingrese el nombre del empleado: ");
        e2.setNombre(input.nextLine());

        System.out.println("Ingrese la edad  del empleado: ");
        e2.setEdad(input.nextInt());
        input.nextLine();

        System.out.println("Ingrese el salario del empleado: ");
        e2.setSalario(input.nextDouble());

        e2.Imprimir();
    }
}
package com.mascotas.demo;
import java.util.Scanner;
public class mascotas {
    registro opcio = new registro();

    int nuevoValor;
    private String nombre;
    private int documentoMas;
    private String dueño;
    private String raza;
    private String color;



    mascotas(String nombre, int documentoMas, String dueño, String raza, String color) {

        this.nombre = nombre;
        this.documentoMas = documentoMas;
        this.dueño = dueño;
        this.raza = raza;
        this.color = color;
    }

    mascotas() {

    }


    public void getOpcion() {
        Scanner op = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("\n MENU DE OPCIONES");
            System.out.println("\n[1] AGREGAR DATOS MASCOTAS");
            System.out.println("\n[2] BUSCAR");
            System.out.println("\n[3] MODIFICAR");
            System.out.println("\n[4] ELIMINAR");
            System.out.println("\n[5] MOSTRAR");
            System.out.println("\n[6] SALIR");
            System.out.println("\nIngresar opcion: ");
            opcion = op.nextInt();

            switch (opcion) {
                case 1:
                    opcio.getAgregar(nombre, documentoMas, dueño, raza, color);
                    opcio.getVisualizar_mas();
                    break;

                case 2:
                    opcio.getBuscar(documentoMas);
                    break;

                case 3:
                    opcio.modificar(nombre, documentoMas, dueño, raza, color);
                    break;

                case 4:
                    opcio.EliminarDatos(documentoMas);
                    break;

                case 5:
                    opcio.Buscar_Omar();
                    break;
            }

        } while (opcion != 7);
    }

    public registro getOpcio() {
        return opcio;
    }

    public void setOpcio(registro opcio) {
        this.opcio = opcio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumentoMas() {
        return documentoMas;
    }

    public void setDocumentoMas(int documentoMas) {
        this.documentoMas = documentoMas;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}

package com.mascotas.demo;

import java.util.ArrayList;
import java.util.Scanner;
public class registro {
    private ArrayList <mascotas> mascota;
    Scanner op = new Scanner(System.in);

    public registro() {

        mascota = new ArrayList<>();

    }


    //agregar-----------------------------------------------------------------------------------------
    public void getAgregar(String nombre, int documentoMas, String dueño, String raza, String color) {

        System.out.print("Ingresar nombre Mascota: ");
        nombre = op.next();

        System.out.print("\n ingresar N.I: ");
        documentoMas = op.nextInt();

        System.out.print("Ingresar nombre del dueño o encargado: ");
        dueño = op.next();

        System.out.print("\n ingresar raza: ");
        raza = op.next();

        System.out.print("\n ingresar Color: ");
        color = op.next();

        mascotas nueva = new mascotas(nombre, documentoMas, dueño, raza, color);
        mascota.add(nueva);

        System.out.println("Los datos se guardaron exitosamente!!! ");

    }

    public void getVisualizar_mas(){
        for(int i =0; i<mascota.size(); i++){
            System.out.println(mascota.size());
        }
    }

    //buscar---------------------------------------------------------------------------------------

    public void getBuscar(int documentoMas) {
        System.out.println("Ingresa el codigo de identificacion de la mascota: ");
        documentoMas = op.nextInt();

        for (int i = 0; i < mascota.size(); i++)
        {
            if (documentoMas == mascota.get(i).getDocumentoMas())
            {

                if (documentoMas >= 0)
                {

                    System.out.println("Este dato si se ajusta a la busqueda");

                } else
                {

                    System.out.println("Dato no se encuentra");}
            } } }


    //modificar----------------------------------------------------------------------------------
    public void modificar(String nombre, int documentoMas, String dueño, String raza, String color) {

        System.out.print("Ingresar nombre Mascota: ");
        nombre = op.next();

        System.out.print("\n ingresar N.I: ");
        documentoMas = op.nextInt();

        System.out.print("Ingresar nombre del dueño o encargado: ");
        dueño = op.next();

        System.out.print("\n ingresar raza: ");
        raza = op.next();

        System.out.print("\n ingresar Color: ");
        color = op.next();

        mascotas elementoNuevo = new mascotas(nombre, documentoMas, dueño, raza, color);
        mascota.set(documentoMas, elementoNuevo);

    }
    //Eliminar---------------------------------------------------------------------------
    public void EliminarDatos(int documentoMas) {
        System.out.println("Ingresa el dato que quiere eliminar: : ");
        documentoMas = op.nextInt();

        for (int i = 0; i < mascota.size(); i++)
        {
            if (documentoMas == mascota.get(i).getDocumentoMas())
            {

                mascota.remove(i);

            }

        }}
}

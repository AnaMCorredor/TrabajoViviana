package com.mascotas.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("\n --- BIENVENIDO A LA REGISTRADURIA PARA MASCOTAS ---");
		Scanner op = new Scanner(System.in);

		mascotas mas = new mascotas();
		registro opcio = new registro();
		int opcion = 0;



		do{
			System.out.println("\n MENU DE OPCIONES");
			System.out.println("\n[1] Registro Mascotas");
			System.out.println("\n[2] SALIR");
			System.out.println("\nIngresar opcion: ");
			opcion = op.nextInt();

			switch(opcion){
				case 1:
					mas.getOpcion();
					break;

			}

		}while(opcion !=2);}
	}



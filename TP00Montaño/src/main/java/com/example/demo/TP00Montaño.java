package com.example.demo;

import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class TP00Montaño extends moduloinicial {

		// TODO Auto-generated method stub
	public void menu() {
		System.out.println("Menu Calculadora");
		System.out.println("1) Suma:");
		System.out.println("2) Resta:");
		System.out.println("3) Multiplicacion:");
		System.out.println("4) Division");
		System.out.println("5) Potencia:");
		System.out.println("6) Raiz:");
		System.out.println("7) Salir:");
	}
	public void suma() {
		Scanner leer = new Scanner (System.in);
		int n1, n2;
		System.out.println("Ingrese primer numero:");
		n1 = leer.nextInt();
		System.out.println("Ingrese segundo numero:");
		n2 = leer.nextInt();
		System.out.println("La suma es:"+sumas(n1, n2));
	}
	public int sumas (int num1, int num2) {
		int resultadosuma;
		resultadosuma = num1 + num2;
		return resultadosuma;
	}
	public void resta() {
		Scanner leer2 = new Scanner (System.in);
		int n1, n2;
		System.out.println("Ingrese primer numero:");
		n1 = leer2.nextInt();
		System.out.println("Ingrese segundo numero:");
		n2 = leer2.nextInt();
		System.out.println("La resta es:"+restas(n1, n2));
	}
	public int restas (int num1, int num2) {
		int resultadoresta;
		resultadoresta = num1 - num2;
		return resultadoresta;
	}
	public void multiplicacion() {
		Scanner leer = new Scanner (System.in);
		int n1, n2;
		System.out.println("Ingrese primer numero:");
		n1 = leer.nextInt();
		System.out.println("Ingrese segundo numero:");
		n2 = leer.nextInt();
		System.out.println("La multiplicacion es:"+multi(n1, n2));
	}
	public int multi (int num1, int num2) {
		int resultadomulti;
		resultadomulti = num1 * num2;
		return resultadomulti;
	}
	public void division() {
		Scanner leer = new Scanner (System.in);
		int n1, n2;
		System.out.println("Ingrese primer numero:");
		n1 = leer.nextInt();
		System.out.println("Ingrese segundo numero:");
		n2 = leer.nextInt();
		System.out.println("La division es:"+div(n1, n2));
	}
	public int div (int num1, int num2) {
		int resultadodiv;
		resultadodiv = num1 / num2;
		return resultadodiv;
	}
	public void raiz() {
		Scanner leer = new Scanner (System.in);
		int numero;
		System.out.println("Ingrese un numero:");
		numero = leer.nextInt();
		double resultadoraiz = Math.sqrt(numero);
		System.out.println("La raiz es:"+resultadoraiz);
		}
	public void potencia() {
		Scanner leer = new Scanner (System.in);
		int numero;
		System.out.println("Ingrese un numero:");
		numero = leer.nextInt();
		double resultadopot = Math.pow(numero, 2);
		System.out.println("La potencia es:"+resultadopot);
		}
		

}

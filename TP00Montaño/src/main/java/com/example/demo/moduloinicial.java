package com.example.demo;

import java.util.*;

public class moduloinicial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner (System.in);
		TP00Montaño cal = new TP00Montaño();
		int entrada = 0;
		cal.menu();
		entrada = leer.nextInt();
		switch(entrada) {
		case 1:
			cal.suma();
			break;
		case 2:
			cal.resta();
			break;
		case 3:
			cal.multiplicacion();
			break;
		case 4:
			cal.division();
			break;
		case 5:
			cal.potencia();
			break;
		case 6:
			cal.raiz();
			break;
		}

	}

}

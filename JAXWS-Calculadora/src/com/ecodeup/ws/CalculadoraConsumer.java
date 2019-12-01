package com.ecodeup.ws;

public class CalculadoraConsumer {

	public static void main(String[] args) {

		CalculadoraImplService calculadoraService = new CalculadoraImplService();

		Calculadora consumer = calculadoraService.getCalculadoraImplPort();
		System.out.println("Suma");
		System.out.println(consumer.operacion(1, 6, 4));
		
		System.out.println("Resta");
		System.out.println(consumer.operacion(2, 6, 4));

		
		System.out.println("Multiplicacion");
		System.out.println(consumer.operacion(3, 6, 4));

		
		System.out.println("Division");
		System.out.println(consumer.operacion(4, 10, 5));


	}

}

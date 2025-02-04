package com.dio.options;

import java.util.Optional;

public class ExemploOpitional {

	public static void main(String[] args) {
		Optional<String> optionalString = Optional.of("Valor opcional");
		
		System.out.println(optionalString.isPresent());
		System.out.println(optionalString.isEmpty());
		
		optionalString.ifPresent(System.out::println);
		
		optionalString.ifPresentOrElse(System.out::println,()->System.out.println("valor n�o est� presente"));
		
		if(optionalString.isPresent()) {
			String valor = optionalString.get();
			
			System.out.println(valor);
		}
		
		optionalString.map((valor)-> valor.concat("***")).ifPresent(System.out::println);
		optionalString.orElseThrow(IllegalStateException::new);

	}

}

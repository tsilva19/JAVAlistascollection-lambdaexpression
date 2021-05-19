package com.algaworks.lists;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Exemplo1 {
	
	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>();
		
		nomes.add("Jose");
		nomes.add("Maria");
		nomes.add("Joao");
		
		//for (int i = 0; i < nomes.size(); i++) {
		//	System.out.println("Nome: " +nomes.get(i));
		//}
		
		//for(String nome : nomes) {
		//System.out.println("Nome :" +nome);
		//}
		
		//nomes.remove(0);
		//nomes.remove("Joao");
		
		//System.out.println(nomes);
		
//		nomes.forEach(new Consumer<String>() {
//			
//			@Override
//		public void accept(String t) {
				// TODO Auto-generated method stub
				//System.out.println("---");
				//System.out.println(t);

			//}
		//});
		
		//Lambda expression
        nomes.forEach(nome -> {

				System.out.println("---");
				System.out.println(nome);

			
		});
		
	}

}

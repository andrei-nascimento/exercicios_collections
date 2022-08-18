package com.generation.exerciciocollections;

import java.util.ArrayList;

public class ExercicioCollections {

	public static void main(String[] args) {
		
		ArrayList<String> produtos = new ArrayList<String>();

		//Armazenar dados da List
		produtos.add("Shampoo Clear");
		produtos.add("Condicionador Elseve");
		produtos.add("Sabonete Palmolive");
		produtos.add("Absorvente Always");
		produtos.add("Perfume Paris Elysees");
		produtos.add("Hidratante Nivea");
		
		//Remover dados da List
		produtos.remove(produtos.indexOf("Hidratante Nivea"));
		System.out.println("\nRemovendo Hidratante Nivea do estoque");
		
		//Atualizar e Apresentar dados da List
		System.out.println("\nEstoque atualizado:" + produtos.toString());
		
	}

}

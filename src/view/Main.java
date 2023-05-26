package view;

import br.mari.arvoreint.Arvore;

public class Main {

	public static void main(String[] args) {
		int[] vetor = {7, 8, 3, 4, 2, 1, 6, 5};
		Arvore ar = new Arvore();
		for (int i : vetor) {
			ar.insert(i);
		}
		try {
			ar.remove(7);
			ar.remove(6);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			ar.prefixSearch();
			System.out.println();
			ar.infixSearch();
			System.out.println();
			ar.postfixSearch();
			System.out.println();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

package br.com.tiago.java.io.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TesteLeitura2 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new File("contas.csv"));
		
		while(sc.hasNextLine()) {
			String linha = sc.nextLine();
			System.out.println(linha);
		}
		
		sc.close();
	}

}

package br.com.tiago.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaMelhoradoPart1 {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("Lorem2.txt"));
		bw.write("Lorem ipsum dolor sit amet, consecte");
		bw.newLine();
		bw.write("Lorem ipsum");
		
		bw.close();
	}

}

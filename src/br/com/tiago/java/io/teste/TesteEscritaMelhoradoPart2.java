package br.com.tiago.java.io.teste;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

public class TesteEscritaMelhoradoPart2 {

	public static void main(String[] args) throws IOException {
		
		PrintStream ps = new PrintStream(new File("Lorem.txt"));
		
		ps.println("Lorem ipsum dolor sit amet, consecte");
		ps.println("Lorem ipsum dolor sit amet");
		
		ps.close();
	}

}
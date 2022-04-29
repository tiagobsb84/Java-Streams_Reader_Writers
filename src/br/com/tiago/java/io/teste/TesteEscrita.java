package br.com.tiago.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {
		OutputStream ops = new FileOutputStream("Lorem2.txt");
		Writer osw = new OutputStreamWriter(ops);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("Lorem ipsum dolor sit amet, consecte");
		bw.newLine();
		bw.newLine();
		bw.write("Lorem ipsum");
		
		bw.close();
	}

}

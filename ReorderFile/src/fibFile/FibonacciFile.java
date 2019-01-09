package fibFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FibonacciFile {
	//array onde vai ser armazenada as linhas do arquivo
	public static ArrayList<String> rowsFile = new ArrayList<String>();
	
	//endereço do arquivo lido
	public static final String FILENAME = "file.txt";
	
	public static int fibonacci(int n) {
		//caso base
		if(n < 2) {
			return n;
		}else {
			//recursao
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
		
	}
	
	public static void readFile(){
		//leitura do arquivo
		FileReader file;		
		
		try {
			
			file = new FileReader(FILENAME);

			BufferedReader buffer = new BufferedReader(file);
			
			String row = null;
			
			//enquanto tiver linhas no arquivo, adicione cada uma delas em um arrayList
			while((row = buffer.readLine()) != null) {
				rowsFile.add(row);
			}
			
			
			if(buffer!=null)
				buffer.close();
			if(file!= null)
				file.close();
				
		} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
			
	}
	
	public static void writeFile() {
		
		//array ordenado conforme a sequencia de fibonacci
		ArrayList<String> aux = orderFib();
		
		FileWriter file;
		
		try {
			
			file = new FileWriter(FILENAME);

			BufferedWriter buffer = new BufferedWriter(file);
			
			int tamanho = aux.size();
			//escreve no arquivo o arrayList com as linhas ordenadas
			for (int i = 0; i < tamanho; i++) {	
				if(i != tamanho - 1)
					buffer.write(aux.get(i) + "\n");
				else
					buffer.write(aux.get(i)); // caso seja a última linha, não pule para a próxima
											//evitando que a ultima linha do arquivo seja nula
			}
			
			
			if(buffer != null)
				buffer.close();
			if(file != null)
				file.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
	}
	
	public static ArrayList<String> orderFib(){
		
		ArrayList<String> aux = new ArrayList<String>();
		
		int tam = rowsFile.size();	
		
		
		for (int i = 0; i < tam; i++) {
			//seleciona o número de fibbonacci.
			int index = fibonacci(i);
			//inicialmente serão colocados no array apenas as linhas referentes a série de fibonacci
			if(index <= tam) {
				
				String str = rowsFile.get(index);
				
				//insere no array o conteúdo que ainda não foi inserido 
				if(str != "*")
					aux.add(str);
				//marca o conteúdo da posição que já foi inserida
				rowsFile.set(index, "*");
			}
		}	

		
		for(int i = 1; i < tam; i++) {

			String str = rowsFile.get(i);
			//inserir posteriormente as outras linhas que não fazem parte da série de fibonacci
			if(str != "*") {
				aux.add(str);				
			}
		}
		
		System.out.println(aux.toString());
		
		return aux;
		
	}
	
	
	public static void main(String[] args) {		
		//leitura do arquivo		
		readFile();		
		//escrita do arquivo	
		writeFile();		
		
	}

}

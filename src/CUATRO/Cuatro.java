package CUATRO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Cuatro {

	public static void main(String[] args) {
		directorio();
	}

	public static void directorio(){
		File directorio = new File("EjerciciosStreams/datos.txt");
        if(directorio.exists()){
            try(BufferedReader br = new BufferedReader(new FileReader(directorio))) {
            	String datos = br.readLine();
            	while (datos != null) {
            		System.out.println(datos);
            		datos = br.readLine();
            	}
                }
            catch (IOException e) {
            	e.printStackTrace();
            }
    
	}
}
}
package UNO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Uno {

	public static void main(String[] args) {
		
        File ejerciciossrteams = new File("EjerciciosStreams");
        if (ejerciciossrteams.exists()) {
        	
        }else {
        	ejerciciossrteams.mkdir();
        }
        try {
			FileWriter f1=new FileWriter("EjerciciosStreams/uno.txt");
			FileWriter f2=new FileWriter("EjerciciosStreams/dos.txt");
			FileWriter f3=new FileWriter("EjerciciosStreams/tres.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
}
}
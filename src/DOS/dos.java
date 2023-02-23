package DOS;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class dos {

	public static void main(String[] args) {
        File uno = new File("EjerciciosStreams/uno.txt");
        if(uno.exists()){
            try(FileWriter fw = new FileWriter(uno)) {
                for (int i = 0; i <= 10; i++) {
                    fw.write(String.valueOf(i));
                }
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
    
        }
    }
}
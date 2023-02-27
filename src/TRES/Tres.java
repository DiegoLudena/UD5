package TRES;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Tres {

	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		Triangulo triangulo = new Triangulo(0, 0);
    	try {
    	System.out.println("Introduce la base del triángulo");
     	triangulo.setBase(sc.nextDouble());
		while (triangulo.getBase() <=0) { //Evito negativos o 0
			System.out.println("Valor no valido. Indica un número positivo:");
			triangulo.setBase(sc.nextDouble());
			}
   
    	System.out.println("Introduce la altura del triángulo");
    	triangulo.setAltura(sc.nextDouble());   	
		
		while (triangulo.getAltura() <=0) { //Evito negativos o 0
			System.out.println("Valor no valido. Indica un número positivo:");
	    	triangulo.setAltura(sc.nextDouble()); 
			}
		System.out.println("El area del triángulo es "+ triangulo.calcularArea(triangulo.getBase(), triangulo.getAltura())+" cm2");
		
    	File dos = new File("EjerciciosStreams/dos.txt");
    	if(dos.exists()){
            try(FileWriter fw = new FileWriter(dos)) {
                fw.write("El área del triángulo es "+ triangulo.calcularArea(triangulo.getBase(), triangulo.getAltura())+" cm2");
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
    	
    }

    	} catch (InputMismatchException e){
			System.out.println("No has introducido un numero. \nPor favor introduce un numero");
    	}

	}
	
	
  
    static class Triangulo{
    	private double base;
    	private double altura;
    	private double area;
    	
    	public Triangulo (double base, double altura) {
    		this.base=base;
    		this.altura=altura;
    	}
    
    
	public double calcularArea(double base, double altura) {
		this.altura=altura;
		this.base=base;
		double area = (base*altura)/2;
		this.setArea(area);
		return area;
	}


	public double getBase() {
		return base;
	}


	public void setBase(double base) {
		this.base = base;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	public double getArea() {
		return area;
	}


	public void setArea(double area) {
		this.area = area;
	}
	
	
    }
}

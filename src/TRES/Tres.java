package TRES;

import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Tres {

	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		Triangulo triangulo = new Triangulo();
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

    	

    	} catch (InputMismatchException e){
			System.out.println("No has introducido un numero. \nPor favor introduce un numero");
    	}
		System.out.println(triangulo.calcularArea(triangulo.getBase(), triangulo.getAltura()));
/*    File dos = new File("EjerciciosStreams/dos.txt");
    	if(dos.exists()){
    	area
    }*/
	}
	
	
  
    public class Triangulo{
    	private double base;
    	private double altura;
    	
    	public Triangulo (double base, double altura) {
    		this.setBase(base);
    		this.setAltura(altura);
    	}
    
    
	public double calcularArea(double altura, double base) {
		this.altura=altura;
		this.base=base;
		double area = (base*altura)/2;
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
	
	
    }
}

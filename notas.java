package practica1;

import java.util.Scanner;
public class notas {
	
	/* Declaramos las variables que se necesitamos para 
	almacenar las notas de las unidades formativas y los acumulados.*/
	
	double unidadadFormativa1,unidadadFormativa2,unidadadFormativa3;
	
	
	double acumulado1, acumulado2, acumulado3, definitiva; // Acumulados y nota final.
	
	/* Utilizamos la variable "entrada" de tipo Scanner para permitir
	la entrada de datos por parte del usuario.*/
	
	Scanner entrada = new Scanner(System.in);
	
	// Método para ingresar las notas del estudiante.
	
	
	public void IngresaNotas() {
	
		System.out.println("ingrese las notas del estudiante");
		
		System.out.print("ingrese nota 1: ");
		
		unidadadFormativa1= entrada.nextDouble();

		System.out.print("ingrese nota 2: ");
		
		unidadadFormativa2= entrada.nextDouble();
		System.out.print("ingrese nota 3: ");
		
		unidadadFormativa3= entrada.nextDouble();	
	
	}
	
	// Método para comprobar la correcta introducción de las notas
	
	
	public void comprobacion(){
		
		if (unidadadFormativa1>10) {
			System.out.println(" nota1 introducida incorrectamente");
			
		}else {
			System.out.println(" nota1 correcta");
		}
		
		if (unidadadFormativa2>10) {
			System.out.println(" nota2 introducida incorrectamente");
			
		}else {
			System.out.println(" nota2 correcta");
		}
		if (unidadadFormativa3>10) {
			System.out.println(" nota3 introducida incorrectamente");
			
		}else {
			System.out.println(" nota3 correcta");
		}	
	}
	
	// Método para calcular los acumulados y la nota definitiva.
	
	
	public void Calculonotas() {
		acumulado1= unidadadFormativa1*0.35;
		acumulado2 = unidadadFormativa2 * 0.35;
		acumulado3 = unidadadFormativa3 * 0.30;
		
		definitiva = acumulado1 + acumulado2+ acumulado3;
	}
	
	
	public void Mostrar() {
		
		System.out.println(" Las notas introducidas son:");
		System.out.println(" nota1 = " + unidadadFormativa1);
		System.out.println(" nota2 = " + unidadadFormativa2);
		System.out.println(" nota3 = " + unidadadFormativa3);
		
		System.out.println(" acumulado 1 = "+ acumulado1);
		System.out.println(" acumulado 2 = "+ acumulado2);
		System.out.println(" acumulado 3 = "+ acumulado3);
		
		System.out.println(" La nota definitiva es = "+ definitiva);
	}

	
	public void aprobado() {

			if(definitiva<5 && definitiva>=0) {
				System.out.println("suspendio");
			}else {
				if (definitiva>=5 && definitiva<=10 ) {
				System.out.println("aprobado");
				}else {
					System.out.println(" error en la notas");
				}
			}
		}
		
		
	public static void main(String[] args) {
		// creamos mecanimos para llamar a cualquier metodo fuero de la clase
		notas fc= new notas();
		
		fc.IngresaNotas();
		
		fc.comprobacion();

		fc.Calculonotas();
		
		fc.Mostrar();
		
		fc.aprobado();
	}
}

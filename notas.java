package practica1;

import java.util.Scanner;

/**
 * La clase `notas` representa un sistema para calcular la nota final de un estudiante
 * basado en tres unidades formativas y sus acumulados.
 *
 * @author Yolanda Bernárdez
 */

/**
 * Nota de la primera unidad formativa.
 * @param uf1 La nota de la primera unidad formativa.
 */

public class notas {
	
	/* Declaramos las variables que se necesitamos para 
	almacenar las notas de las unidades formativas y los acumulados.*/
	
	double uf1;
	/**
	 * Nota de la primera unidad formativa.
	 * @param uf1 La nota de la primera unidad formativa.
	 */
	
	double uf2;
	/**
	 * Nota de la segunda unidad formativa.
	 * @param uf2 La nota de la segunda unidad formativa.
	 */
	
	double uf3;
	/**
	 * Nota de la tercera unidad formativa.
	 * @param uf3 La nota de la tercera unidad formativa.
	 */
	
	double acu1, acu2, acu3, def; // Acumulados y nota final.
	
	/* Utilizamos la variable "entrada" de tipo Scanner para permitir
	la entrada de datos por parte del usuario.*/
	
	Scanner entrada = new Scanner(System.in);
	
	// Método para ingresar las notas del estudiante.
	
	/**
     * Ingresa las notas del estudiante por teclado.
     *
     * @method
     * Pide al usuario que introduzca las notas de las tres unidades formativas.
     */
	
	public void IngresaNotas() {
	
		System.out.println("ingrese las notas del estudiante");
		
		System.out.print("ingrese nota 1: ");
		
		uf1= entrada.nextDouble();

		System.out.print("ingrese nota 2: ");
		
		uf2= entrada.nextDouble();
		System.out.print("ingrese nota 3: ");
		
		uf3= entrada.nextDouble();	
	
	}
	
	// Método para comprobar la correcta introducción de las notas
	
	/**
     * Comprueba si las notas introducidas son inferiores a 10).
     *
     * @method
     * Muestra un mensaje de error si alguna nota no es válida.
     */
	
	public void comprobacion(){
		
		if (uf1>10) {
			System.out.println(" nota1 introducida incorrectamente");
			
		}else {
			System.out.println(" nota1 correcta");
		}
		
		if (uf2>10) {
			System.out.println(" nota2 introducida incorrectamente");
			
		}else {
			System.out.println(" nota2 correcta");
		}
		if (uf3>10) {
			System.out.println(" nota3 introducida incorrectamente");
			
		}else {
			System.out.println(" nota3 correcta");
		}	
	}
	
	// Método para calcular los acumulados y la nota definitiva.
	
	/**
     * @method Calcula los acumulados y la nota definitiva del estudiante.
     */
	
	public void Calculonotas() {
		acu1= uf1*0.35;
		acu2 = uf2 * 0.35;
		acu3 = uf3 * 0.30;
		
		def = acu1 + acu2+ acu3;
	}
	
	/**
	 * Muestra las notas introducidas, los acumulados y la nota definitiva.
	 * @return Un mensaje indicando la nota definitiva.
	 */
	
	public void Mostrar() {
		
		System.out.println(" Las notas introducidas son:");
		System.out.println(" nota1 = " + uf1);
		System.out.println(" nota2 = " + uf2);
		System.out.println(" nota3 = " + uf3);
		
		System.out.println(" acumulado 1 = "+ acu1);
		System.out.println(" acumulado 2 = "+ acu2);
		System.out.println(" acumulado 3 = "+ acu3);
		
		System.out.println(" La nota definitiva es = "+ def);
	}

	
	/**
	 * Determina si el estudiante aprobó o suspendió.
	 * @return `true` si el estudiante aprobó, `false` si no.
	 */
	
	public void aprobado() {

			if(def<5 && def>=0) {
				System.out.println("suspendio");
			}else {
				if (def>=5 && def<=10 ) {
				System.out.println("aprobado");
				}else {
					System.out.println(" error en la notas");
				}
			}
		}
		
	/**
	 * Método principal que instancia un objeto de la clase `notas` y realiza los cálculos
	 * necesarios.
	 *
	 * @param args Los argumentos de la línea de comandos (no se utilizan en este caso).
	 */
		
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

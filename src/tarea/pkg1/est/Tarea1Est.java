
package tarea.pkg1.est;

import java.util.Random;


public class Tarea1Est {

 
    public static void main(String[] args) {
      int filas = 3;
    int columnas = 3;
    int[][] matrix = new int[filas][columnas];
    Random rand = new Random();
    
    // Llenar la matriz con números aleatorios
    for (int i = 0; i < filas; i++) {
      for (int j = 0; j < columnas; j++) {
        matrix[i][j] = rand.nextInt(10);
      }
    }
    
    // Mostrar la matriz
    System.out.println("Matriz generada:");
    for (int i = 0; i < filas; i++) {
      for (int j = 0; j < columnas; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
    
    // Sumar números en la diagonal 1
    int sum1 = 0;
    for (int i = 0; i < filas; i++) {
      sum1 += matrix[i][i];
    }
    
    // Sumar números en la diagonal 2
    int sum2 = 0;
    for (int i = 0; i < filas; i++) {
      sum2 += matrix[i][filas-i-1];
    }
    
    // Mostrar resultados
    System.out.println("La suma de los números en la diagonal 1 es: " + sum1);
    System.out.println("La suma de los números en la diagonal 2 es: " + sum2);
  }
      
}

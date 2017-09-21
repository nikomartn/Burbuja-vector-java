/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmoburbuja;

/**
 *
 * @author nikomartn
 */
public class AlgoritmoBurbuja {

  /**
   * Constantes para definir el comportamiento del método
   */
  static final int DIMENSION_INICIAL = 0;
  static final int DIMENSION_FINAL = 10001;
  static final int INCREMENTO_DE_DIMENSION = 1000;
  static final int TIEMPO_MAXIMO_EJECUCION = 10;
  static final int REPETICIONES_MINIMAS = 20;
  static final int TAMANO_MAXIMO_ELEMENTOS = 1000;
  
  /*
  * Algoritmo y vector
  */
  static Burbuja_vector algoritmo = new Burbuja_vector();
  static Vector_aleatorio_int crea_vector_aleatorio = new Vector_aleatorio_int();
  /**
   * Método que mide los tiempos de ejecución de algoritmo_burbuja
   * @param args 
   */
  public static void main(String[] args) {
    int dimension;
    int veces_ejecutado;
    int [] vector;
    int i;
    
    double media;
    
    for (dimension = DIMENSION_INICIAL; dimension < DIMENSION_FINAL; dimension += INCREMENTO_DE_DIMENSION)
      {
        media = 0;
        for (veces_ejecutado = 0; veces_ejecutado < REPETICIONES_MINIMAS; veces_ejecutado++)
          {
            //System.out.printf("Veces ejecutado: %d\n",veces_ejecutado);
            vector = crea_vector_aleatorio.init(dimension,TAMANO_MAXIMO_ELEMENTOS);
            
            //Para mostrar vector, descomentar
           /* System.out.println("Vector aleatorio:\n");
            for (i = 0; i < dimension; i++)
              System.out.printf("%d ",vector[i]);
            System.out.println("\n");*/
            
            vector = algoritmo.ordenar_burbuja(vector);
            media += algoritmo.tiempo_fmenos0;
            
            /*System.out.println("Vector ordenado:\n");
            for (i = 0; i < dimension; i++)
              System.out.printf("%d ",vector[i]);
            System.out.println("\n-----\n");*/
            
          }
        System.out.printf("%d %f\n",dimension, media/veces_ejecutado/1000);
        //System.out.println("--------");
    }  
  }
}

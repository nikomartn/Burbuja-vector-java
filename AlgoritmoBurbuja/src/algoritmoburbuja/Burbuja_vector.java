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
public class Burbuja_vector
{
  /**
   * Vector ordenado tras utilizar ordenar_burbuja(Vector_aleatorio_int)
   */
  public int vector_ordenado[];
  
  /**
   * Conjunto de variables que miden el tiempo de ejecución
   */
  public long tiempo_0;
  public long tiempo_f;
  public double tiempo_fmenos0;
  
  
  /**
   * Método que ordena por burbuja un Vector_aleatorio_int
   * @param vector_desordenado 
   * @return vector_ordenado
   */
  public int[] ordenar_burbuja (int[] vector_desordenado)
  {
    vector_ordenado = vector_desordenado;
    int i, j;
    int temp;
    
    tiempo_0 = System.currentTimeMillis();
    for (i = 0; i < vector_ordenado.length; i++)
      {
        for (j = 0; j < vector_ordenado.length - 1 - i; j++)
          {
            if (vector_ordenado[j] > vector_ordenado[j+1])
              {
                temp = vector_ordenado[j];
                vector_ordenado[j] = vector_ordenado[j+1];
                vector_ordenado[j+1] = temp;
              }
          }              
      }
    tiempo_f = System.currentTimeMillis();
    tiempo_fmenos0 = (tiempo_f - tiempo_0);
    return vector_ordenado;
   }
}
  
  
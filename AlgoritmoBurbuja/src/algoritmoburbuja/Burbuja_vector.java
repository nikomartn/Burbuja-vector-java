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
  private int temp;
  /**
   * Método que ordena por burbuja un Vector_aleatorio_int
   * @param desordenado 
   */
  public void ordenar_burbuja (int[] vector_desordenado)
  {
    vector_ordenado = vector_desordenado;
    int i, j;
    
    for (i = 0; i < vector_ordenado.length; i++)
      {
        for (j = 0; j < vector_ordenado.length - 1 - j; j++)
          {
            if (vector_ordenado[j] > vector_ordenado[j+1])
              {
                temp = vector_ordenado[j];
                vector_ordenado[j] = vector_ordenado[j+1];
                vector_ordenado[j+1] = temp;
              }
          }              
      }        
   }
}
  
  
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmoburbuja;

import java.util.Random;

/**
 * Crea un vector aleatorio, de dimensión y tamaño de elementos deseados
 * @author nikomartn
 */
public class Vector_aleatorio_int
{
  /**
   * Defina en dimension_vector la dimension del vector int [];
   */
  public int dimension_vector;

  /**
   *Defina en tamano_elemento el rango del que serán, por ejemplo 100 para (0,100)
   */
  public int tamano_elemento;
  /**
   * Índice
   */
  private int i;
  /**
   * Vector al que hacer referencia una vez generado el objeto
   */
  int [] vector;
  /**
   * Inicializa la clase, con dimensión y tamaño de los elementos
   * @param ext_dim
   * @param ext_tam 
   * @return vector
   */
  public int[] init (int ext_dim, int ext_tam)
    {
      dimension_vector = ext_dim;
      tamano_elemento = ext_tam + 1;
      vector = new int[dimension_vector];
      
      for (i = 0; i < dimension_vector; i++)
        {
          Random aleatorio = new Random();
          vector[i] = aleatorio.nextInt(tamano_elemento);
        }
      return vector;
    }
}

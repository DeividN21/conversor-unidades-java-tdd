package com.ejemplo;

/**
 * Clase para realizar conversiones entre unidades métricas.
 */
public class ConversorUnidades {
  public static double metrosACentimetros(double metros) {
      return metros * 100; 
  }

  public static double metrosAMilimetros(double metros) {
      return metros * 1000;
  }

  public static double centimetrosAMilimetros(double centimetros) {
      return centimetros * 10;
  }

  public static double milimetrosAMetros(double milimetros) {
      return milimetros / 1000;
  }
}

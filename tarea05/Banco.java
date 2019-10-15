/**
 * Programa que crea un código para un número de cuenta dado.
 * @author José Marín
 * @version 1.0
 */

import java.util.Scanner;
public class Banco{
  public static void main(String [] args){

    Scanner in = new Scanner(System.in);
    char [] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
    String datoCta;
    System.out.println();

    //Pedimos el número de cuenta al usuario.
    System.out.print("Dar el número de cuenta: ");
    datoCta = in.nextLine();

    //Verificamos si el número de cuenta es de 8 dígitos.
    if(datoCta.length() < 8 || datoCta.length() > 8){
      System.out.println("No es un número de cuenta válido.");
      System.out.println();
      System.exit(1);
    }

    //Eliminamos los espacios en blanco si es que los hay.
    datoCta = datoCta.trim();

    //Convertimos el numero de cuenta ingresado (String) a enteros.
    int ctaInt = Integer.parseInt(datoCta);

    //Calculamos el residuo del número de cuenta entre 23.
    int residuo = ctaInt%23;

    char codigoLetra = ' ';

    //Hacemos un contador que recorra todo el arreglo de letras para asignar la letra Código al número de cuenta.
    for(int i=0; i<letras.length; i++){
      if(residuo == i){
        codigoLetra = letras[i];
      }
    }

    //Imprimimos el resultado.
    System.out.print("El número de cuenta \"con código es\" : " + ctaInt + codigoLetra);
    System.out.println();
    System.out.println();
  }
}

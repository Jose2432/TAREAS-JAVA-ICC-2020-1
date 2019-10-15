import java.util.Date;
import java.util.Scanner;

/** Programa para calcular la edad en años de una persona
 * @author José Marín
 * @date 7-Sep-2019
 */
public class tarea02 {
    public static void main(String[] pps) {

      // Declaracion de variables
      Scanner lector = new Scanner(System.in);
      int dia, mes, anio, anioActual, anioCumple, mesActual, mesCumple, diaActual, diaCumple, anioResultado, mesResultado, diaResultado;

	    Date hoy = new Date();

	    /**
        *
        *Solicitar la fecha de nacimiento
        *
      **/
      //El usuario ingresa la fecha en tres instrucciones
      System.out.println();
      System.out.println("Bienvenido al programa para calcular tu edad :D");
      System.out.println();
      System.out.println("Ingresa tu día de nacimiento (dd): ");
      dia = lector.nextInt();
      System.out.println("Ingresa tu mes de nacimiento (mm): ");
      mes = lector.nextInt();
      System.out.println("Ingresa tu año de nacimiento (aaaa): ");
      anio = lector.nextInt();
      System.out.println();

	    /**
        *
        * Adaptar la fecha normal al formato de Date
        *
      **/
      anio = anio-1900;      //Restamos 1900 al año ingresado ya que la clase Date cuanta años a partir de 1900
      mes = mes-1;           //Restamos 1 al mes ingresado ya que los meses comienzan en 0 en esta clase

      /**
        *
        * Casos en los que los datos ingresados son incorrectos
        *
      **/

      //Si el usuario ingresa un año mayor al actual da un error
      if(anio > hoy.getYear()){
        System.out.println("Error, no puedes poner un año adelantado");
        System.exit(anio);
      }

      //Si el usuario ingresa un mes que no existe, mandamos un error
      if(mes < 0 || mes > 11){
        System.out.println("Error, mes incorrecto");
        System.exit(mes);
      }
      //Caso de Febrero
      //Si el usuario ingresa Febrero e ingresa más de 28 días, mandamos un error
      if(mes == 01 && dia >= 29){
        System.out.println("Error, Febrero no tiene " + dia + " días");
        System.exit(dia);
      }

      //Si el usuario ingresa un día que no existe, mandamos un error
      if(dia <= 0 || dia >= 32){
        System.out.println("Error, día incorrecto");
        System.exit(dia);
      }

      //Si lo anterior se cumple el programa finaliza su ejecución
      Date fechaNaciemiento = new Date(anio,mes,dia);      //Le pasamos a la clase Date la fecha ingresada por el usuario


      /**
        *
        * Hacemos los cálculos para determinar la edad del usuario
        *
      **/
      //Obtenemos el año actual y el año ingresado y lo adaptamos a la realidad (es decir, no a la clase Date) por eso sumamos 1900
      anioActual = hoy.getYear();
      anioActual += 1900;
      anioCumple = fechaNaciemiento.getYear();
      anioCumple += 1900;
      //Obtenemos el mes actual y el mes ingresado y lo adaptamos a la realidad (es decir, no a la clase Date) por eso sumamos 1
      mesActual = hoy.getMonth();
      mesActual += 1;
      mesCumple = fechaNaciemiento.getMonth();
      mesCumple += 1;
      //Obtenemos el dia actual y el dia ingresado
      diaActual = hoy.getDate();
      diaCumple = fechaNaciemiento.getDate();

      //Se realizan los cálculos para obtener la edad
      anioResultado = anioActual - anioCumple;
      mesResultado = mesActual - mesCumple;
      diaResultado = diaCumple - diaActual;

      //Casos para obtener resultados más exactos
      //Y más casos donde los datos ingresados son incorrectos

      //
      if(mesCumple > mesActual){
          anioResultado -= 1;
      }
      if(mesCumple > mesActual && anio == hoy.getYear()){
          System.out.println("Error, aún no naces. Mes adelantado");
          System.exit(anio);
      }

      if(diaCumple > diaActual){
        mesResultado -= 1;
      }
      if(diaCumple > diaActual && anio == hoy.getYear()){
        System.out.println("Error, aún no naces. Día adelantado");
        System.exit(anio);
      }

      //Operación para calcular meses del año
      if(mesCumple > mesActual){
        mesResultado = mesActual - mesCumple;
        mesResultado += 11;
      }
      if(mesCumple < mesActual){
        mesResultado = mesActual - mesCumple -1;
      }
      if(mesActual - mesCumple == 1){
        mesResultado = mesActual - mesCumple;
      }
      if(mesCumple == mesActual){
        anioResultado -= 1;
      }
      if(diaCumple > diaActual && mesCumple == mesActual && hoy.getYear()-anio == 1){
        mesResultado = 11;
        anioResultado = 0;
      }
      if(diaCumple > diaActual && mesCumple == mesActual){
        mesResultado = 11;
      }

      //Operación para calcular los días del mes
      if(diaCumple > diaActual){
        diaResultado = 31 - diaCumple + diaActual;
      }
      if(diaCumple < diaActual){
        diaResultado = diaActual - diaCumple;
      }

      //Caso por si el usuario ingresa la fecha actual
      if(dia == hoy.getDate() && mes == hoy.getMonth() && anio == hoy.getYear()){
        System.out.println("Naciste hoy. FELICIDADES!!!");
        System.out.println();
        System.exit(dia);
      }

      //Si todos los datos ingresados son correctos se muestra lo siguiente
      //Muestra la fecha ingresada por el usuario y la fecha actual
      System.out.println("Tu fecha de nacimiento fue en: " + fechaNaciemiento);
      System.out.println("Hoy estamos a: " + hoy);
      System.out.println();

      //Caso por si el usuario cumple años hoy
      if(dia == hoy.getDate() && mes == hoy.getMonth()){
        System.out.println("Felicidades. Cumples años hoy");
      }
	    /**
        *
        * Mostrar la edad del usuario
        *
      **/
      System.out.println("Tienes " + anioResultado + " años con " + mesResultado + " meses y " + diaResultado + " dias aproximadamente");
      System.out.println();
    }
}

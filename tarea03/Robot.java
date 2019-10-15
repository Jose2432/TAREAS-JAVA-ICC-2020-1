/**
 * Clase que simula el comportamiento de un robot
 * @author José Marín
 * @version 1.0
 */
public class Robot {
    private String nombre;
    private String marca;
    private String numSerie;
    private boolean estaDormido;

    /**
     * Constructor por omisión. Crea a Robotina, de la marca Hasbro, con número de serie Rob2011
     */
    public Robot(){
      this.nombre = "Robotina";
      this.marca = "Hasbro";
      this.numSerie = "Rob2011";
    }

    /**
     * Constructor de un robot a partir de su nombre, marca y n�mero de serie
     * @param n - nombre del robot
     * @param m - marca del robot
     * @param num - n�mero de serie del robot
     */
    public Robot (String n, String m, String num) {
      this.nombre = n;
      this.marca = m;
      this.numSerie = num;
    }

    /**
     * M�todo para asignar nombre al robot
     * @param nomb -- cadena con el nombre del robot
     */
    public void asignarNombre(String nomb) {
      this.nombre = nomb;
    }

    /**
     * M�todo para asignar marca al robot
     * @param marca -- cadena con la marca del robot
     */
    public void asignarMarca(String marca) {
      this.marca = marca;
    }

    /**
     * M�todo para asignar numSerie al robot
     * @param num -- cadena con el numero de serie del robot
     */
    public void asignarNumSerie(String num) {
      this.numSerie = num;
    }

    /**
     * M�todo para obtener el nombre del robot
     * @return String -  nombre del robot
     */
    public String obtenerNombre() {
      return this.nombre;
    }

    /**
     * M�todo para obtener la marca del robot
     * @return String -  marca del robot
     */
    public String obtenerMarca() {
      return this.marca;
    }

    /**
     * M�todo para obtener el n�mero de Serie del robot
     * @return String -  n�mero de serie del robot
     */
    public String obtenerNumSerie() {
      return this.numSerie;
    }

    /**
     * M�todo para hacer dormir al robot
     */
    public void dormir() {
      this.estaDormido = true;
    }

    /**
     * M�todo para despertar al robot
     */
    public void despertar() {
      this.estaDormido = false;
    }

    /**
     * M�todo para saber si el robot est� despierto
     * @return boolean -- Si es true el robot est� despierto y false si esta dormindo
     */
    public boolean estaDespierto() {
      if(this.estaDormido = true){
        return true;
      }else{
        System.out.println("\nzzz zzz");
        return false;
      }
    }

    /**
     * M�todo para que el robot repita lo que se le dice
     * @param rollo -- cadena con el rollo que se desea repita el robot
     */
    public void repetir(String rollo) {
      String rep = rollo;
      System.out.println(rep);
    }

    /**
     * M�todo para determinar si dos robots son iguales
     * @param robot -- robot con el que se va a comparar
     * @return boolean -- true si son iguales y false en otro caso.
     */
    public boolean equals (Robot robot){
      Robot r1 = (Robot) robot;
      return r1.obtenerNombre().equals(this.obtenerNombre()) && r1.obtenerMarca().equals(this.obtenerMarca()) && r1.obtenerNumSerie().equals(this.obtenerNumSerie());
    }

    /**
     * M�todo para devolver una cadena con el nombre del robot.
     * @return String -- cadena que devolvera
     */
    public String toString () {
      return this.nombre;
    }

    /**
     * M�todo para que el robot reste los n�meros que se le dan
     * @param num1 -- minuendo
     * @param num2 -- sustraendo
     */
    public void restar(long num1, long num2) {
      long restar = num1 - num2;
    }

    /**
     * M�todo para que el robot sume los n�meros que se le dan
     * @param num1 -- primer sumando
     * @param num2 -- segundo sumando
     */
    public void sumar(long num1, long num2) {
      long sumar = num1 + num2;
      System.out.println("La suma de " + num1 + " y " + num2 + " es " + sumar);
    }

    /**
     * M�todo para que el robot multiplique los n�meros que se le dan
     * @param num1 -- primer factor
     * @param num2 -- segundo factor
     */
    public void multiplicar(long num1, long num2) {
      long multiplicar = num1 * num2;
      System.out.println("La multiplicacion de " + num1 + " y " + num2 + " es " + multiplicar);
    }

    /**
     * M�todo para que el robot divida los n�meros que se le dan
     * @param num1 -- dividendo
     * @param num2 -- divisor
     */
     public void dividir(long num1, long num2){
     	long dividir = 0;
     	if (num1 != 0 && num2 != 0){
     		if (num1 > num2)
     		dividir = num1/num2;
     	}else
     		System.out.println("No puedo dividir entre cero");
     }
}

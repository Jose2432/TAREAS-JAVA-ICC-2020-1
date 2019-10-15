/**
 *
 *  Clase que implementa la representacion de un Conjunto de numeros enteros
 *  cuyo valor esta entre 1 y 100.
 *
 *  <p>El Conjunto se representa como un arreglo de valores booleanos, donde si elementos[i]
 *  tiene valor true, significa que el entero i esta en el conjunto y si es false
 *  significa que el entero i no esta en el conjunto.
 *
 *  @author José Marín
 *
 */
public class Conjunto {

    /*
     *  Arreglo que nos sirve para determinar que elementos
     *  pertenecen al Conjunto.
     */
     private int [] conjuntoIni;

    /**
     *  Constructor que inicializa un Conjunto vacio.
     *  Es decir, un Conjunto sin ningun elemento.
     */
    public Conjunto() {
        this.conjuntoIni = new int [0];
    }

    /**
     *  Constructor que inicializa un Conjunto que contenga
     *  los enteros pasados como parametro.
     *  El arreglo pasado como parametro contiene, solamente,
     *  enteros cuyo valor esta entre 1 y 100.
     *  @param elementosIniciales Elementos que debera de contener el nuevo Conjunto.
     */
    public Conjunto(int[] elementosIniciales){
      for(int i=0; i<elementosIniciales.length; i++){
        if(elementosIniciales[i] > 0 && elementosIniciales[i] <= 100){
          this.conjuntoIni = elementosIniciales;
        }else{
          System.out.println("Error. El valor de tus elementos debe ser entre 1 y 100");
          System.exit(1);
        }
      }
    }

    /**
     *  Devuelve un Conjunto que contiene la union de el Conjunto
     *  que manda a llamar al metodo con el Conjunto c.
     *  @param c Conjunto que se va a unir.
     *  @return Nuevo Conjunto resultado de la union de ambos Conjuntos.
     */
    public Conjunto union(Conjunto c){
      int[] conjAux = {};
      int[] c1 = c.conjuntoIni;
      int j=0;
      for(int i=0; i<conjuntoIni.length; i++){
          conjAux[j] = conjuntoIni[i];
          j++;
          conjAux[j] = c1[i];
          j++;
      }
      return new Conjunto(conjAux);
    }

    /**
     *  Devuelve un Conjunto que contiene la interseccion de el Conjunto
     *  que manda a llamar al metodo con el Conjunto c.
     *  @param c Conjunto que se va a unir.
     *  @return Nuevo Conjunto resultado de la interseccion de ambos Conjuntos.
     */
    public Conjunto interseccion(Conjunto c){
      int [] conjUni = {};
      int [] c2 = c.conjuntoIni;
      int j=0;
      for(int i=0; i<conjUni.length; i++){
        if(conjuntoIni[i] == c2[j]){
          conjUni[i] = c2[j];
        }
        j++;
      }
      return new Conjunto(conjUni);
    }

    /**
     *  Devuelve un Conjunto resultado de la diferencia entre el Conjunto
     *  que llama al metodo y el Conjunto c.
     *  @param c Conjunto cuyos elementos seran restados al Conjunto que llama al metodo.
     *  @return Resultado de la diferencia entre ambos Conjuntos.
     */
    public Conjunto diferencia(Conjunto c){
      int [] conjUni = {};
      int [] c3 = c.conjuntoIni;
      int j=0;
      for(int i=0; i<conjuntoIni.length; i++){
        if(conjuntoIni[i] != c3[i]){
          conjUni[i] = conjuntoIni[j];
          i++;
          conjUni[i] = c3[j];
        }
        j++;
      }
      return new Conjunto(conjUni);
    }

    /**
     *  Determina si el elemento pasado como parametro pertenece o no
     *  al Conjunto.
     *  @param elemento Elemento que sera buscado dentro del Conjunto.
     *  @return true - Si el elemento esta en el Conjunto. false - En otro caso.
     */
    public boolean pertenece(int elemento){
      for(int i=0; i<conjuntoIni.length; i++){
        if(elemento == conjuntoIni[0]){
          return true;
        }
      }
      return false;
    }

    /**
     *  Metodo que introduce un nuevo elemento al Conjunto.
     *  @param elemento Elemento que sera introducido al Conjunto.
     */
    public void introduce(int elemento){
      for(int i=0; i<conjuntoIni.length; i++){
        if(conjuntoIni[i] == elemento){
          System.out.println("El elemento ya está dentro del conjunto");
        }else{
          conjuntoIni[i] = elemento;
        }
      }
    }

    /**
     *  Metodo que elimina un elemento del Conjunto.
     *  @param elemento Elemento que sera eliminado del Conjunto.
     */
    public void elimina(int elemento){
      for(int i=0; i<conjuntoIni.length; i++){
        if(elemento == conjuntoIni[i]){
          conjuntoIni[i] -= elemento;
        }else{
          System.out.println("No existe el elemento");
          System.exit(1);
        }
      }
    }

    /**
     *  Metodo que determina si dos Conjuntos son o no iguales.
     *  @param c Conjunto que sera comparado.
     *  @return true - Si son iguales. false - En otro caso.
     */
    public boolean equals(Conjunto c){
      if(new Conjunto(conjuntoIni) == c){
        return true;
      }else{
        return false;
      }
    }

    /**
     *  Metodo que devuelve la representacion en cadena del Conjunto.
     *  La cadena resultante tiene un formato como el que sigue:
     *  {4, 6, 80, 99}
     *  @return Representacion en cadena del Conjunto.
     */
    public String toString(){
      String cadenaConj = "{";
      for(int i=0; i<conjuntoIni.length; i++){
        cadenaConj += conjuntoIni[i] + ",";
      }
      return cadenaConj+"}";
    }

}

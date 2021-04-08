
package tablasdemultiplicar;

public class TablasDeMultiplicar {


    public static void main(String[] args) {
        int numero = Leer.entero("Escoge un numero del 1 al 10 para mostrar su tabla: ");
        int resultado;
        
        for(int i=1; i<11; i++){
            resultado = numero * i;
            
            System.out.println(numero+" x "+i+ " = "+resultado);        
        }
        

    }
    
}

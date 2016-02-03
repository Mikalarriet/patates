//Definicion de la clase que crea el fichero de articulos

import java.util.*;
import java.io.*;

public class CrearFicheroArticulo {
    
  //Metodo principal  
    public static void main(String[] args)
    {
        
        Scanner teclado = new Scanner(System.in);
    
        try {

        	ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream("z:\\FicherosDeDatos\\Farticulos.obj"));

            do {         
                        
                salida.writeObject( new Articulo(pedirCodigo(),pedirNombre(),pedirPrecio()));                

                System.out.println("\nSi desea continuar teclee 'SI'");
                
            }while(teclado.nextLine().equals("SI"));
            salida.close();

        }catch(IOException e) {

            System.out.println("\nError de escritura."+e.getMessage());
 
        }catch(Exception a){

            System.out.println("\nError: "+a.getMessage());
        }
  }
    
  //Metodo que pide el codigo     
    public static int pedirCodigo(){
        
        Scanner teclado = new Scanner(System.in);
        int cod;
        System.out.println("\nTeclee el codigo del articulo");
        cod = teclado.nextInt();
        while(cod < 0 || cod > 999){
            
            System.out.println("\nEl codigo debe estar entre 0 y 99");
            cod = teclado.nextInt();
        }
        return cod;
    }  
    
 //Metodo que pide el nombre   
   public static String pedirNombre() {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("\nTeclee el nombre del articulo");
        String nombre = teclado.nextLine();
        while(nombre.length() > 15) {
            
            System.out.println("\nLa longitud del nombre no puede sobrepasar 15 caracteres.Teclee de nuevo.");
            nombre = teclado.nextLine();
        }
        return nombre;
    }
   
 //Metodo que pide el precio      
    public static int pedirPrecio(){
        
        Scanner teclado = new Scanner(System.in);
        int precio;
        System.out.println("\nTeclee el precio del articulo");
        precio = teclado.nextInt();
        while(precio < 0 || precio > 999){
            
            System.out.println("\nEl precio tecleado debe estar entre 0 y 999 €");
            precio = teclado.nextInt();
        }
        return precio;
    }
    
 
}


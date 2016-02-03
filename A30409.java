/*A30409: Codifica en Java el programa  que pida por consola  los datos de las operaciones de venta 
     realizadas por una empresa, siendo los datos por cada operación de venta : código de articulo y 
     cantidad.
     Tratada una operación se le preguntará al usuario si desea tratar otra operación.
     Los códigos de los artículos que comercializa la empresa son 10,20,30,40,50,60,70,80.90 y 100. 
     Se desea sacar por pantalla por cada tipo de artículo vendido las cantidades vendidas del mismo
     con el siguiente formato :
                                                 RELACION DE VENTAS
                                                 ----------------------------------
                                             ARTICULO               CANTIDAD
                                             ---------------               ---------------
                                                  XXX                       XXXXX
                                              ………………………………….
                                                 XXX                       XXXXX

*/

//Importa el paquete que contiene la clase System y String
  import java.lang.*;  
  
//Importa el paquete que contiene la clase Scanner  
  import java.util.*;
  
//Definición de la clase
  public class A30409
  {
   //Definición del método principal
     public static void main(String[] args)throws Exception   
	{
      //Declaraciones del array y de las variables de indice
        final int ELEMENTOS = 10; 
        int []vCant = new int[ELEMENTOS];
        int indice;
        int codArti, cantArti;
        char res;  

      //Declaración del objeto teclado de la clase Scanner      
        Scanner teclado = new Scanner(System.in); 
    
      //Inicializa a cero el vector de cantidades
        for(indice = 0; indice < vCant.length; indice++)
           vCant[indice] = 0;        
     
      //Proceso de toma de datos de las operaciones de venta                 
        do
        {                  
         //Toma de consola el codigo de articulo vendido en la operacion de venta           
           System.out.print("\n\nTeclee codigo de articulo : ");  
           codArti = teclado.nextInt(); 
        // while(codArti < 10 || codArti > 100 || codArti % 10 != 0)        
           while(codArti!=10 && codArti!=20 && codArti!=30 && codArti!=40 &&
                 codArti!=50 && codArti!=60 && codArti!=70 && codArti!=80 &&
                 codArti!=90 && codArti!=100)
           {	   
        	System.out.printf("\n\nCodigo de articulo: %d  erroneo.Teclee otro codigo : ",codArti);  
            codArti = teclado.nextInt();         
           } 
           
         //Toma de consola la cantidad vendida del articulo en la operacion de venta           
           System.out.print("\n\nTeclee cantidad de articulo vendido : ");  
           cantArti = teclado.nextInt();
           while(cantArti <= 0)
           {	   
        	System.out.printf("\n\nCantida de articulo: %d  erroneo.Teclee otra cantiad de articulo : ",cantArti);  
            cantArti = teclado.nextInt();        
           } 
           
         //Acumula la cantidad vendida en el vector de cantidades
           indice = (codArti/10) - 1;
           vCant[indice] += cantArti;
         
         //Pregunta al usuario si desea tratar otra operacion de venta     
           System.out.println("\n\nDesea Tratar Otra Operacion de Venta?");
           System.in.skip(System.in.available());
           res = (char) System.in.read();
           res = Character.toUpperCase(res);
        }while( res == 'S');       
    
      //Visualiza el informe de las ventas 
        System.out.printf("\n RELACION DE VENTAS");
        System.out.printf("\n ------------------");
        System.out.printf("\n ARTICULO  CANTIDAD");
        System.out.printf("\n --------  --------");      
        for(indice = 0; indice < vCant.length; indice++)
         if (vCant[indice] != 0) 	
             System.out.printf("\n   %2d     %5d",(indice+1)*10,vCant[indice]); 
          
	}

}


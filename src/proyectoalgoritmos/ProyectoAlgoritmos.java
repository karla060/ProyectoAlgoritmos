/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoalgoritmos;
import java.util.Scanner;
/**
 *
 * @author karlaa 
 */
public class ProyectoAlgoritmos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    
    Scanner scan = new Scanner(System.in);
      
      
      
      //Mostrar mensaje indicando la seccion de categorías 
       System.out.println("  ---Seccion de Categorias de Productos---  "); 
     
      
       
       
       int respuesta = 0; 
       
       do {
       System.out.println(" ");
       System.out.println("Ingrese un numero segun la accion que desee realizar:");
       System.out.println("1. Ingresar nuevo nombre de categoria:");
       System.out.println("2. Modificar nombre de categoria");
       System.out.println("3. Eliminar nombre de categoria");
       System.out.println("4. Salir de la seccion de categorias ");
       respuesta = scan.nextInt();
       scan.nextLine();
       
        switch (respuesta) {
        case 1:
        
        System.out.print("Ingrese el nombre de la categoria: ");
        String nombreCate = scan.nextLine();
        System.out.println(nombreCate);
        
        while (nombreCate.isBlank()) {
             System.out.println("El nombre no puede estar vacio, ingrese nuevamente el nombre: ");
            nombreCate = scan.nextLine();
        }
        
        String acumulador = nombreCate;
        System.out.println("La categoria, " + nombreCate + " ha sido ingresada sin novedades");       
        break;
        
        case 2:
           
            
            System.out.print("Ingrese el nombre de la categorIa a modificar: ");
            String modiCate = scan.nextLine();
            System.out.println("La categoría, " + modiCate + " ha sido modificada sin novedades");
        break;
        case 3:
            System.out.print("Ingrese el nombre de la categorIa a eliminar: ");
            String Cate = scan.nextLine();
            System.out.println("La categoría, " + Cate + " ha sido eliminada sin novedades");
        break;
       
        default:
                    System.out.println("Ha salido de la seccion de categorías");
            }
       } while (respuesta ==1 || respuesta == 2 || respuesta ==3);
       
       System.out.println("Programa terminado ");
    
       
       /*
       private static void gestionarCaracteristicas(Scanner scanner, GestionCaracteristicas gestionCaracteristicas) {  
       
       */
       
       
      System.out.println(" ---Seccion de Caracteristicas de Productos--- ");
      
       int respuesta2 = 0; 
       do {
       System.out.println(" ");
       System.out.println("Ingrese un numero segun la accion que desee realizar:");
       System.out.println("1. Ingresar una nueva carácterística:");
       System.out.println("2. Modificar una característica existente");
       System.out.println("3. Eliminar una caracteristica existente");
       System.out.println("4. Salir de la seccion de caracteristicas de productos ");
       respuesta2 = scan.nextInt();
       scan.nextLine();
       
        switch (respuesta2) {
        case 1:
        
        System.out.print("Ingrese el nombre de la categoria: ");
        String nombreCara = scan.nextLine();
        
        while (nombreCara.isBlank()) {
            System.out.println("El nombre no puede estar vacio, ingrese nuevamente el nombre: ");
            nombreCara = scan.nextLine();
        }
        
        String acumulador = nombreCara;
        System.out.println("La categoria, " + nombreCara + " ha sido ingresada sin novedades");       
        break;
        
        case 2:
            System.out.print("Ingrese el nombre de la categorIa a modificar: ");
            String modiCara = scan.nextLine();
            System.out.println("La categoría, " + modiCara + " ha sido modificada sin novedades");
        break;
        case 3:
            System.out.print("Ingrese el nombre de la categorIa a eliminar: ");
            String Carac= scan.nextLine();
            System.out.println("La categoría, " + Carac + " ha sido eliminada sin novedades");
        break;
       
        default:
                    System.out.println("Ha salido de la seccion de categorías");
            }
       } while (respuesta2 ==1 || respuesta2 == 2 || respuesta2 ==3);
       
       System.out.println("Programa terminado ");
       
       
       
       System.out.println(" ---Seccion de Especificaciones de los Productos--- ");
      
       int respuesta3 = 0; 
       do {
       System.out.println(" ");
       System.out.println("Ingrese un numero segun la accion que desee realizar:");
       System.out.println("1. Ingresar una nueva especificación:");
       System.out.println("2. Modificar nombre de una especificación existente");
       System.out.println("3. Eliminar nombre de una especificación existente");
       System.out.println("4. Salir de la seccion de especificaciones ");
       respuesta3 = scan.nextInt();
       scan.nextLine();
       
        switch (respuesta3) {
        case 1:
        
        System.out.print("Ingrese el nombre de la categoria: ");
        String nombreCate = scan.nextLine();
        
        while (nombreCate.isBlank()) {
            System.out.println("El nombre no puede estar vacio, ingrese nuevamente el nombre: ");
            nombreCate = scan.nextLine();
        }
        
        String acumulador = nombreCate;
        System.out.println("La categoria, " + nombreCate + " ha sido ingresada sin novedades");       
        break;
        
        case 2:
            System.out.print("Ingrese el nombre de la categorIa a modificar: ");
            String modiCate = scan.nextLine();
            System.out.println("La categoría, " + modiCate + " ha sido modificada sin novedades");
        break;
        case 3:
            System.out.print("Ingrese el nombre de la categorIa a eliminar: ");
            String Cate = scan.nextLine();
            System.out.println("La categoría, " + Cate + " ha sido eliminada sin novedades");
        break;
                
       
        default:
                    System.out.println("Ha salido de la seccion de categorías");
            }
       } while (respuesta3 ==1 || respuesta3 == 2 || respuesta3 ==3);
       
       System.out.println("Programa terminado ");
       
       
       System.out.println("");
               
       
    }       
    
}   
   

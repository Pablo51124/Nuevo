/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevo;
import java.util.*;
/**
 *
 * @author admin
 */
public class Nuevo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int cont = 0;
        int num1 = 0, num2 = 0, resultado = 0;
        String cadena;
        char caracter, letra, op;
        
        do{
        System.out.println("Introduzca una cadena");
        cadena = sc. nextLine();
        System.out.println("Introduce un caracter");
        caracter = sc.nextLine().charAt(0);
        
        for(int i = 0; i <cadena.length() ; i++){
            letra = cadena.charAt(i);
            if(letra == caracter){
                cont++;
            }
        }
        
        System.out.println("El caracter " + caracter + " se ha repetido " + cont + " veces");
        
        System.out.println("La suma es " + suma(num1,num2,resultado));
        
            System.out.println("Desea continuar? s/n");
            op = sc.nextLine().charAt(0);
        }while(op == 's');
    }
   public static int suma(int num1,int num2,int resultado){
       resultado = num1 + num2;
       
       return resultado;
   }
}

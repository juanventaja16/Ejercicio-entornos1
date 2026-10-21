import java.util.Scanner;

/**
 * Write a description of class Ejercicio8 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio8
{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        
        //1.Aparecer dos numeros aleatorios comprendidos entre 1 y 99)
        
        int n1 = (int) (Math.random() * 99) +1;
        System.out.println(" Aqui aparece el primer numero random " + n1);
        
        int n2 = (int) (Math.random() * 99) +1;
        
        System.out.println(" Aqui aparece el segundo numero random " + n2);
        
    
        //2.Una vez hecho esto tenemos que hacer que el usuario sume los dos numeros
  
        System.out.println("Que quieres hacer hoy sumar, restar o multiplicar");
        
        System.out.println("Elige una opción:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
                    
        int opcion1 = sc.nextInt();
        
        switch (opcion1){
        case 1:
        System.out.println("Cuanto es " + n1 +  " + " + n2 +  "?");
        
        System.out.println("Introduce la respuesta de la suma");
        int respuestaUsuario1 = sc.nextInt();
        
        //3.Vemos si la respuesta del usuario es correcta o incorrecta
        if (n1 + n2 == respuestaUsuario1) {
        System.out.println(" La respuesta es correcta ");
        } else {
        System.out.println(" La respuesta es incorrecta ");
        }
        break;
        
        case 2:
        System.out.println("Cuanto es " + n1 +  " - " + n2 +  "?");
        
        System.out.println("Introduce la respuesta de la resta");
        int respuestaUsuario2 = sc.nextInt();
        
        //3.Vemos si la respuesta del usuario es correcta o incorrecta
        
         if (n1 < n2){
        System.out.println(" La respuesta es correcta ");
        } else {
        if (n1 - n2 == respuestaUsuario2) {
        System.out.println(" La respuesta es correcta ");
        } else {
        System.out.println(" La respuesta es incorrecta ");
        }
        }
        break; 
        
        case 3:
            
        System.out.println("Cuanto es " + n1 +  " * " + n2 +  "?");
        
        System.out.println("Introduce la respuesta de la multiplicacion");
        int respuestaUsuario3 = sc.nextInt();
        
        //3.Vemos si la respuesta del usuario es correcta o incorrecta
        
         if (n1 < n2){
        System.out.println(" La respuesta es correcta ");
        } else {
        if (n1 * n2 == respuestaUsuario3) {
        System.out.println(" La respuesta es correcta ");
        } else {
        System.out.println(" La respuesta es incorrecta ");
        }
        break;
              }
         }
    }
}

import java.util.Scanner;


public class aserriApp {
public static void main (String args[]) {


String nombre;
int dia,mes,año;

    Scanner captura=new Scanner(System.in);
    System.out.println("Hola, Bienvenido a la App del CTP Aserri; ingresa tu nombre");
    nombre=captura.next();
 
    
    System.out.println(nombre+" ingresa tu fecha de nacimiento");

System.out.println("Dia");
    dia=captura.nextInt();

System.out.println("Mes");
    mes=captura.nextInt();

System.out.println("Año");
    año=captura.nextInt();

    
   int edad= 2022-año;
   
    System.out.println("Tu edad es "+edad);
    
    
    //edad 10
   if ((edad>15)&(edad<25)){
       
   System.out.println("Eres apto para un descuento Junior del 10%");
   
   }
   
 
   
      //edad 35
   if ((edad>25)&(edad<35)){
       
   System.out.println("Eres apto para un descuento Executive del 15%");
   
   }
   
      //edad 35
   if (edad>35){
       
   System.out.println("Eres apto para un descuento Senior del 20%");
   
   } 
   
   
   
   
   
   int total,o;
    System.out.println("**************CAJERO*************"); 
   
    System.out.println("Ingresa monto a pagar"); 
    total=captura.nextInt();
    
    
    
    int a;
    System.out.println("Junior=1   executive=2   Senior=3");
    a=captura.nextInt();
        
//    float des,fin;
    
    float des,fin;
        if (a==1){
        
           des=total/10;
           fin=total-des;
           
           
           System.out.println("El monto a pagar es de "+fin);
        }
    
         if (a==2){
        
           des=total/15;
           fin=total-des;
           
           
           System.out.println("El monto a pagar es de "+fin);
        }
    
          if (a==3){
        
           des=total/20;
           fin=total-des;
           
           
           System.out.println("El monto a pagar es de "+fin);
        }
    

          if (a>=4){
    
           
           System.out.println("ERROR");
        }
     
          
          
    }   
}
     
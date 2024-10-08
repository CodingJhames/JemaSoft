

package com.james.poo;

/**
 *
 * @author james
 */
public class POO {

    public static void main(String[] args) {
        
//        try{
//            Persona p = new Persona("james","mejia",31);
//        }catch( IllegalArgumentException e){
//            System.out.println(e.getMessage());
//        }
            
        Persona persona = new Persona("james","mejia",31);
        
//        System.out.println( persona.nombreCompleto("Señor"));
//        System.out.println( persona.nombreCompleto());
        
         Persona persona2 = new Persona("jhon");

//        System.out.println( persona2.nombreCompleto("Señor"));
//        System.out.println( persona2.nombreCompleto());
//        
//        System.out.println(persona.toString());

        if(persona.equals(persona2)){
            System.out.println("Son iguales");
        }else{
            System.out.println("No son iguales");
        }
        
    }     
    
    
    
        
}    
        
        
        
        
        
        
//        p.nombre = "james";
//        p.apellidos = "mejia";
//        p.edad = 31;
        
        
  


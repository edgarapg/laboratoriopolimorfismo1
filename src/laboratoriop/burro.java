package laboratoriop;

public class burro {
     public static void main(String arg[]) { 
        Persona  per= new Persona(); 
        aplicacion(per); 
       
        Canario volar = new Canario(); 
        aplicacion(volar);    
    } 
    public static void aplicacion(puedeCantar aplica) { 
        aplica.cantar(); 
    } 
}

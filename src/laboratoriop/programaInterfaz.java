package laboratoriop;


public class programaInterfaz {
    public static void main(String arg[]) { 
        Persona pavaroti = new Persona(); 
        hacerCantar(pavaroti); 
       
        Canario piolin = new Canario(); 
        hacerCantar(piolin); 
       
    } 

    public static void hacerCantar(puedeCantar cantor) { 
        cantor.cantar(); 
    } 

}

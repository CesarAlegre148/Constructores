/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package constructores;


/**
 *
 * @author Cesar Alegre Flores
 */
public class Constructores {

    /**
     * @param args the command line arguments
     */
     /*public static void main(String[] args) {
        //Metodo de instancia
        Persona persona = new Persona();
        Persona Juan = new Persona("Cesar", 23);
        /*
        en el metodo persona recorta el codigo
        System.out.println("Nombre: ".concat(persona.getNombre()));
        System.out.println("Edad: ".concat(persona.getEdadComoTexto()));
       
        imprimir(persona.getTextoImprimir());
        imprimir(Juan.getTextoImprimir());
        
    }  */
    
    public static void main(String[] args) {
        //Metodo de instancia
        Empleado empleado = new Empleado("Marinero", 12, "Callao");
        Empleado empleado2 = new Empleado(empleado);
        //ALT+enter activa set
        empleado2.setDepartamento("ventas");
        
        imprimir(empleado.getTextoImprimir());
        imprimir(empleado2.getTextoImprimir());
        
    }   
    
    public static void imprimir(String texto){
        System.out.println(texto);
    }
    public static String convertirATexto(int entero){
        
        return String.valueOf(entero);
    }
    

    
    
    
}

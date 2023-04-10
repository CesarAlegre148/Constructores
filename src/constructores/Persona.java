/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructores;

/**
 *
 * @author Cesar Alegre Flores
 */
public class Persona {
    
    private String nombre;
    private int edad;
    
    /*public Persona(){
    this.nombre = "";
    this.edad = 0;
    }*/
    public Persona (){}

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    
    
    public String getTextoImprimir(){
    //return "Nombre: "+ this.nombre +"\n Edad: "+getEdadComoTexto();
    
    return "Nombre: "
            + this.nombre
            + "\nEdad: "
            +getEdadComoTexto()
            +"\n------------------";
    }
    
    public String getEdadComoTexto(){
    String edadTexto = String.valueOf(edad);
    return edadTexto;
    }
    
   
}

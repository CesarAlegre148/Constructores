/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructores;

/**
 *
 * @author Cesar Alegre Flores
 */
public class Empleado {
    private String nombre;
    private int edad;
    private String departamento;
    
    public Empleado(
        String nombre,
        int edad,
        String departamento){
            
            this.nombre = nombre;
            this.edad = edad;
            this.departamento = departamento;
    }
    
    public Empleado (Empleado empleado01d){
    this.nombre = empleado01d.nombre;
    this.edad = empleado01d.edad;
    this.departamento = empleado01d.departamento;
    }
    
     public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    
    public String getDepartamento() {
        return departamento;
    }
    
     public String getEdadComoTexto(){
    String edadTexto = String.valueOf(edad);
    return edadTexto;
     }
     
    public String getTextoImprimir(){
    return "Nombre: "
            + this.nombre
            + "\nEdad: "
            +getEdadComoTexto()
            + "\nDepartamento: "
            +this.departamento
            +"\n------------------";
    }

 
    
     public static Empleado Empleado2(Empleado empleado01d){
        return new Empleado(
        empleado01d.getNombre(),
        empleado01d.getEdad(),
        empleado01d.getDepartamento());
    }

 

}

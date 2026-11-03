/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaestudiante;

/**
 *
 * @author bonil
 */
public class Student {
    
/*
Modificadores de acceso 
-public: 
-private: Solo los que pertenecen a la clase estudiante.
-protected: Solo los que pertenecen a la clase y a aquellos a los que se eredan.    
 */

//Atributos (variables)
    private int edad; 
    private double estatura;
    private char genero; 
    
    String nombre;
    String apellido; 
    
    
    
    
    //Constructor (asigna los valores a los atributos de un objeto cuando este se crea)
    public Student(){
    this.edad = 0; 
    this.estatura = 0;
    this.nombre = "Arthur";
    this.apellido = "Bonilla"; 
    }//end consructor 
    
    public Student(int edad, double estatura){
    this.edad = edad; 
    this.estatura = estatura;
    this.nombre = "Arthur";
    this.apellido = "Bonilla"; 
    }//end constructor
    
    public int Student(int edad){
     this.edad = 20;
     MostrarDatos ();
     return edad; 
    }
    
    //metodos
    public void MostrarDatos(){
        System.out.printf("Nombre: %s\n", this.nombre);
        System.out.printf("Apellido: %s\n", this.apellido);
        System.out.printf("Edad: %d\n", this.edad);
        System.out.printf("Estatura %.2f\n", this.estatura); 
    }//end metodo
    
    
    //getter y setter, encapsular
    public void SetEdad(int edad){
        
        if (edad>0 && edad<100) {
           this.edad = edad; 
        }
        else{
            System.out.println("Error ingresado");
            this.edad = 1; 
        }
    
    }
    
    public int getEdad(){
    return this.edad;
    }
    
    public char getGenero(){
    return genero;
    }
    
    public void setGenero(char genero){
         if(genero == 'm' || genero == 'f'){
             this.genero = genero; 
         }
    }
    
}//end class

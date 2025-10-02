/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresasoft.developer;

import empresasoft.Composite.Composite;
import empresasoft.prototype.Prototype;

/**
 *
 * @author laver
 */
public class Developer implements Prototype, Composite {

    String name;
    String tarea;    
    
    public Developer(String name, String tarea){
        this.name = name;
        this.tarea = tarea;
    }
    
    @Override
    public Prototype clonar() {
        return new Developer(this.name, this.tarea);
    }
    
    public void setName(String nombre){
        this.name = nombre;
    }
    
    public void setTarea(String tarea){
        this.tarea = tarea;
    }

    @Override
    public String getInfo() {
        return "Nombre " + this.name + "\nTarea: " +this.tarea;
    }
    
    
}

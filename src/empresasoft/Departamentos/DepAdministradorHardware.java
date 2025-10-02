/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresasoft.Departamentos;

import empresasoft.Composite.Composite;
import empresasoft.developer.Developer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author laver
 */
public class DepAdministradorHardware implements Composite {

    private final List<Composite> empleados = new ArrayList<>();
    
    public void agregarDeveloper(Developer dev, int cn){
       
        for(int i=0; i<cn; i++){
            
            empleados.add((Composite) dev.clonar());
            
        }

    }
    
    public void modificarDeveloper( String nuevoNombre, String nuevoRol) {
    for(int i = 0; i< empleados.size(); i++){
        Developer dev = (Developer) empleados.get(i);
        
        dev.setName(nuevoNombre);
        dev.setTarea(nuevoRol);
    }
}

    
    
    @Override
    public String getInfo() {
        StringBuilder sb = new StringBuilder("Departamento de administracion de hardware: \n");
    
        for (Composite empleado : empleados) {
            sb.append(empleado.getInfo()).append("\n");
        }
    
        return sb.toString();
    }
    
}

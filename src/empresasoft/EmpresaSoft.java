/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empresasoft;

import empresasoft.Departamentos.DepFrontend;
import empresasoft.developer.Developer;
import java.util.Scanner;
/**
 *
 * @author laver
 */
public class EmpresaSoft {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String name;
        String tarea;
        
        Developer dev = new Developer("null", "null");
        DepFrontend  dep = new DepFrontend();
        DepFrontend  dep1 = new DepFrontend();
        DepFrontend  dep2 = new DepFrontend();
        DepFrontend  dep3 = new DepFrontend();
        
        dep.agregarDeveloper(dev, 4);
        dep1.agregarDeveloper(dev, 4);
        dep2.agregarDeveloper(dev, 4);
        dep3.agregarDeveloper(dev, 4);
        
        
        name = a.nextLine();
        tarea = a.nextLine();
        
        
        dep.modificarDeveloper(name, tarea);
        
        System.out.println(dep.getInfo());
        System.out.println(dep1.getInfo());
        System.out.println(dep2.getInfo());
        System.out.println(dep3.getInfo());

    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresasoft.Builders;

/**
 *
 * @author laver
 */
public class Director {
    
    public Aplicacion crearAppWeb(BuilderApp builder){
        builder.llamarFrontend();
        builder.llamarBackend();
        builder.llamarDataBase();
        return builder.getResult();
    }
    
    public Aplicacion crearAppEsc(BuilderApp builder){
        builder.llamarFrontend();
        builder.llamarBackend();
        builder.llamarDataBase();
        builder.llamarGestionHardware();
        return builder.getResult();
    }
}

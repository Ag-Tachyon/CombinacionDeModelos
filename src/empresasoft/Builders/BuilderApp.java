/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresasoft.Builders;

public interface BuilderApp {
public void llamarFrontend();
public void llamarBackend();
public void llamarDataBase();
public void llamarGestionHardware();
public Aplicacion getResult();    
}
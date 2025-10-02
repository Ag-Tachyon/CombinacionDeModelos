/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresasoft.Builders;

import empresasoft.Departamentos.DepBackend;
import empresasoft.Departamentos.DepDataBases;
import empresasoft.Departamentos.DepFrontend;

/**
 *
 * @author laver
 */
public class BuilderAppWeb implements BuilderApp {

    public Aplicacion app = new Aplicacion("Aplicacion web ");
    @Override
    public void llamarDataBase() {
        app.agregarDepartamento(new DepDataBases());
    }
    @Override
    public void llamarFrontend() {
        app.agregarDepartamento(new DepFrontend());
    }
    @Override
    public void llamarBackend() {
        app.agregarDepartamento(new DepBackend());
    }
    @Override
    public Aplicacion getResult() {
        return app;
    }

    @Override
    public void llamarGestionHardware() {
    }
}
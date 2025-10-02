/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresasoft.Builders;

import empresasoft.Composite.Composite;
import java.util.ArrayList;
import java.util.List;

public class Aplicacion implements Composite {
    private final String tipo;
    private final List<Composite> departamentos = new ArrayList<>();

    public Aplicacion(String tipo) {
        this.tipo = tipo;
    }
    
    public void agregarDepartamento(Composite dep ){
        departamentos.add(dep);
    }

    @Override
    public String getInfo() {
        StringBuilder sb = new StringBuilder("Aplicación tipo: " + tipo + "\n");
        for (Composite dep : departamentos) {
            sb.append(dep.getInfo()).append("\n");
        }
        return sb.toString();
    }

}

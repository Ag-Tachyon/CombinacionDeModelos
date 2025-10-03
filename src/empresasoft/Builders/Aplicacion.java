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
    
    public String getTipo() {
        return this.tipo;
    }
    
    public void agregarDepartamento(Composite dep) {
        departamentos.add(dep);
    }

    public List<Composite> getDepartamentos() {
        return departamentos;
    }

    @Override
    public String getInfo() {
        StringBuilder sb = new StringBuilder("Aplicacion tipo: " + tipo + "\n");
        for (Composite dep : departamentos) {
            sb.append(dep.getInfo()).append("\n");
        }
        return sb.toString();
    }
}

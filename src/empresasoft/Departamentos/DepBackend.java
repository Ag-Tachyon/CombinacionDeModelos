package empresasoft.Departamentos;

import empresasoft.developer.Developer;
import java.util.ArrayList;
import java.util.List;

public class DepBackend implements Departamento {

    private final List<Developer> empleados = new ArrayList<>();

    @Override
    public void agregarDeveloper(Developer dev, int cn) {
        for (int i = 0; i < cn; i++) {
            empleados.add((Developer) dev.clonar());
        }
    }

    @Override
    public void modificarDeveloper(String nuevoNombre, String nuevoRol) {
        for (Developer dev : empleados) {
            dev.setName(nuevoNombre);
            dev.setTarea(nuevoRol);
        }
    }

    @Override
    public String getInfo() {
        StringBuilder sb = new StringBuilder("Departamento Backend:\n");
        for (Developer empleado : empleados) {
            sb.append(empleado.getInfo()).append("\n");
        }
        return sb.toString();
    }
}

package empresasoft.Departamentos;

import empresasoft.Composite.Composite;
import empresasoft.developer.Developer;

public interface Departamento extends Composite {
    void agregarDeveloper(Developer dev, int cn);
    void modificarDeveloper(String nuevoNombre, String nuevoRol);
}


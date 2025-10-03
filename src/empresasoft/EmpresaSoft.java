package empresasoft;

import empresasoft.Builders.Aplicacion;
import empresasoft.Builders.BuilderApp;
import empresasoft.Builders.BuilderAppWeb;
import empresasoft.Builders.BuilderAppEsc;
import empresasoft.Builders.Director;
import empresasoft.Departamentos.Departamento;
import empresasoft.developer.Developer;
import empresasoft.io.IOFactory;
import empresasoft.io.Input;
import empresasoft.io.Output;
import empresasoft.io.console.ConsoleFactory;
import empresasoft.io.frame.FrameFactory;
import java.util.Scanner;

public class EmpresaSoft {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        Director director = new Director();

        // Developer "base" para clonar
        Developer prototipoDev = new Developer("null", "null");

        System.out.println("Seleccione el modo de I/O:");
        System.out.println("1. Consola");
        System.out.println("2. Frame");
        int opcion = a.nextInt();
        a.nextLine(); // limpiar buffer

        IOFactory factory = (opcion == 1) ? new ConsoleFactory() : new FrameFactory();
        Input input = factory.createInput();
        Output output = factory.createOutput();

        // Preguntar tipo de aplicación
        String respuestaAplicacion = input.getData("Escriba W si quiere app web o E si quiere app de escritorio");

        BuilderApp builder;
        Aplicacion app;

        if (respuestaAplicacion.equalsIgnoreCase("W")) {
            builder = new BuilderAppWeb();
            app = director.crearAppWeb(builder);
        } else {
            builder = new BuilderAppEsc();
            app = director.crearAppEsc(builder);
        }

        // Configurar cada departamento de la app
        for (var comp : app.getDepartamentos()) {
            if (comp instanceof Departamento dep) {
                int cantidad = Integer.parseInt(input.getData("Ingrese cantidad de developers para " 
                                                              + dep.getClass().getSimpleName()));
                for (int i = 0; i < cantidad; i++) {
                    String nombre = input.getData("Nombre del developer " + (i + 1));
                    String tarea = input.getData("Tarea del developer " + (i + 1));

                    Developer nuevoDev = (Developer) prototipoDev.clonar();
                    nuevoDev.setName(nombre);
                    nuevoDev.setTarea(tarea);

                    dep.agregarDeveloper(nuevoDev, 1);
                }
            }
        }

        // Mostrar resultados
        output.showData(app.getInfo());

        a.close();
    }
}

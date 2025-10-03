package empresasoft.io.console;


import empresasoft.io.Output;

public class ConsoleOutput implements Output {
    @Override
    public void showData(String msg) {
        System.out.println(msg);
    }
}

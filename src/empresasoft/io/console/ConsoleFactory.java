package empresasoft.io.console;

import empresasoft.io.IOFactory;
import empresasoft.io.Input;
import empresasoft.io.Output;

public class ConsoleFactory implements IOFactory {
    @Override
    public Input createInput() {
        return new ConsoleInput();
    }

    @Override
    public Output createOutput() {
        return new ConsoleOutput();
    }
}
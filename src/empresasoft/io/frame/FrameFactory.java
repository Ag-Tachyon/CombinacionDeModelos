package empresasoft.io.frame;


import empresasoft.io.IOFactory;
import empresasoft.io.Input;
import empresasoft.io.Output;

public class FrameFactory implements IOFactory {
    @Override
    public Input createInput() {
        return new FrameInput();
    }

    @Override
    public Output createOutput() {
        return new FrameOutput();
    }
}

package empresasoft.io.frame;

import javax.swing.JOptionPane;
import empresasoft.io.Input;  

public class FrameInput implements Input {
    @Override
    public String getData(String msg) {
        String mens = JOptionPane.showInputDialog(null, msg);
        return mens;
    }
}

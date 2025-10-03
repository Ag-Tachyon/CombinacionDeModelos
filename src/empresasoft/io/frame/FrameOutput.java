package empresasoft.io.frame;

import javax.swing.JOptionPane;

import empresasoft.io.Output;

public class FrameOutput implements Output {
    @Override
    public void showData(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }
}
package empresasoft.io.console;


import java.util.Scanner;

import empresasoft.io.Input;

public class ConsoleInput implements Input {
    private Scanner sc = new Scanner(System.in);

    @Override
    public String getData(String msg) {
        System.out.print(msg + ": ");
        return sc.nextLine();
    }
}

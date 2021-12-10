import javax.swing.*;
import java.net.MalformedURLException;

public class SearchValvesMain {

    public static void main(String[] args) throws MalformedURLException {
        //Криво работающий Нимбус стиль:
        // (не передвигать связку try-cath дальше создания объекта Armatura)------------------------------------------
        try {

            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");

        } catch (Exception ignored) {
        }
        //------------------------------------------------------------------------------------------------------------
        Armatura progSwing = new  Armatura();
        progSwing.pack();
        progSwing.setVisible(true);
    }
}



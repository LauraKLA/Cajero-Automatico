import javax.swing.JOptionPane;

import Modelos.CienMil;
import Modelos.CincoMil;
import Modelos.CincuentaMil;
import Modelos.DiezMil;
import Modelos.IDispensador;
import Modelos.VeinteMil;

public class App {

    private CienMil cadenaDispensadores;

    public App() {
        this.cadenaDispensadores = new CienMil();

        IDispensador CincuentaMil = new CincuentaMil();
        IDispensador VeinteMil = new VeinteMil();
        IDispensador DiezMil = new DiezMil();
        IDispensador CincoMil = new CincoMil();

        cadenaDispensadores.setSucesor(CincuentaMil);
        CincuentaMil.setSucesor(VeinteMil);
        VeinteMil.setSucesor(DiezMil);
        DiezMil.setSucesor(CincoMil);

    }

    public void retirar(int cantidad) {

        if (cantidad % 5000 != 0) {
            JOptionPane.showMessageDialog(null, "Error: La cantidad debe ser un múltiplo de 5000");
            return;

        }

        cadenaDispensadores.dispensar(cantidad);
    }

    public static void main(String[] args) {
        App cj = new App();

        int cantidad;
        do {
            String input = JOptionPane.showInputDialog("Ingrese el monto que desea retirar");
            cantidad = Integer.parseInt(input);
            if (cantidad % 5000 != 0) {
                JOptionPane.showMessageDialog(null, "El valor ingresado no es válido. Intente nuevamente.");
            }
        } while (cantidad % 5000 != 0);

        cj.retirar(cantidad);
    }
}
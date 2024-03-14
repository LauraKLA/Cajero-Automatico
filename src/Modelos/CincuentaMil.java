package Modelos;

import javax.swing.JOptionPane;

public class CincuentaMil implements IDispensador {

    private IDispensador sucesor;

    @Override
    public void peticion(int monto) {
    }

    @Override
    public IDispensador getSucesor() {
        return sucesor;
    }

    @Override
    public void setSucesor(IDispensador sucesor) {
        this.sucesor = sucesor;
    }

    public void dispensar(int cantidad) {

        int numBilletes = cantidad / 50000;

        if (numBilletes > 0) {
            JOptionPane.showMessageDialog(null, "Entregando" + " " + numBilletes + " " + "Billete de 50.000 pesos");
        }

        int cantidadRestante = cantidad % 50000;

        if (cantidadRestante > 0 && sucesor != null) {
            ((IDispensador) sucesor).dispensar(cantidadRestante);

        }
    }
}
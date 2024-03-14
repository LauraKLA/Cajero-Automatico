package Modelos;

public interface IDispensador {

    public void peticion(int monto);

    public void setSucesor(IDispensador sucesor);

    public IDispensador getSucesor();

    public void dispensar(int cantidad);

}

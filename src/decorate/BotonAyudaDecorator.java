package decorate;

public class BotonAyudaDecorator  extends VentanaDecorador{
    public BotonAyudaDecorator(Ventana decVentana) {
        super(decVentana);
    }
    public void dibujar() {
        dibujarBotonAyuda();
        decoradorVentana.dibujar();
    }
    private void dibujarBotonAyuda() {
        // dibujamos el botón de ayuda
    }
    public String getDescripcion() {
        return decoradorVentana.getDescripcion() + ", con botón de ayuda";
    }
}

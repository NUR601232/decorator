package decorate;

public class BorderDecorator extends VentanaDecorador {
    //protected Ventana decoradorVentana;
    public BorderDecorator(Ventana decVentana) {
        super(decVentana);
    }
    public void dibujar() {
        dibujarBorde();
        decoradorVentana.dibujar();
    }
    private void dibujarBorde() {
        // dibujamos el borde de la ventana
    }
    public String getDescripcion() {
        return decoradorVentana.getDescripcion() + ", con borde";
    }
}

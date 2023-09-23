package decorate;

import midecorator.CuentaDecorador;
import midecorator.RolDecorador;
import midecorator.Usuario;
import midecorator.UsuarioConcreto;

public abstract class VentanaDecorador implements Ventana{
    protected Ventana decoradorVentana;
    public VentanaDecorador (Ventana decVentana) {
        this.decoradorVentana = decVentana;
    }


    @Override
    public void dibujar() {

    }

    @Override
    public String getDescripcion() {
        return null;
    }
}

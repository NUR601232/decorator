package midecorator;

public class CuentaDecorador extends UsuarioDecorador{
    //protected Usuario decoradorUsuario;
    protected int cuenta;
    public CuentaDecorador(Usuario decUsuario, int cuenta) {
        super(decUsuario);
        this.cuenta=cuenta;
    }

    @Override
    public String getDescripcion() {
        return decoradorUsuario.getDescripcion()+ " con la cuenta "+this.cuenta;
    }
}

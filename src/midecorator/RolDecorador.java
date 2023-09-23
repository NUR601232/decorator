package midecorator;

public class RolDecorador extends UsuarioDecorador{
    public String rol;
    public RolDecorador(Usuario decUsuario, String rol) {
        super(decUsuario);
        this.rol = rol;
    }

    @Override
    public String getDescripcion() {
        return decoradorUsuario.getDescripcion()+" con el rol de "+this.rol;
    }
}

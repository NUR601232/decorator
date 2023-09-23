package midecorator;

import decorate.Ventana;

public class UsuarioDecorador implements Usuario{
    protected Usuario decoradorUsuario;
    public UsuarioDecorador (Usuario decUsuario) {
        this.decoradorUsuario = decUsuario;
    }
    @Override
    public String getDescripcion() {
        return null;
    }

    @Override
    public Boolean register(String nombre, String correo, String contrasenha) {
        return null;
    }

    @Override
    public String login(String correo, String contrasenha) {
        return null;
    }
}

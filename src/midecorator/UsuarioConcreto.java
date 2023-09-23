package midecorator;

public class UsuarioConcreto implements Usuario {
    public String nombre;
    public String correo;
    public String Contrasenha;

    public UsuarioConcreto(String nombre, String correo, String contrasenha) {
        this.nombre = nombre;
        this.correo = correo;
        Contrasenha = contrasenha;
    }

    @Override
    public String getDescripcion() {
        return this.nombre;
    }

    @Override
    public Boolean register(String nombre, String correo, String contrasenha) {
        this.nombre= nombre;
        this.Contrasenha=contrasenha;
        this.correo= correo;
        return true;
    }

    @Override
    public String login(String correo, String Contrasenha) {

        return "devuelvejwt";
    }
}

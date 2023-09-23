package midecorator;

public interface Usuario {
    public String getDescripcion();
    public Boolean register(String nombre, String correo, String contrasenha);
    public String login(String correo, String contrasenha);
}

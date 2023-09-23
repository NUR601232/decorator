import decorate.*;
import midecorator.CuentaDecorador;
import midecorator.RolDecorador;
import midecorator.Usuario;
import midecorator.UsuarioConcreto;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Usuario usuario= new UsuarioConcreto("marco","marco10@gmail.com", "mark12");
        Usuario rol=new RolDecorador(new UsuarioConcreto("marco","marco10@gmail.com", "mark12"), "admin");
        Usuario cuenta = new CuentaDecorador(rol, 12);
        Usuario cuentaSinRol = new CuentaDecorador(usuario, 25);
        System.out.println(usuario.getDescripcion());
        System.out.println(rol.getDescripcion());
        System.out.println(cuenta.getDescripcion());
        System.out.println(cuentaSinRol.getDescripcion());
    }
}

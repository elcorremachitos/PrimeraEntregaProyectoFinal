package co.edu.uniquindio.poo;

public class Autenticacion {
    public boolean iniciarSesion(Usuario usuario, String password) {
        return usuario.getPassword().equals(password);
    }
}


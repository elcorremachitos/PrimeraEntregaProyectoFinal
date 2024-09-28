package co.edu.uniquindio.poo;


import java.io.Serializable;

public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;

    private String nombre;
    private String cedula;
    private String password;

    //Excepcion 8 

    public void autenticar(String password) throws AutenticacionFallidaException {
        if (!this.password.equals(password)) {
            throw new AutenticacionFallidaException("La autenticación ha fallado. Contraseña incorrecta.");
        }
        System.out.println("Autenticación exitosa.");
    }
    

    

    // Constructor con builder
    public Usuario(String nombre, String cedula, String password) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", cedula='" + cedula + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

   
}

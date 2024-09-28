package co.edu.uniquindio.poo;


public class Administrador extends Usuario {
    private static final long serialVersionUID = 1L;

    // Constructor con builder
    private Administrador(AdministradorBuilder builder) {
        super(builder.nombre, builder.cedula, builder.password);
    }

    // Builder
    public static class AdministradorBuilder {
        private String nombre;
        private String cedula;
        private String password;

        public AdministradorBuilder setNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public AdministradorBuilder setCedula(String cedula) {
            this.cedula = cedula;
            return this;
        }

        public AdministradorBuilder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Administrador build() {
            return new Administrador(this);
        }
    }

    // Getters y Setters
    public String getNombre() {
        return super.getNombre();
    }

    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    public String getCedula() {
        return super.getCedula();
    }

    public void setCedula(String cedula) {
        super.setCedula(cedula);
    }

    public String getPassword() {
        return super.getPassword();
    }

    public void setPassword(String password) {
        super.setPassword(password);
    }

    @Override
    public String toString() {
        return "Administrador{" +
                "nombre='" + getNombre() + '\'' +
                ", cedula='" + getCedula() + '\'' +
                '}';
    }
}

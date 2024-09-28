package co.edu.uniquindio.poo;

import java.io.Serializable;
import java.util.Date;

public class Comentario implements Serializable {
    private static final long serialVersionUID = 1L;

    private String mensaje;
    private Date fecha;
    private Vendedor autor;
    private Producto producto;

    // Constructor con builder
    private Comentario(ComentarioBuilder builder) {
        this.mensaje = builder.mensaje;
        this.fecha = builder.fecha;
        this.autor = builder.autor;
        this.producto = builder.producto;
    }

    // Builder
    public static class ComentarioBuilder {
        private String mensaje;
        private Date fecha;
        private Vendedor autor;
        private Producto producto;

        public ComentarioBuilder setMensaje(String mensaje) {
            this.mensaje = mensaje;
            return this;
        }

        public ComentarioBuilder setFecha(Date fecha) {
            this.fecha = fecha;
            return this;
        }

        public ComentarioBuilder setAutor(Vendedor autor) {
            this.autor = autor;
            return this;
        }

        public ComentarioBuilder setProducto(Producto producto) {
            this.producto = producto;
            return this;
        }

        public Comentario build() {
            return new Comentario(this);
        }
    }

    @Override
    public String toString() {
        return "Comentario{" +
                "mensaje='" + mensaje + '\'' +
                ", fecha=" + fecha +
                ", autor=" + autor +
                ", producto=" + producto +
                '}';
    }
}

package co.edu.uniquindio.poo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Chat implements Serializable {
    private static final long serialVersionUID = 1L;

    private List<Mensaje> mensajes;
    private List<Vendedor> participantes;

    // Constructor con builder
    private Chat(ChatBuilder builder) {
        this.mensajes = builder.mensajes;
        this.participantes = builder.participantes;
    }

    //Excepcion 5
    public void enviarMensaje(Mensaje mensaje) throws MensajeInvalidoException {
        if (mensaje.getContenidoTexto() == null || mensaje.getContenidoTexto().trim().isEmpty()) {
            throw new MensajeInvalidoException("El mensaje no puede estar vacío.");
        }
        mensajes.add(mensaje);
        System.out.println("Mensaje enviado correctamente.");
    }
        

    // Builder
    public static class ChatBuilder {
        private List<Mensaje> mensajes = new ArrayList<>();
        private List<Vendedor> participantes = new ArrayList<>();

        public ChatBuilder setMensajes(List<Mensaje> mensajes) {
            this.mensajes = mensajes;
            return this;
        }

        public ChatBuilder setParticipantes(List<Vendedor> participantes) {
            this.participantes = participantes;
            return this;
        }

        public Chat build() {
            return new Chat(this);
        }
    }

    @Override
    public String toString() {
        return "Chat{" +
                "mensajes=" + mensajes +
                ", participantes=" + participantes +
                '}';
    }
}

// Clase principal para ejecutar el ejemplo del patrón Observer
public class MainObserver {
    public static void main(String[] args) {
        EventOrganizer evento = new EventOrganizer(); // Crea el organizador del evento

        // Crea invitados
        Invitado invitado1 = new Invitado("Juan");
        Invitado invitado2 = new Invitado("Maria");

        // Suscribe a los invitados al evento
        evento.suscribir(invitado1);
        evento.suscribir(invitado2);

        // Notifica a los invitados sobre un cambio en el evento
        evento.notificar("¡El evento ha sido confirmado!");
    }
}
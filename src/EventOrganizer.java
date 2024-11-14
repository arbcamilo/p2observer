// Clase que implementa el Subject
import java.util.ArrayList;
import java.util.List;

class EventOrganizer implements Subject {
    private List<Observer> observers = new ArrayList<>(); // Lista de observadores (invitados)

    @Override
    public void suscribir(Observer observer) {
        observers.add(observer); // Agrega un nuevo observador
        System.out.println(((Invitado) observer).getNombre() + " se ha suscrito a las actualizaciones del evento."); // Mensaje de confirmación
    }

    @Override
    public void notificar(String mensaje) {
        System.out.println("Notificando a los invitados: " + mensaje); // Mensaje para los invitados
        for (Observer observer : observers) {
            observer.actualizar(mensaje); // Notifica a cada observador
        }
    }
}
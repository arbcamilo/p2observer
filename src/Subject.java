// Interfaz que define las operaciones del tema (Subject)
interface Subject {
    void suscribir(Observer observer); // Método para suscribir un nuevo observador
    void notificar(String mensaje); // Método para notificar a todos los observadores
}
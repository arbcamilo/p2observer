// Clase que representa a un invitado, implementando la interfaz Observer
class Invitado implements Observer {
    private String nombre; // Nombre del invitado

    public Invitado(String nombre) {
        this.nombre = nombre; // Inicializa el nombre al crear el objeto
    }

    public String getNombre() {
        return nombre; // Método para obtener el nombre del invitado
    }

    // Método que recibe la notificación del sujeto
    @Override
    public void actualizar(String mensaje) {
        System.out.println(nombre + " recibió la notificación: " + mensaje);
    }
}
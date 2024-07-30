public class PantallaTemperatura implements Observador {
    @Override
    public void actualizar(int temperatura) {
        System.out.println("Pantalla de temperatura: La temperatura actual es " + temperatura + " grados centigrados.");
    }
}
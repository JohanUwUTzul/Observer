public class AdvertenciaMeteorologica implements Observador {
    private static final int UMBRAL_ADVERTENCIA = 30;

    @Override
    public void actualizar(int temperatura) {
        if (temperatura > UMBRAL_ADVERTENCIA) {
            System.out.println("Advertencia Meteorologica: ¡La temperatura está por encima de lo normal " + UMBRAL_ADVERTENCIA + " esto en grados centigrados!");
        }
    }
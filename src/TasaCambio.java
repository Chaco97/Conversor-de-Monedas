public class TasaCambio {
    private String codigoBase;    // 'base_code' renombrado a 'codigoBase'
    private String codigoObjetivo; // 'target_code' renombrado a 'codigoObjetivo'
    private double tasaConversion; // 'conversion_rate' renombrado a 'tasaConversion'

    // Método para obtener el código de la moneda base
    public String obtenerCodigoBase() {
        return codigoBase;
    }

    // Método para establecer el código de la moneda base
    public void establecerCodigoBase(String codigoBase) {
        this.codigoBase = codigoBase;
    }

    // Método para obtener el código de la moneda objetivo
    public String obtenerCodigoObjetivo() {
        return codigoObjetivo;
    }

    // Método para establecer el código de la moneda objetivo
    public void establecerCodigoObjetivo(String codigoObjetivo) {
        this.codigoObjetivo = codigoObjetivo;
    }

    // Método para obtener la tasa de conversión
    public double obtenerTasaConversion() {
        return tasaConversion;
    }

    // Método para establecer la tasa de conversión
    public void establecerTasaConversion(double tasaConversion) {
        this.tasaConversion = tasaConversion;
    }
}

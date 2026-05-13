public class CamionetaSUV extends Vehiculo {
    
    private String Traccion;
    private float CapacidadMaletero;
    public CamionetaSUV(String traccion, float capacidadMaletero) {
        Traccion = traccion;
        CapacidadMaletero = capacidadMaletero;
    }
    public CamionetaSUV(String placa, String marca, int modelo, float precioDiario, String traccion,
            float capacidadMaletero) {
        super(placa, marca, modelo, precioDiario);
        Traccion = traccion;
        CapacidadMaletero = capacidadMaletero;
    }
    public String getTraccion() {
        return Traccion;
    }
    public void setTraccion(String traccion) {
        Traccion = traccion;
    }
    public float getCapacidadMaletero() {
        return CapacidadMaletero;
    }
    public void setCapacidadMaletero(float capacidadMaletero) {
        CapacidadMaletero = capacidadMaletero;
    }

    
}

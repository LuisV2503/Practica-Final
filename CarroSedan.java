public class CarroSedan extends Vehiculo{
    
    private String TipoCombustible;
    private String Transmision;
    public CarroSedan() {
    }
    public CarroSedan(String placa, String marca, int modelo, float precioDiario) {
        super(placa, marca, modelo, precioDiario);
    }
    public String getTipoCombustible() {
        return TipoCombustible;
    }
    public void setTipoCombustible(String tipoCombustible) {
        TipoCombustible = tipoCombustible;
    }
    public String getTransmision() {
        return Transmision;
    }
    public void setTransmision(String transmision) {
        Transmision = transmision;
    }

    
}

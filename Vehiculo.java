public class Vehiculo {
    
    private String Placa;
    private String Marca;
    private int Modelo;
    private float PrecioDiario;
    public Vehiculo() {
    }
    public Vehiculo(String placa, String marca, int modelo, float precioDiario) {
        Placa = placa;
        Marca = marca;
        Modelo = modelo;
        PrecioDiario = precioDiario;
    }
    public String getPlaca() {
        return Placa;
    }
    public void setPlaca(String placa) {
        Placa = placa;
    }
    public String getMarca() {
        return Marca;
    }
    public void setMarca(String marca) {
        Marca = marca;
    }
    public int getModelo() {
        return Modelo;
    }
    public void setModelo(int modelo) {
        Modelo = modelo;
    }
    public float getPrecioDiario() {
        return PrecioDiario;
    }
    public void setPrecioDiario(float precioDiario) {
        PrecioDiario = precioDiario;
    }

    
}

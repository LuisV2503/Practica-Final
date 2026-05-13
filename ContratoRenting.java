import java.time.LocalDate;

public class ContratoRenting {
    private String IdContrato;
    private String CedulaCliente;
    private String PlacaVehiculo;
    private LocalDate FechaInicio;
    private LocalDate FechaFin;
    private int TotalDias;
    private float ValorTotal;
    public ContratoRenting() {
    }
    public ContratoRenting(String idContrato, String cedulaCliente, String placaVehiculo, LocalDate fechaInicio,
            LocalDate fechaFin, int totalDias, float valorTotal) {
        IdContrato = idContrato;
        CedulaCliente = cedulaCliente;
        PlacaVehiculo = placaVehiculo;
        FechaInicio = fechaInicio;
        FechaFin = fechaFin;
        TotalDias = totalDias;
        ValorTotal = valorTotal;
    }
    public String getIdContrato() {
        return IdContrato;
    }
    public void setIdContrato(String idContrato) {
        IdContrato = idContrato;
    }
    public String getCedulaCliente() {
        return CedulaCliente;
    }
    public void setCedulaCliente(String cedulaCliente) {
        CedulaCliente = cedulaCliente;
    }
    public String getPlacaVehiculo() {
        return PlacaVehiculo;
    }
    public void setPlacaVehiculo(String placaVehiculo) {
        PlacaVehiculo = placaVehiculo;
    }
    public LocalDate getFechaInicio() {
        return FechaInicio;
    }
    public void setFechaInicio(LocalDate fechaInicio) {
        FechaInicio = fechaInicio;
    }
    public LocalDate getFechaFin() {
        return FechaFin;
    }
    public void setFechaFin(LocalDate fechaFin) {
        FechaFin = fechaFin;
    }
    public int getTotalDias() {
        return TotalDias;
    }
    public void setTotalDias(int totalDias) {
        TotalDias = totalDias;
    }
    public float getValorTotal() {
        return ValorTotal;
    }
    public void setValorTotal(float valorTotal) {
        ValorTotal = valorTotal;
    }

    
}

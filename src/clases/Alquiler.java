package clases;

import java.time.LocalDate;

public class Alquiler {

    private int numAlquiler;
    private LocalDate fechContrato;
    private int cantMeses;
    private int numAdultos;
    private int numNiños;
    private double depositoGarantia;
    private double precioAlquiler;
    private double porcIncremAnual;
    private Inquilino inquilino;
    private Vivienda vivienda;
    private String estado;

    public Alquiler(int numAlquiler, LocalDate fechContrato, int cantMeses, int numAdultos, int numNiños,
            double depositoGarantia, double precioAlquiler, double porcIncremAnual, Inquilino inquilino,
            Vivienda vivienda, String estado) {
        this.numAlquiler = numAlquiler;
        this.fechContrato = fechContrato;
        this.cantMeses = cantMeses;
        this.numAdultos = numAdultos;
        this.numNiños = numNiños;
        this.depositoGarantia = depositoGarantia;
        this.precioAlquiler = precioAlquiler;
        this.porcIncremAnual = porcIncremAnual;
        this.inquilino = inquilino;
        this.vivienda = vivienda;
        this.estado = estado;
    }

    public Alquiler() {
        this.numAlquiler = 0;
        this.fechContrato = null;
        this.cantMeses = 0;
        this.numAdultos = 0;
        this.numNiños = 0;
        this.depositoGarantia = 0.0;
        this.precioAlquiler = 0.0;
        this.porcIncremAnual = 0.0;
        this.estado = "";
    }


    public int getNumAlquiler() {
        return numAlquiler;
    }

    public void setNumAlquiler(int numAlquiler) {
        this.numAlquiler = numAlquiler;
    }

    public LocalDate getFechContrato() {
        return fechContrato;
    }

    public void setFechContrato(LocalDate fechContrato) {
        this.fechContrato = fechContrato;
    }

    public int getCantMeses() {
        return cantMeses;
    }

    public void setCantMeses(int cantMeses) {
        this.cantMeses = cantMeses;
    }

    public int getNumAdultos() {
        return numAdultos;
    }

    public void setNumAdultos(int numAdultos) {
        this.numAdultos = numAdultos;
    }

    public int getNumNiños() {
        return numNiños;
    }

    public void setNumNiños(int numNiños) {
        this.numNiños = numNiños;
    }

    public double getDepositoGarantia() {
        return depositoGarantia;
    }

    public void setDepositoGarantia(double depositoGarantia) {
        this.depositoGarantia = depositoGarantia;
    }

    public double getPrecioAlquiler() {
        return precioAlquiler;
    }

    public void setPrecioAlquiler(double precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    public double getPorcIncremAnual() {
        return porcIncremAnual;
    }

    public void setPorcIncremAnual(double porcIncremAnual) {
        this.porcIncremAnual = porcIncremAnual;
    }

    public Vivienda getVivienda() {
        return vivienda;
    }

    public void setVivienda(Vivienda vivienda) {
        this.vivienda = vivienda;
    }

    public Inquilino getInquilino() {
        return inquilino;
    }

    public void setInquilino(Inquilino inquilino) {
        this.inquilino = inquilino;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Alquiler{"
                + "numAlquiler=" + numAlquiler
                + ", fechContrato=" + fechContrato
                + ", cantMeses=" + cantMeses
                + ", numAdultos=" + numAdultos
                + ", numNiños=" + numNiños
                + ", depositoGarantia=" + depositoGarantia
                + ", precioAlquiler=" + precioAlquiler
                + ", porcIncremAnual=" + porcIncremAnual
                + ", inquilino=" + inquilino
                + ", vivienda=" + vivienda
                + ", estado='" + estado + '\''
                + '}';
    }

    public Object[] toObjectArray() {
        return new Object[]{
            numAlquiler,
            fechContrato,
            cantMeses,
            numAdultos,
            numNiños,
            depositoGarantia,
            precioAlquiler,
            porcIncremAnual,
            estado
        };
    }

    public boolean isActive() {
        LocalDate currentDate = LocalDate.now();

        LocalDate startDate = fechContrato;
        LocalDate endDate = fechContrato.plusMonths(cantMeses);

        return (currentDate.isEqual(startDate) || currentDate.isAfter(startDate))
                && (currentDate.isEqual(endDate) || currentDate.isBefore(endDate));
    }

}

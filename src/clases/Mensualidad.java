package clases;

import java.time.LocalDate;

public class Mensualidad {

    private static int consecutivo = 1;
    private Alquiler numAlquiler;
    private LocalDate fechCreacion;
    private Inquilino nomInquilino;
    private int mesCobro;
    private int añoActual;
    private Alquiler descuento;
    private double montoMes;
    private String estado;
    private Alquiler alquiler;
    private Inquilino inquilino;
    private Vivienda vivienda;

    public Mensualidad(Alquiler numAlquiler, LocalDate fechCreacion, Inquilino nomInquilino, int mesCobro, int añoActual,
            Alquiler descuento, double montoMes, String estado, Alquiler alquiler, Inquilino inquilino, Vivienda vivienda) {
        this.numAlquiler = numAlquiler;
        this.fechCreacion = fechCreacion;
        this.nomInquilino = nomInquilino;
        this.mesCobro = mesCobro;
        this.añoActual = añoActual;
        this.descuento = descuento;
        this.montoMes = montoMes;
        this.estado = estado;
        this.alquiler = alquiler;
        this.inquilino = inquilino;
        this.vivienda = vivienda;
    }

    public Vivienda getVivienda() {
        return vivienda;
    }

    public void setVivienda(Vivienda vivienda) {
        this.vivienda = vivienda;
    }

    public static int getConsecutivo() {
        return consecutivo;
    }

    public static void setConsecutivo(int consecutivo) {
        Mensualidad.consecutivo = consecutivo;
    }

    public Alquiler getNumAlquiler() {
        return numAlquiler;
    }

    public void setNumAlquiler(Alquiler numAlquiler) {
        this.numAlquiler = numAlquiler;
    }

    public LocalDate getFechCreacion() {
        return fechCreacion;
    }

    public void setFechCreacion(LocalDate fechCreacion) {
        this.fechCreacion = fechCreacion;
    }

    public Inquilino getNomInquilino() {
        return nomInquilino;
    }

    public void setNomInquilino(Inquilino nomInquilino) {
        this.nomInquilino = nomInquilino;
    }

    public int getMesCobro() {
        return mesCobro;
    }

    public void setMesCobro(int mesCobro) {
        this.mesCobro = mesCobro;
    }

    public int getAñoActual() {
        return añoActual;
    }

    public void setAñoActual(int añoActual) {
        this.añoActual = añoActual;
    }

    public Alquiler getDescuento() {
        return descuento;
    }

    public void setDescuento(Alquiler descuento) {
        this.descuento = descuento;
    }

    public double getMontoMes() {
        return montoMes;
    }

    public void setMontoMes(double montoMes) {
        this.montoMes = montoMes;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Alquiler getAlquiler() {
        return alquiler;
    }

    public void setAlquiler(Alquiler alquiler) {
        this.alquiler = alquiler;
    }

    public Inquilino getInquilino() {
        return inquilino;
    }

    public void setInquilino(Inquilino inquilino) {
        this.inquilino = inquilino;
    }

    

}

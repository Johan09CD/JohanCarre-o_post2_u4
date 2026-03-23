package com.universidad.pedidos;

public class Pedido {

    private String id;
    private String producto;
    private int cantidad;
    private double precioUnitario;
    private boolean envioExpress;
    private String estado;

    public Pedido(String id, String producto, int cantidad, double precioUnitario, boolean envioExpress) {
        this.id = id;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.envioExpress = envioExpress;
        this.estado = "PENDIENTE";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public boolean isEnvioExpress() {
        return envioExpress;
    }

    public void setEnvioExpress(boolean envioExpress) {
        this.envioExpress = envioExpress;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author white
 */
public class Gasto {
    
    private String CodGasto, MontoGasto, Categoria, FrecDiaria, fecha, hora, metodoPago;


    public Gasto() {
    }

    public String getCodGasto() {
        return CodGasto;
    }

    public void setCodGasto(String CodGasto) {
        this.CodGasto = CodGasto;
    }

    public String getMontoGasto() {
        return MontoGasto;
    }

    public void setMontoGasto(String MontoGasto) {
        this.MontoGasto = MontoGasto;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public String getFrecDiaria() {
        return FrecDiaria;
    }

    public void setFrecDiaria(String FrecDiaria) {
        this.FrecDiaria = FrecDiaria;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }
    
    
}

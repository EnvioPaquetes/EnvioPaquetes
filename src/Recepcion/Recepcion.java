/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Recepcion;

/**
 *
 * @author karloz
 */
import Clientes.DatosPersonales;
import Empresa.Sucursal;
public class Recepcion {
     String Destinatario;
     DatosPersonales Remitente;
     String TipoPaquete;
     String DescripcionPaquete;
     Sucursal Procedencia;
     boolean Recibio;
     String FechaRecepción;

    public String getDestinatario() {
        return Destinatario;
    }

    public void setDestinatario(String Destinatario) {
        this.Destinatario = Destinatario;
    }

    public DatosPersonales getRemitente() {
        return Remitente;
    }

    public void setRemitente(DatosPersonales Remitente) {
        this.Remitente = Remitente;
    }

    public String getTipoPaquete() {
        return TipoPaquete;
    }

    public void setTipoPaquete(String TipoPaquete) {
        this.TipoPaquete = TipoPaquete;
    }

    public String getDescripcionPaquete() {
        return DescripcionPaquete;
    }

    public void setDescripcionPaquete(String DescripcionPaquete) {
        this.DescripcionPaquete = DescripcionPaquete;
    }

    public Sucursal getProcedencia() {
        return Procedencia;
    }

    public void setProcedencia(Sucursal Procedencia) {
        this.Procedencia = Procedencia;
    }

    public boolean isRecibio() {
        return Recibio;
    }

    public void setRecibio(boolean Recibio) {
        this.Recibio = Recibio;
    }

    public String getFechaRecepción() {
        return FechaRecepción;
    }

    public void setFechaRecepción(String FechaRecepción) {
        this.FechaRecepción = FechaRecepción;
    }
}

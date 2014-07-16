/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Registro;

/**
 *
 * @author karloz
 */
public class Paquetes {
    String CedulaRemitente;
    String NombreRemitente;
    Integer CantidadPaquetes;
    String PesoPaquetes;
    String PrecioEnvio;
    String CodigoPaquete;

    public String getCedulaRemitente() {
        return CedulaRemitente;
    }

    public void setCedulaRemitente(String CedulaRemitente) {
        this.CedulaRemitente = CedulaRemitente;
    }

    public String getNombreRemitente() {
        return NombreRemitente;
    }

    public void setNombreRemitente(String NombreRemitente) {
        this.NombreRemitente = NombreRemitente;
    }

    public Integer getCantidadPaquetes() {
        return CantidadPaquetes;
    }

    public void setCantidadPaquetes(Integer CantidadPaquetes) {
        this.CantidadPaquetes = CantidadPaquetes;
    }

    public String getPesoPaquetes() {
        return PesoPaquetes;
    }

    public void setPesoPaquetes(String PesoPaquetes) {
        this.PesoPaquetes = PesoPaquetes;
    }

    public String getPrecioEnvio() {
        return PrecioEnvio;
    }

    public void setPrecioEnvio(String PrecioEnvio) {
        this.PrecioEnvio = PrecioEnvio;
    }

    public String getCodigoPaquete() {
        return CodigoPaquete;
    }

    public void setCodigoPaquete(String CodigoPaquete) {
        this.CodigoPaquete = CodigoPaquete;
    }
}

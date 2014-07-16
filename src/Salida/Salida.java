/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Salida;

/**
 *
 * @author karloz
 */
import Empresa.Empleados;
public class Salida {
    String Municipio;
    String Barrio;
    String Dirreccion;
    String Conductor;
    Integer CedulaDestinatario;
    String NombreDestinatario;

    public String getMunicipio() {
        return Municipio;
    }

    public void setMunicipio(String Municipio) {
        this.Municipio = Municipio;
    }

    public String getBarrio() {
        return Barrio;
    }

    public void setBarrio(String Barrio) {
        this.Barrio = Barrio;
    }

    public String getDirreccion() {
        return Dirreccion;
    }

    public void setDirreccion(String Dirreccion) {
        this.Dirreccion = Dirreccion;
    }

    public String getConductor() {
        return Conductor;
    }

    public void setConductor(String Conductor) {
        this.Conductor = Conductor;
    }

    public Integer getCedulaDestinatario() {
        return CedulaDestinatario;
    }

    public void setCedulaDestinatario(Integer CedulaDestinatario) {
        this.CedulaDestinatario = CedulaDestinatario;
    }

    public String getNombreDestinatario() {
        return NombreDestinatario;
    }

    public void setNombreDestinatario(String NombreDestinatario) {
        this.NombreDestinatario = NombreDestinatario;
    }
     
   

}

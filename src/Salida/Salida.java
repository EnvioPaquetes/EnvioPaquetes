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
    String direccionDestino;
    String cedDestinatario;
    Empleados Conductor;
    String Destinatario;

    public String getDireccionDestino() {
        return direccionDestino;
    }

    public void setDireccionDestino(String direccionDestino) {
        this.direccionDestino = direccionDestino;
    }

    public String getCedDestinatario() {
        return cedDestinatario;
    }

    public void setCedDestinatario(String cedDestinatario) {
        this.cedDestinatario = cedDestinatario;
    }

    public Empleados getConductor() {
        return Conductor;
    }

    public void setConductor(Empleados Conductor) {
        this.Conductor = Conductor;
    }

    public String getDestinatario() {
        return Destinatario;
    }

    public void setDestinatario(String Destinatario) {
        this.Destinatario = Destinatario;
    }
}

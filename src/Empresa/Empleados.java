/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Empresa;

/**
 *
 * @author karloz
 */
public class Empleados {
   String Cedula; 
   String Nombre;
   String Apellido;
   String Teléfono;
   String Dirección;
   String Email;
   String Cargo;
   String EsperienciaLaboral;
   String Barrio;

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getTeléfono() {
        return Teléfono;
    }

    public void setTeléfono(String Teléfono) {
        this.Teléfono = Teléfono;
    }

    public String getDirección() {
        return Dirección;
    }

    public void setDirección(String Dirección) {
        this.Dirección = Dirección;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getEsperienciaLaboral() {
        return EsperienciaLaboral;
    }

    public void setEsperienciaLaboral(String EsperienciaLaboral) {
        this.EsperienciaLaboral = EsperienciaLaboral;
    }
}

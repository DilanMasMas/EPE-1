/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

/**
 *
 * @author Dilan
 */
public class mostrarcliente {
        int id_c;
	String nombre;
	String direccion;
        int rut;
        int libro_p;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getId_c() {
		return id_c;
	}
	public void setId_c(int id_l) {
		this.id_c = id_c;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
        public int getLibro_p() {
		return libro_p;
	}
	public void setLibro_p(int libro_p) {
		this.libro_p = libro_p;
	}
	public int getRut() {
		return rut;
	}
	public void setRut(int rut) {
		this.rut = rut;
	}
}

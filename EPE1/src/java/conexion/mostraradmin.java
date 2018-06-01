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
public class mostraradmin {
      	int id_u;
	String nombre;
	String cargo;
	String nombre_u;
        String contraseña;
	public String getnombre() {
		return nombre;
	}
	public void setnombre(String nombre) {
		this.nombre = nombre;
	}
	public int getId_u() {
		return id_u;
	}
	public void setId_l(int id_u) {
		this.id_u = id_u;
	}
	public String getcargo() {
		return cargo;
	}
	public void setcargo(String cargo) {
		this.cargo = cargo;
	}
        public String getnombre_u() {
		return nombre_u;
	}
	public void setnombre_u(String nombre_u) {
		this.nombre_u = nombre_u;
	}
	public String getcontraseña() {
		return contraseña;
	}
	public void setStock(String contraseña) {
		this.contraseña = contraseña;
	}
}

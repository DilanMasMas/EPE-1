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
public class mostrarlibros {
    	int id_l;
	String libro;
	String autor;
	String genero;
        int stock;
	public String getLibro() {
		return libro;
	}
	public void setLibro(String libro) {
		this.libro = libro;
	}
	public int getId_l() {
		return id_l;
	}
	public void setId_l(int id_l) {
		this.id_l = id_l;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
        public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
}


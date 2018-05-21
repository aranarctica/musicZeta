package modelo;

public class Grupo extends Conector {
	private int idGrupo;
	private String nombre;
	private String contrasena;
	private String email;
	private String telefono;
	private String integrantes;

	public int getIdGrupo() {
		return idGrupo;
	}

	public void setIdGrupo(int idGrupo) {
		this.idGrupo = idGrupo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getIntegrantes() {
		return integrantes;
	}

	public void setIntegrantes(String integrantes) {
		this.integrantes = integrantes;
	}

	@Override
	public String toString() {
		return "Grupo [idGrupo=" + idGrupo + ", nombre=" + nombre + ", contrasena=" + contrasena + ", email=" + email
				+ ", telefono=" + telefono + ", integrantes=" + integrantes + "]";
	}
	
	
}

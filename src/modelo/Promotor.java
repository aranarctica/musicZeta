package modelo;

public class Promotor extends Conector {

	private int idPromotor;
	private String nombre;
	private String apellido;
	private String telefono;
	private String dni;
	private String email;
	private String contrasena;

	public int getIdPromotor() {
		return idPromotor;
	}

	public void setIdPromotor(int idPromotor) {
		this.idPromotor = idPromotor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

}

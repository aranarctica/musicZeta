package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class GrupoModelo extends Conector {

	public ArrayList<Grupo> selectAll() {
		ArrayList<Grupo> grupos = new ArrayList<Grupo>();

		try {
			Statement st = super.conexion.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM grupo");
			while (rs.next()) {
				Grupo grupo = new Grupo();
				grupo.setIdGrupo(rs.getInt("idGrupo"));
				grupo.setNombre(rs.getString("nombre"));
				grupo.setEmail(rs.getString("email"));
				grupo.setContrasena(rs.getString("contrasena"));
				grupo.setTelefono(rs.getString("telefono"));
				grupo.setIntegrantes(rs.getString("integrantes"));
				grupos.add(grupo);

			}
			return grupos;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return grupos;
	}

	public Grupo selectPorid(int idGrupo) {

		try {
			PreparedStatement pst = super.conexion.prepareStatement("SELECT * FROM grupo WHERE idGrupo=?");
			pst.setInt(1, idGrupo);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				Grupo grupo = new Grupo();
				grupo.setIdGrupo(rs.getInt("idGrupo"));
				grupo.setNombre(rs.getString("nombre"));
				grupo.setEmail(rs.getString("email"));
				grupo.setContrasena(rs.getString("contrasena"));
				grupo.setTelefono(rs.getString("telefono"));
				grupo.setIntegrantes(rs.getString("integrantes"));
				;
				return grupo;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void insert(Grupo grupo) {

		try {
			PreparedStatement pst = super.conexion
					.prepareStatement("INSERT INTO grupo (nombre, email, telefono, integrantes, contrasena) values(?,?,?,?,?)");
			pst.setString(1, grupo.getNombre());
			pst.setString(2, grupo.getEmail());
			pst.setString(3, grupo.getTelefono());
			pst.setString(4, grupo.getIntegrantes());
			pst.setString(5, grupo.getContrasena());

			pst.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public Grupo selectEmailContrasena(String email, String contrasena) {

		Statement st;
		ResultSet rs;
		try {
			st = super.conexion.createStatement();
			rs = st.executeQuery(
					"SELECT * FROM grupo WHERE email='" + email + "'" + "AND contrasena='" + contrasena + "'");
			if (rs.next()) {
				Grupo grupo = new Grupo();
				grupo.setIdGrupo(rs.getInt("1"));
				grupo.setNombre(rs.getString("2"));
				grupo.setEmail(rs.getString("3"));
				grupo.setContrasena(rs.getString("4"));
				grupo.setIntegrantes(rs.getString("5"));
				grupo.setTelefono(rs.getString("6"));
				return grupo;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}

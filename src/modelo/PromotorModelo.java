package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class PromotorModelo extends Conector {

	public ArrayList<Promotor> selectAll() {
		ArrayList<Promotor> promotores = new ArrayList<Promotor>();

		try {
			Statement st = super.conexion.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM promotor");
			while (rs.next()) {
				Promotor promotor = new Promotor();
				promotor.setIdPromotor(rs.getInt("idPromotor"));
				promotor.setNombre(rs.getString("nombre"));
				promotor.setApellido(rs.getString("apellido"));
				promotor.setDni(rs.getString("dni"));
				promotor.setEmail(rs.getString("email"));
				promotor.setContrasena(rs.getString("contrasena"));
				promotor.setTelefono(rs.getString("telefono"));

				promotores.add(promotor);

			}
			return promotores;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return promotores;
	}

	public Promotor selectPorid(int idPromotor) {

		try {
			PreparedStatement pst = super.conexion.prepareStatement("SELECT * FROM promotor WHERE idPromotor=?");
			pst.setInt(1, idPromotor);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				Promotor promotor = new Promotor();
				promotor.setIdPromotor(rs.getInt("idPromotor"));
				promotor.setNombre(rs.getString("nombre"));
				promotor.setApellido(rs.getString("apellido"));
				promotor.setDni(rs.getString("dni"));
				promotor.setEmail(rs.getString("email"));
				promotor.setContrasena(rs.getString("contrasena"));
				promotor.setTelefono(rs.getString("telefono"));
				return promotor;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public Promotor selectEmailContrasena(String email, String contrasena) {

		Statement st;
		ResultSet rs;
		try {
			st = super.conexion.createStatement();
			rs = st.executeQuery(
					"SELECT * FROM promotor WHERE email='" + email + "'" + "AND contrasena='" + contrasena + "'");
			if (rs.next()) {
				Promotor promotor = new Promotor();
				promotor.setIdPromotor(rs.getInt("1"));
				promotor.setNombre(rs.getString("2"));
				promotor.setApellido(rs.getString("3"));
				promotor.setEmail(rs.getString("4"));
				promotor.setTelefono(rs.getString("5"));
				promotor.setContrasena(rs.getString("6"));
				promotor.setDni(rs.getString("7"));
				return promotor;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	public void insert(Promotor promotor) {

		try {
			PreparedStatement pst = super.conexion.prepareStatement("INSERT INTO promotor (nombre, apellido, email, telefono, dni, contrasena) values(?,?,?,?,?,?)");
			pst.setString(1, promotor.getNombre());
			pst.setString(2, promotor.getApellido());
			pst.setString(3, promotor.getEmail());
			pst.setString(4, promotor.getTelefono());
			pst.setString(5, promotor.getDni());
			pst.setString(6, promotor.getContrasena());

			pst.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}

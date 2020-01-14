package org.itstep.aluguel.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.itstep.aluguel.model.Carro;

//--------------------------------------------------------------------
public class Principal {

	public static void main(String[] args) throws SQLException {
		System.out.println("Mostrar todos os registros de carro");
		
		jdbcDAOFactory jdbc = new jdbcDAOFactory();
		List<Carro> carros = new ArrayList<Carro>();
		
		String sql = "SELECT ID,MODELO,FABRICANTE,ANO,RESPONSAVEL FROM T20WPS2G.CARRO";
		
		PreparedStatement ps = jdbc.getConexao().prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			Carro carro = new Carro();
			carro.setCodCarro(rs.getInt("ID"));
			carro.setModelo(rs.getString("MODELO"));
			carro.setMontadora(rs.getString("FABRICANTE"));
			carro.setResponsavel(rs.getString("RESPONSAVEL"));
			
			carros.add(carro);
		}
		
		for(Carro c : carros) {
			System.out.println(c.getCodCarro());
			System.out.println(c.getModelo());
			System.out.println(c.getMontadora());
			System.out.println(c.getResponsavel());
			
		}
		
	}

}

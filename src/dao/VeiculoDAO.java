package dao;

import controller.GerenciadorConexao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.Veiculo;

public class VeiculoDAO {

    public boolean inserir(Veiculo veiculo) {
        String sql = "INSERT INTO veiculo (modelo, marca, placa, ano, disponivel) VALUES (?, ?, ?, ?, ?)";
        GerenciadorConexao gc = new GerenciadorConexao();
        PreparedStatement stmt = gc.prepararComando(sql);

        try {
            stmt.setString(1, veiculo.getModelo());
            stmt.setString(2, veiculo.getMarca());
            stmt.setString(3, veiculo.getPlaca());
            stmt.setString(4, veiculo.getAno());
            stmt.setBoolean(5, veiculo.isDisponivel());

            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Erro ao inserir veículo: " + e.getMessage());
            return false;
        } finally {
            gc.fecharConexao(stmt);
        }
    }

    public boolean alterar(Veiculo veiculo) {
        String sql = "UPDATE veiculo SET modelo = ?, marca = ?, placa = ?, ano = ?, disponivel = ? WHERE id = ?";
        GerenciadorConexao gc = new GerenciadorConexao();
        PreparedStatement stmt = gc.prepararComando(sql);

        try {
            stmt.setString(1, veiculo.getModelo());
            stmt.setString(2, veiculo.getMarca());
            stmt.setString(3, veiculo.getPlaca());
            stmt.setString(4, veiculo.getAno());
            stmt.setBoolean(5, veiculo.isDisponivel());
            stmt.setInt(6, veiculo.getid());

            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Erro ao alterar veículo: " + e.getMessage());
            return false;
        } finally {
            gc.fecharConexao(stmt);
        }
    }

    public boolean deletar(int id) {
        String sql = "DELETE FROM veiculo WHERE id = ?";
        GerenciadorConexao gc = new GerenciadorConexao();
        PreparedStatement stmt = gc.prepararComando(sql);

        try {
            stmt.setInt(1, id);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Erro ao deletar veículo: " + e.getMessage());
            return false;
        } finally {
            gc.fecharConexao(stmt);
        }
    }

    public List<Veiculo> consultar() {
        List<Veiculo> lista = new ArrayList<>();
        String sql = "SELECT * FROM tbveiculo";
        GerenciadorConexao gc = new GerenciadorConexao();
        PreparedStatement stmt = gc.prepararComando(sql);
        ResultSet rs = null;

        try {
            rs = stmt.executeQuery();
            while (rs.next()) {
                Veiculo v = new Veiculo();
                v.setid(rs.getInt("pk_veiculo"));
                v.setModelo(rs.getString("modelo"));
                v.setMarca(rs.getString("marca"));
                v.setPlaca(rs.getString("placa"));
                v.setAno(rs.getString("ano"));
                v.setDisponivel(rs.getBoolean("disponivel"));
                lista.add(v);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao consultar veículos: " + e.getMessage());
        } finally {
            gc.fecharConexao(stmt, rs);
        }

        return lista;
    }

    public Veiculo consultarPorId(int id) {
        String sql = "SELECT * FROM veiculo WHERE pk_veiculo = ?";
        GerenciadorConexao gc = new GerenciadorConexao();
        PreparedStatement stmt = gc.prepararComando(sql);
        ResultSet rs = null;

        try {
            stmt.setInt(1, id);
            rs = stmt.executeQuery();

            if (rs.next()) {
                Veiculo v = new Veiculo();
                v.setid(rs.getInt("id"));
                v.setModelo(rs.getString("modelo"));
                v.setMarca(rs.getString("marca"));
                v.setPlaca(rs.getString("placa"));
                v.setAno(rs.getString("ano"));
                v.setDisponivel(rs.getBoolean("disponivel"));
                return v;
            }

        } catch (SQLException e) {
            System.out.println("Erro ao consultar veículo por ID: " + e.getMessage());
        } finally {
            gc.fecharConexao(stmt, rs);
        }

        return null;
    }
}

package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Veiculo;

public class VeiculoController {

    public boolean inserir(Veiculo v) {
        String sql = "INSERT INTO veiculo (modelo, marca, placa, ano, disponivel) VALUES (?, ?, ?, ?, ?)";

        GerenciadorConexao gerenciador = new GerenciadorConexao();
        PreparedStatement comando = null;

        try {
            comando = gerenciador.prepararComando(sql);
            comando.setString(1, v.getModelo());
            comando.setString(2, v.getMarca());
            comando.setString(3, v.getPlaca());
            comando.setString(4, v.getAno());
            comando.setBoolean(5, v.isDisponivel());

            comando.executeUpdate();
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir veículo: " + e.getMessage());
        } finally {
            gerenciador.fecharConexao(comando);
        }

        return false;
    }

    public boolean atualizar(Veiculo v) {
        String sql = "UPDATE veiculo SET modelo = ?, marca = ?, placa = ?, ano = ?, disponivel = ? WHERE Id = ?";

        GerenciadorConexao gerenciador = new GerenciadorConexao();
        PreparedStatement comando = null;

        try {
            comando = gerenciador.prepararComando(sql);
            comando.setString(1, v.getModelo());
            comando.setString(2, v.getMarca());
            comando.setString(3, v.getPlaca());
            comando.setString(4, v.getAno());
            comando.setBoolean(5, v.isDisponivel());
            comando.setInt(6, v.getid());

            comando.executeUpdate();
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar veículo: " + e.getMessage());
        } finally {
            gerenciador.fecharConexao(comando);
        }

        return false;
    }

    public boolean excluir(int id) {
        String sql = "DELETE FROM veiculo WHERE id = ?";

        GerenciadorConexao gerenciador = new GerenciadorConexao();
        PreparedStatement comando = null;

        try {
            comando = gerenciador.prepararComando(sql);
            comando.setInt(1, id);

            comando.executeUpdate();
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir veículo: " + e.getMessage());
        } finally {
            gerenciador.fecharConexao(comando);
        }

        return false;
    }

    public List<Veiculo> listar() {
        String sql = "SELECT * FROM veiculo";

        GerenciadorConexao gerenciador = new GerenciadorConexao();
        PreparedStatement comando = null;
        ResultSet resultado = null;

        List<Veiculo> lista = new ArrayList<>();

        try {
            comando = gerenciador.prepararComando(sql);
            resultado = comando.executeQuery();

            while (resultado.next()) {
                Veiculo v = new Veiculo();
                v.setid(resultado.getInt("id"));
                v.setModelo(resultado.getString("modelo"));
                v.setMarca(resultado.getString("marca"));
                v.setPlaca(resultado.getString("placa"));
                v.setAno(resultado.getString("ano"));
                v.setDisponivel(resultado.getBoolean("disponivel"));

                lista.add(v);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar veículos: " + e.getMessage());
        } finally {
            gerenciador.fecharConexao(comando, resultado);
        }

        return lista;
    }

    public Veiculo buscarPorId(int id) {
        String sql = "SELECT * FROM veiculo WHERE id = ?";

        GerenciadorConexao gerenciador = new GerenciadorConexao();
        PreparedStatement comando = null;
        ResultSet resultado = null;

        Veiculo v = new Veiculo();

        try {
            comando = gerenciador.prepararComando(sql);
            comando.setInt(1, id);
            resultado = comando.executeQuery();

            if (resultado.next()) {
                v.setid(resultado.getInt("id"));
                v.setModelo(resultado.getString("modelo"));
                v.setMarca(resultado.getString("marca"));
                v.setPlaca(resultado.getString("placa"));
                v.setAno(resultado.getString("ano"));
                v.setDisponivel(resultado.getBoolean("disponivel"));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar veículo: " + e.getMessage());
        } finally {
            gerenciador.fecharConexao(comando, resultado);
        }

        return v;
    }
}
        
   


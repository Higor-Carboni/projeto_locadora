/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Seguro;
import model.Veiculo;

/**
 *
 * @author arthu
 */
public class SeguroController {
    public boolean inserir(Seguro s) {
        String sql = "INSERT INTO Seguro (Tipo_seguro, Valor, Valor_CObertura) VALUES (?, ?, ?)";

        GerenciadorConexao gerenciador = new GerenciadorConexao();
        PreparedStatement comando = null;

        try {
            comando = gerenciador.prepararComando(sql);
            comando.setString(1,s.getTipo_seguro());
            comando.setDouble(2, s.getValor());
            comando.setInt(3, s.getValor_Cobertura());
            

            comando.executeUpdate();
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir Seguro: " + e.getMessage());
        } finally {
            gerenciador.fecharConexao(comando);
        }

        return false;
    }
    
    
     public boolean excluir(int id) {
        String sql = "DELETE FROM Seguro WHERE PkSeguro = ?";

        GerenciadorConexao gerenciador = new GerenciadorConexao();
        PreparedStatement comando = null;

        try {
            comando = gerenciador.prepararComando(sql);
            comando.setInt(1, id);

            comando.executeUpdate();
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir Seguro: " + e.getMessage());
        } finally {
            gerenciador.fecharConexao(comando);
        }

        return false;
    }
     
      public Seguro Pesquisar(int id) {
        String sql = "SELECT * FROM Seguro WHERE PkSeguro = ?";

        GerenciadorConexao gerenciador = new GerenciadorConexao();
        PreparedStatement comando = null;
        ResultSet resultado = null;

        Seguro s = new Seguro();

        try {
            comando = gerenciador.prepararComando(sql);
            comando.setInt(1, id);
            resultado = comando.executeQuery();

            if (resultado.next()) {
                s.setPkSeguro(resultado.getInt("Pkseguro"));
                s.setTipo_seguro(resultado.getString("Tipo_seguro"));
                s.setValor(resultado.getDouble("Valor"));
                s.setValor_Cobertura(resultado.getInt("Valor_Cobertura"));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar Seguro: " + e.getMessage());
        } finally {
            gerenciador.fecharConexao(comando, resultado);
        }

        return s;
    }
     
    public List<Seguro> listar() {
        String sql = "SELECT * FROM Seguro";

        GerenciadorConexao gerenciador = new GerenciadorConexao();
        PreparedStatement comando = null;
        ResultSet resultado = null;

        List<Seguro> lista = new ArrayList<>();

        try {
            comando = gerenciador.prepararComando(sql);
            resultado = comando.executeQuery();

            while (resultado.next()) {
                Seguro s = new Seguro();
                s.setPkSeguro(resultado.getInt("PkSeguro"));
                s.setTipo_seguro(resultado.getString("Tipo_seguro"));
                s.setValor(resultado.getDouble("Valor"));
                s.setValor_Cobertura(resultado.getInt("Valor_Cobertura"));
                lista.add(s);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar Seguro: " + e.getMessage());
        } finally {
            gerenciador.fecharConexao(comando, resultado);
        }

        return lista;
    }
    public boolean atualizar(Seguro s) {
        String sql = "UPDATE Seguro SET Tipo_seguro = ?, Valor = ?, Valor_Cobertura = ?, PkSeguro = ?";

        GerenciadorConexao gerenciador = new GerenciadorConexao();
        PreparedStatement comando = null;

        try {
            comando = gerenciador.prepararComando(sql);
            comando.setString(1, s.getTipo_seguro());
            comando.setDouble(2, s.getValor());
            comando.setInt(3, s.getValor_Cobertura());
            comando.setInt(4, s.getPkSeguro());

            comando.executeUpdate();
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar Seguro: " + e.getMessage());
        } finally {
            gerenciador.fecharConexao(comando);
        }

        return false;
    }
}

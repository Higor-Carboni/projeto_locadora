/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.SQLException;

/**
 *
 * @author higor
 */
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Locacao;

public class LocacaoController {
 
    


    public boolean inserir(Locacao l) {
        String sql = "INSERT INTO locacao (cliente_id, veiculo_id, data_inicio, data_fim, valor, status) VALUES (?, ?, ?, ?, ?, ?)";

        GerenciadorConexao gerenciador = new GerenciadorConexao();
        PreparedStatement comando = null;

        try {
            comando = gerenciador.prepararComando(sql);
            comando.setInt(1, l.getClienteId());
            comando.setInt(2, l.getVeiculoId());
            comando.setDate(3, new java.sql.Date(l.getDataInicio().getTime()));
            comando.setDate(4, new java.sql.Date(l.getDataFim().getTime()));
            comando.setDouble(5, l.getValor());
            comando.setString(6, l.getStatus());

            comando.executeUpdate();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir locação: " + e.getMessage());
        } finally {
            gerenciador.fecharConexao(comando);
        }

        return false;
    }

    public boolean atualizar(Locacao l) {
        String sql = "UPDATE locacao SET cliente_id = ?, veiculo_id = ?, data_inicio = ?, data_fim = ?, valor = ?, status = ? WHERE pkLocacao = ?";

        GerenciadorConexao gerenciador = new GerenciadorConexao();
        PreparedStatement comando = null;

        try {
            comando = gerenciador.prepararComando(sql);
            comando.setInt(1, l.getClienteId());
            comando.setInt(2, l.getVeiculoId());
            comando.setDate(3, new java.sql.Date(l.getDataInicio().getTime()));
            comando.setDate(4, new java.sql.Date(l.getDataFim().getTime()));
            comando.setDouble(5, l.getValor());
            comando.setString(6, l.getStatus());
            comando.setInt(7, l.getPkLocacao());

            comando.executeUpdate();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar locação: " + e.getMessage());
        } finally {
            gerenciador.fecharConexao(comando);
        }

        return false;
    }

    public boolean excluir(int id) {
        String sql = "DELETE FROM locacao WHERE pkLocacao = ?";

        GerenciadorConexao gerenciador = new GerenciadorConexao();
        PreparedStatement comando = null;

        try {
            comando = gerenciador.prepararComando(sql);
            comando.setInt(1, id);

            comando.executeUpdate();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir locação: " + e.getMessage());
        } finally {
            gerenciador.fecharConexao(comando);
        }

        return false;
    }

    public List<Locacao> listar() {
        String sql = "SELECT * FROM locacao";

        GerenciadorConexao gerenciador = new GerenciadorConexao();
        PreparedStatement comando = null;
        ResultSet resultado = null;

        List<Locacao> lista = new ArrayList<>();

        try {
            comando = gerenciador.prepararComando(sql);
            resultado = comando.executeQuery();

            while (resultado.next()) {
                Locacao l = new Locacao();
                l.setPkLocacao(resultado.getInt("pkLocacao"));
                l.setClienteId(resultado.getInt("cliente_id"));
                l.setVeiculoId(resultado.getInt("veiculo_id"));
                l.setDataInicio(resultado.getDate("data_inicio"));
                l.setDataFim(resultado.getDate("data_fim"));
                l.setValor(resultado.getDouble("valor"));
                l.setStatus(resultado.getString("status"));

                lista.add(l);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar locações: " + e.getMessage());
        } finally {
            gerenciador.fecharConexao(comando, resultado);
        }

        return lista;
    }

    public Locacao buscarPorId(int id) {
        String sql = "SELECT * FROM locacao WHERE pkLocacao = ?";

        GerenciadorConexao gerenciador = new GerenciadorConexao();
        PreparedStatement comando = null;
        ResultSet resultado = null;

        Locacao l = new Locacao();

        try {
            comando = gerenciador.prepararComando(sql);
            comando.setInt(1, id);
            resultado = comando.executeQuery();

            if (resultado.next()) {
                l.setPkLocacao(resultado.getInt("pkLocacao"));
                l.setClienteId(resultado.getInt("cliente_id"));
                l.setVeiculoId(resultado.getInt("veiculo_id"));
                l.setDataInicio(resultado.getDate("data_inicio"));
                l.setDataFim(resultado.getDate("data_fim"));
                l.setValor(resultado.getDouble("valor"));
                l.setStatus(resultado.getString("status"));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar locação: " + e.getMessage());
        } finally {
            gerenciador.fecharConexao(comando, resultado);
        }

        return l;
    }
}


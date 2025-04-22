package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Cliente;

public class ClienteController {

    public boolean inserir(Cliente c) {
        String sql = "INSERT INTO cliente (nome, emailCli, CPF) VALUES (?, ?, ?)";

        GerenciadorConexao gerenciador = new GerenciadorConexao();
        PreparedStatement comando = null;

        try {
            comando = gerenciador.prepararComando(sql);
            comando.setString(1, c.getNome());
            comando.setString(2, c.getEmailCli());
            comando.setString(3, c.getCpf());

            comando.executeUpdate();
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir cliente: " + e.getMessage());
        } finally {
            gerenciador.fecharConexao(comando);
        }

        return false;
    }

    public boolean atualizar(Cliente c) {
        String sql = "UPDATE cliente SET nome = ?, emailCli = ?, CPF = ? WHERE pkCliente = ?";

        GerenciadorConexao gerenciador = new GerenciadorConexao();
        PreparedStatement comando = null;

        try {
            comando = gerenciador.prepararComando(sql);
            comando.setString(1, c.getNome());
            comando.setString(2, c.getEmailCli());
            comando.setString(3, c.getCpf());
            comando.setInt(4, c.getId());

            comando.executeUpdate();
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar cliente: " + e.getMessage());
        } finally {
            gerenciador.fecharConexao(comando);
        }

        return false;
    }

    public boolean excluir(int id) {
        String sql = "DELETE FROM cliente WHERE pkCliente = ?";

        GerenciadorConexao gerenciador = new GerenciadorConexao();
        PreparedStatement comando = null;

        try {
            comando = gerenciador.prepararComando(sql);
            comando.setInt(1, id);

            comando.executeUpdate();
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir cliente: " + e.getMessage());
        } finally {
            gerenciador.fecharConexao(comando);
        }

        return false;
    }

    public List<Cliente> listar() {
        String sql = "SELECT * FROM cliente";

        GerenciadorConexao gerenciador = new GerenciadorConexao();
        PreparedStatement comando = null;
        ResultSet resultado = null;

        List<Cliente> lista = new ArrayList<>();

        try {
            comando = gerenciador.prepararComando(sql);
            resultado = comando.executeQuery();

            while (resultado.next()) {
                Cliente c = new Cliente();
                c.setId(resultado.getInt("pkCliente"));
                c.setNome(resultado.getString("nome"));
                c.setEmailCli(resultado.getString("emailCli"));
                c.setCpf(resultado.getString("CPF"));

                lista.add(c);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar clientes: " + e.getMessage());
        } finally {
            gerenciador.fecharConexao(comando, resultado);
        }

        return lista;
    }

    public Cliente buscarPorId(int id) {
        String sql = "SELECT * FROM cliente WHERE pkCliente = ?";

        GerenciadorConexao gerenciador = new GerenciadorConexao();
        PreparedStatement comando = null;
        ResultSet resultado = null;

        Cliente c = new Cliente();

        try {
            comando = gerenciador.prepararComando(sql);
            comando.setInt(1, id);
            resultado = comando.executeQuery();

            if (resultado.next()) {
                c.setId(resultado.getInt("pkCliente"));
                c.setNome(resultado.getString("nome"));
                c.setEmailCli(resultado.getString("emailCli"));
                c.setCpf(resultado.getString("CPF"));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar cliente: " + e.getMessage());
        } finally {
            gerenciador.fecharConexao(comando, resultado);
        }

        return c;
    }
}

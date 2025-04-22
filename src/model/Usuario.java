package model;

import java.util.Date;

/**
 * @author iband
 */
public class Usuario {
  private int pkUsuario;
  private String nome;
  private String email;
  private String senha;
  private Date dataNascUsu;
  private boolean ativo;

  public Usuario(){};
  
  public Usuario(int pkUsuario, String nome, String email, String senha, Date dataNascUsu, boolean ativo) {
    this.pkUsuario = pkUsuario;
    this.nome = nome;
    this.email = email;
    this.senha = senha;
    this.dataNascUsu = dataNascUsu;
    this.ativo = ativo;
  }

  public int getPkUsuario() {
    return pkUsuario;
  }

  public void setPkUsuario(int pkUsuario) {
    this.pkUsuario = pkUsuario;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getSenha() {
    return senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }

  public Date getDataNascUsu() {
    return dataNascUsu;
  }

  public void setDataNascUsu(Date dataNascUsu) {
    this.dataNascUsu = dataNascUsu;
  }

  public boolean isAtivo() {
    return ativo;
  }

  public void setAtivo(boolean ativo) {
    this.ativo = ativo;
  }

  public String ativoToString() {
    if(ativo){
      return "Ativo";
    } else {
      return "Inativo";
    }
  }
  
  
}

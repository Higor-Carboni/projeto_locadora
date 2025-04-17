/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

public class Cliente {
    private int id;
    private String nome;
    private String emailCli;
    private String cpf;

    public Cliente() {}

    public Cliente(int id, String nome, String emailCli, String cpf) {
        this.id = id;
        this.nome = nome;
        this.emailCli = emailCli;
        this.cpf = cpf;
    }

    // Getters e Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEmailCli() { return emailCli; }
    public void setEmailCli(String emailCli) { this.emailCli = emailCli; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }
}

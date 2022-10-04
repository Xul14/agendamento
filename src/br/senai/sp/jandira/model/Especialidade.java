package br.senai.sp.jandira.model;

import javax.swing.JOptionPane;

public class Especialidade {

    private Integer codigo;
    private static int contador;
    private String nome;
    private String descricao;

    //construtor
    public Especialidade(String nome) {
        this.nome = nome;
        this.contador++;
        this.codigo = contador;
    }

    public Especialidade(String nome, String descricao) {
        this.contador++;
        this.codigo = contador;
    }

    public Especialidade() { //Contrutor default.
        this.contador++;
        this.codigo = contador;
    }

    //Métodos de acessos aos atributos

    public static int getContador() {
        return contador;
    }

    public Integer getCodigo() {
        return codigo;
    }
    
    
    
    
    public void setNome(String nome) {
        if (nome.length() >= 3) {
            this.nome = nome;
        } else {
            JOptionPane.showMessageDialog(null, nome + " não é um nome válido.\nDeve conter pelo menos 3 letras!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setDescricao(String descricao) {
        if (descricao.length() >= 10) {
            this.descricao = descricao;
        } else {
            JOptionPane.showMessageDialog(null, "A descrição deve conter pelo menos 10 caracteres!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public String getDescricao() {
        return descricao;
    }

}

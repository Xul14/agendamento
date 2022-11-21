package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class Medico {

    private String nome;
    private Especialidade[] especialidade;
    private String email;
    private String crm;
    private String telefone;
    private LocalDate dataNascimento;
    private static int contador = 99;
    private Integer codigo;

    //Construtor
    public Medico(String nome) {
        this.nome = nome;
        gerarCodigo();
    }

    public Medico(
            Integer codigo,
            String nome,
            String email,
            String crm,
            String telefone,
            LocalDate dataNascimento
//            Especialidade especialidade
            ) {
        this.codigo = codigo;
        this.nome = nome;
        this.email = email;
        this.crm = crm;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
//        this.especialidade = this.especialidade;
    }

    public Medico() {
        gerarCodigo();
    }

    private void gerarCodigo() {
        this.contador++;
        this.codigo = contador;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Especialidade[] getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade[] especialidade) {
        this.especialidade = especialidade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
  
    public String getMedicoSeparadoPorPontoEVirgula(){
        return this.codigo + ";" +
               this.nome + ";" +
               this.email + ";" + 
               this.crm + ";" + 
               this.especialidade + ";" + 
               this.dataNascimento + ";" + 
               this.telefone;
    }
}

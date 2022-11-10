package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class Paciente {

    private String nome;
    private LocalDate dataNascimento;
    private String telefone;
    private String rg;
    private String cpf;
    private String genero;
    private PlanoDeSaude planoDeSaude;
    private Endereco endereco;
    private Integer codigo;
    private static int contador = 99;

    //construtores
    public Paciente() {
        gerarCodigo();
    }

    public Paciente(String nome,
            LocalDate dataNascimento,
            String telefone,
            String rg,
            String cpf
    //            PlanoDeSaude planoDeSaude,Endereco endereco
        ) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.rg = rg;
        this.cpf = cpf;
        this.planoDeSaude = planoDeSaude;
    }

    private void gerarCodigo() {
        this.contador++;
        this.codigo = contador;
    }

    //Métodos de acessos
    public static int getContador() {
        return contador;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public PlanoDeSaude getPlanoDeSaude() {
        return planoDeSaude;
    }

    public void setPlanoDeSaude(PlanoDeSaude planoDeSaude) {
        this.planoDeSaude = planoDeSaude;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
//     public String getPacienteSeparadaPorPontoEVirgula(){
////        return this.codigo + ";" + this.nome + ";" + this.descricao;
//    }

}

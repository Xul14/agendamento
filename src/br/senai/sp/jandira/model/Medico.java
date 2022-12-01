package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Medico {

    private String nome;
    private ArrayList<Especialidade> especialidade;
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
            String crm,
            String nome,
            String telefone,
            String email,
            LocalDate dataNascimento,
            ArrayList<Especialidade> especialidade
            ) {
        this.codigo = codigo;
        this.nome = nome;
        this.email = email;
        this.crm = crm;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.especialidade = especialidade;
        gerarCodigo();
    
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

    public ArrayList<Especialidade> getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(ArrayList<Especialidade> especialidade) {
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
               this.crm + ";" + 
               this.nome + ";" +
               this.telefone + ";" +
               this.email + ";" + 
               this.dataNascimento  + ";" + 
               listToString(this.especialidade);
    
    }
    
    public String listToString(ArrayList<Especialidade> lista){
        ArrayList<String> codigoEspecialidade = new ArrayList<>();
        for(Especialidade e : lista){
            codigoEspecialidade.add(e.getCodigo().toString());
        }
        return String.join(";", codigoEspecialidade);
    }
    
}

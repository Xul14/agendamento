package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Paciente;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class PacienteDAO {
    
    private static ArrayList<Paciente> pacientes =  new ArrayList<>();
    
    public static ArrayList<Paciente> getEspecialidades(){
        return pacientes;
    }
    
    public static Paciente getPaciente(Integer codigo){
        for(Paciente p : pacientes){
            if(codigo == p.getCodigo()){
                return p;
            }
        }
        
        return null;
    }
    
    public static void gravar(Paciente p){
        pacientes.add(p);
    }
    
    public static void excluir(Integer codigo){
        for(Paciente p : pacientes){
            if(codigo == p.getCodigo()){
                pacientes.remove(p);
                break;
            }
        }
    }
    
    public static void atualizar(Paciente correto){
       for(Paciente p : pacientes){
           if(correto.getCodigo() == p.getCodigo()){
               int posicao = pacientes.indexOf(p);
              pacientes.set(posicao, correto);
              break;
           }
       } 
           
    }
    
    //riar lista de Pacientes
    public static void criarListaDePacientes(){
        Paciente p1 = new Paciente("Julia", LocalDate.of(2022, 10, 27), "(11) 97586-2806", "45.6346.4691-0", "308.464.051-01");
        Paciente p2 = new Paciente("Julia", LocalDate.of(2022, 10, 27), "(11) 97586-2806", "45.6346.4691-0", "308.464.051-01");
        Paciente p3 = new Paciente("Julia", LocalDate.of(2022, 10, 27), "(11) 97586-2806", "45.6346.4691-0", "308.464.051-01");
        Paciente p4 = new Paciente("Julia", LocalDate.of(2022, 10, 27), "(11) 97586-2806", "45.6346.4691-0", "308.464.051-01");
        Paciente p5 = new Paciente("Julia", LocalDate.of(2022, 10, 27), "(11) 97586-2806", "45.6346.4691-0", "308.464.051-01");
        
        pacientes.add(p1);
        pacientes.add(p2);
        pacientes.add(p3);
        pacientes.add(p4);
        pacientes.add(p5);
        
    }
    
    public static DefaultTableModel getPacienteModel(){
        String[] titulos = {"CÓDIGO","NOME", "CPF", "DATA DE NASCIMENTO", "TELEFONE"};
        String[][] dados = new String[pacientes.size()][4];
        
        int i = 0;
        for (Paciente p : pacientes){
            dados[i][0] = p.getCodigo().toString();
            dados[i][1] = p.getNome();
            dados[i][2] = p.getCpf();
            DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            dados[i][3] = p.getDataNascimento().format(formatDate);
            dados[i][4] = p.getTelefone();
            i++;
        }
        
        DefaultTableModel model = new DefaultTableModel(dados, titulos);
        return model;
    }
    

    
}

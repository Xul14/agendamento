package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.PlanoDeSaude;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class PlanoDeSaudeDAO {
    
    private static ArrayList<PlanoDeSaude> planoDeSaude = new ArrayList<>();
    
    public static ArrayList<PlanoDeSaude> getPlanosDeSaude(){
        return planoDeSaude;
    }
    
    public static PlanoDeSaude getPlanoDeSaude(Integer codigo){
        for(PlanoDeSaude p : planoDeSaude){
            if(codigo == p.getCodigo()){
                return p;
            }
        }
        
        return null;
    }
    
    public static void gravar(PlanoDeSaude p){
        planoDeSaude.add(p);
    }
    
    public static void excluir(Integer codigo){
        for(PlanoDeSaude p : planoDeSaude){
            if(codigo == p.getCodigo()){
                planoDeSaude.remove(p);
                break;
            }
        }
    }
    
    public static void atualizar(PlanoDeSaude atualizado){
        for(PlanoDeSaude p : planoDeSaude){
            if(atualizado.getCodigo() == p.getCodigo()){
                int posicao = planoDeSaude.indexOf(p);
                planoDeSaude.set(posicao, atualizado);
                break;
            }
        }
    }
    
    //Planos de saúde
    
    public static void criarPlanosDeSaude(){
        
        PlanoDeSaude p1 = new PlanoDeSaude("Porto Seguro", "Basic", "6451-01", LocalDate.of(2022, 10, 22));
        PlanoDeSaude p2 = new PlanoDeSaude("Unimed", "Basic", "7563-89",LocalDate.of(2022, 10, 22) );
        PlanoDeSaude p3 = new PlanoDeSaude("Notredame", "Classic", "8946-16", LocalDate.of(2022, 10, 22));
        PlanoDeSaude p4 = new PlanoDeSaude("Bradesco", "Gold", "4697-12", LocalDate.of(2022, 10, 22));
        PlanoDeSaude p5 = new PlanoDeSaude("Cedime", "Basic", "3164-78", LocalDate.of(2022, 10, 22));
        PlanoDeSaude p6 = new PlanoDeSaude("Unimed", "Premium", "5094-67", LocalDate.of(2022, 10, 22));
        PlanoDeSaude p7 = new PlanoDeSaude("Amil", "Basic", "2106-64", LocalDate.of(2022, 10, 22));
        
        planoDeSaude.add(p1);
        planoDeSaude.add(p2);
        planoDeSaude.add(p3);
        planoDeSaude.add(p4);
        planoDeSaude.add(p5);
        planoDeSaude.add(p6);
        planoDeSaude.add(p7);
        
    }
    
    public static DefaultTableModel getPlanoDeSaudeModel(){
        
        String[] titulos = {"CÓDIGO","OPERADORA", "CATEGORIA", "NÚMERO", "VALIDADE"};
        String[][] planos = new String[planoDeSaude.size()][5];
        
        
        int i = 0;
        for(PlanoDeSaude p : planoDeSaude){
            
            planos[i][0] = p.getCodigo().toString();
            planos[i][1] = p.getOperadora();
            planos[i][2] = p.getCategoria();
            planos[i][3] = p.getNumero();
            DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            planos[i][4] = p.getValidade().format(formatDate);
            i++;
        }
        
        DefaultTableModel model = new DefaultTableModel(planos, titulos);
        return model;
        
    }
    
 
   
    
    
    
    
    
    
    
    
    
}

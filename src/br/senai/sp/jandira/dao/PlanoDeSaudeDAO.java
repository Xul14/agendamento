package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.PlanoDeSaude;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class PlanoDeSaudeDAO {
    
    private final static String URL = "C:\\Users\\22282188\\Java-Arquivos\\PlanoDeSaude.txt";
    private final static Path PATH = Paths.get(URL);
    
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
        
        try {
            BufferedWriter escritor = Files.newBufferedWriter(
                    PATH, 
                    StandardOpenOption.APPEND, 
                    StandardOpenOption.WRITE);
            escritor.write(p.getPlanoDeSaudeSeparadoPorPontoEVirgula());
            escritor.newLine();
            escritor.close();
        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro!");
        }
        
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
        
         try {
             BufferedReader leitor = Files.newBufferedReader(PATH);
            
            String linha = leitor.readLine();
            
            while(linha != null){
            //Transformar os dados da linha em uma especialidade
            String[] vetor = linha.split(";");
            PlanoDeSaude p = new PlanoDeSaude( vetor[1], vetor[2], vetor[3], LocalDate.parse(vetor[4]), Integer.valueOf(vetor[0]));
            
            
            //Guardar a especialidade na lista
            planoDeSaude.add(p);
            
            //Ler a proxima linha
            linha = leitor.readLine();
            
            }
            
            
            leitor.close();
            
        } catch (IOException erro) {
           JOptionPane.showMessageDialog(null, "Ocorreu um erro ao ler o arquivo!");
        }
        
        
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

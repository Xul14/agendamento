package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Medico;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MedicoDAO {
    
    
    //Criar constantes
    private final static String URL = "C:\\Users\\22282188\\Java-Arquivos\\Medico.txt";
    private final static String URL_TEMP = "C:\\Users\\22282188\\Java-Arquivos\\Medico-temp.txt";
    private final static Path PATH = Paths.get(URL);
    private final static Path PATH_TEMP = Paths.get(URL_TEMP);

    private static ArrayList<Medico> medicos = new ArrayList<>();

    public static ArrayList<Medico> getMedico() {
        return medicos;
    }

    public static Medico getMeidco(Integer codigo) {
        for (Medico m : medicos) {
            if (codigo == m.getCodigo()) {
                return m;
            }
        }

        return null;
    }
    
    public static void gravar(Medico m) {
        medicos.add(m);

        //*** GRAVAR EM ARQUIVO ***
        try {
            BufferedWriter escritor = Files.newBufferedWriter(
                    PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            escritor.write(m.getMedicoSeparadoPorPontoEVirgula());
            escritor.newLine();
            escritor.close();
        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro!");
        }

    }
    
    public static void excluir(Integer codigo) {

        for (Medico m : medicos) {
            if (m.getCodigo().equals(codigo)) {
                medicos.remove(m);
                break;
            }
        }
        
        atualizarArquivo();

    }

    private static void atualizarArquivo() {

        //PASSO 1 - Criar uma representação dos arquivos que serão manipulados
        File arquivoAtual = new File(URL);
        File arquivoTemp = new File(URL_TEMP);

        try {

            arquivoTemp.createNewFile();

            BufferedWriter bwTemp = Files.newBufferedWriter(
                    PATH_TEMP,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            for(Medico m : medicos){
                bwTemp.write(m.getMedicoSeparadoPorPontoEVirgula());
                bwTemp.newLine();
            }
            
            bwTemp.close();
            
            //Excluir arquivo atual
            arquivoAtual.delete();
            
            //Renomear o arquivo temporário
            arquivoTemp.renameTo(arquivoAtual);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public static void atualizar(Medico correta) {
        for (Medico m : medicos) {
            if (m.getCodigo().equals(correta.getCodigo())) {
                int posicao = medicos.indexOf(m);
                medicos.set(posicao, correta);
                break;
            }
        }
        
        atualizarArquivo();

    }
    
     public static void criarListaDeMedicos() {

        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);

            String linha = leitor.readLine();

            while (linha != null) {
                
                String[] vetor = linha.split(";");
                Medico m = new Medico(Integer.valueOf(vetor[0]), vetor[1], vetor[2], vetor[3], vetor[4],LocalDate.parse(vetor[5]));


                medicos.add(m);

                //Ler a proxima linha
                linha = leitor.readLine();

            }

            leitor.close();

        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao ler o arquivo!");
        }

    }

    public static DefaultTableModel getMedicosModel() {
        String[] titulos = {"CÓDIGO", "CRM", "NOME DO MÉDICO", "TELEFONE"};
        String[][] dados = new String[medicos.size()][4];

        int i = 0;
        for (Medico m : medicos) {
            dados[i][0] = m.getCodigo().toString();
            dados[i][1] = m.getCrm();
            dados[i][2] = m.getNome();
            dados[i][3] = m.getTelefone();
            i++;
        }

        DefaultTableModel model = new DefaultTableModel(dados, titulos);
        return model;
    }
    
    
    
    
    
    
}

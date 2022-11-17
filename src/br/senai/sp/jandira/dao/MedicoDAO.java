package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Medico;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MedicoDAO {
    
    
    //Criar constantes
    private final static String URL = "C:\\Users\\22282188\\Java-Arquivos\\Medico.txt";
    private final static String URL_TEMP = "C:\\Users\\22282188\\Java-Arquivos\\Medico-temp.txt";
    private final static Path PATH = Paths.get(URL);
    private final static Path PATH_TEMP = Paths.get(URL_TEMP);

    private static ArrayList<Medico> especialidades = new ArrayList<>();

    public static ArrayList<Medico> getEspecialidades() {
        return especialidades;
    }

    public static Medico getEspecialidade(Integer codigo) {
        for (Medico m : especialidades) {
            if (codigo == m.getCodigo()) {
                return m;
            }
        }

        return null;
    }
    
    public static void gravar(Medico m) {
        especialidades.add(m);

        //*** GRAVAR EM ARQUIVO ***
        try {
            BufferedWriter escritor = Files.newBufferedWriter(
                    PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
//            escritor.write(m.getMedicoSeparadoPorPontoEVirgula());
            escritor.newLine();
            escritor.close();
        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro!");
        }

    }
    
    public static void excluir(Integer codigo) {

        for (Medico m : especialidades) {
            if (m.getCodigo().equals(codigo)) {
                especialidades.remove(m);
                break;
            }
        }
        
//        atualizarArquivo();

    }

//    private static void atualizarArquivo() {
//
//        //PASSO 1 - Criar uma representação dos arquivos que serão manipulados
//        File arquivoAtual = new File(URL);
//        File arquivoTemp = new File(URL_TEMP);
//
//        try {
//
//            //Criar o arquivo temporário
//            arquivoTemp.createNewFile();
//
//            //Abrir o arqivo temporário para escrita
//            BufferedWriter bwTemp = Files.newBufferedWriter(
//                    PATH_TEMP,
//                    StandardOpenOption.APPEND,
//                    StandardOpenOption.WRITE);
//
//            //Iterar na lista para adicionar aa especialidades no arquivo temporário
//            //exceto o registro qque não queremos mais
//            for(Especialidade e : especialidades){
//                bwTemp.write(e.getEspecialidadeSeparadaPorPontoEVirgula());
//                bwTemp.newLine();
//            }
//            
//            bwTemp.close();
//            
//            //Excluir arquivo atual
//            arquivoAtual.delete();
//            
//            //Renomear o arquivo temporário
//            arquivoTemp.renameTo(arquivoAtual);
//
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//
//    }

    public static void atualizar(Medico correta) {
        for (Medico m : especialidades) {
            if (m.getCodigo().equals(correta.getCodigo())) {
                int posicao = especialidades.indexOf(m);
                especialidades.set(posicao, correta);
                break;
            }
        }
        
//        atualizarArquivo();

    }
    
    
    
    
    
    
}

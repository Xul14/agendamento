package br.senai.sp.jandira.teste;

import java.util.ArrayList;

import br.senai.sp.jandira.AgendaApp;
import br.senai.sp.jandira.dao.EspecialidadeDAO;

//import javax.swing.JOptionPane;

import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class TesteObjetos {

	public static void main(String[] args) {
            
            int[] a = {6, 9, 78, 90, 23, 55};
            int[] b = new int[4];
            b[0] = 55;
            b[1] = 55;
            b[2] = 11;
            b[3] = 99;
            
            int[][] c = { 
                {4,6,5},
                {5,9,6}, 
                {1,13,3}
            };
            
            String[][] quitanda = {
                {"banana", "maçã", "uva", "morango"},
                {"Alface", "couve", "salsinha", "pimentão","pepino"},
                {"Tomate", "Abacate", "Abobrinha"}
            };
            
            System.out.println(c[2][1]);
            System.out.println(quitanda[1][4]);
            
            System.out.println("*****************************************************");
		
		Especialidade e1 = new Especialidade("Cardiologia");
//		e1.setNome("Cardiologista");
		e1.setDescricao("Não deixa ter um ataque");
		
		Especialidade e2 = new Especialidade();
		e2.setNome("Gastro");
		e2.setDescricao("Cuida do sistema digestivo");
                
                Especialidade e3 = new Especialidade();
		e3.setNome("Qualquer coisa!");
                e3.setDescricao("Parte da medicina que estuda doenças da pele");
		
		Especialidade e4 = new Especialidade("Otorrino", "Cuida do ouvido");
                Especialidade e5 = new Especialidade("Especialidade 5!");
                
		
//		JOptionPane.showMessageDialog(null, e1.getNome());
		
//		JOptionPane.showMessageDialog(null, e1.getNome());
		
		ArrayList<Especialidade> especialidades = new ArrayList<>();
		especialidades.add(e1);
		especialidades.add(e2);
		especialidades.add(e3);
		System.out.println(especialidades.size());
                
                EspecialidadeDAO.gravar(e1);
                EspecialidadeDAO.gravar(e2);
                
                System.out.println("Tamanho ----> " +EspecialidadeDAO.getEspecialidades().size());
                
                EspecialidadeDAO.gravar(e3);
                EspecialidadeDAO.gravar(e4);
                
                System.out.println("Tamanho ----> " +EspecialidadeDAO.getEspecialidades().size());
                
                System.out.println(EspecialidadeDAO.getEspecialidade(101).getNome());
                
                EspecialidadeDAO.exclui(102);
                System.out.println("Tamanho ----> " +EspecialidadeDAO.getEspecialidades().size());
                
                System.out.println(EspecialidadeDAO.getEspecialidade(102).getNome());
                
                Especialidade correta = new Especialidade("Dermatologia", "Parte da medicina que cuida da pele");
                correta.setCodigo(e3.getCodigo());
                EspecialidadeDAO.atualizar(correta);
                System.out.println(EspecialidadeDAO.getEspecialidade(102).getNome());
                
                
		
		//Imprimir no console o nome das especialidades do ArrayList
		
		System.out.println("- - - - - - - - - WHILE - - - - - - - - -");
		
		int i = 0;
		while (i < especialidades.size()) {
			System.out.println(especialidades.get(i).getNome());
			i++;
		}
		
		//Ultilização do for para iteração.
		
		System.out.println("- - - - - - - - - FOR - - - - - - - - -");
		
		for(int x = 0; x < especialidades.size(); x++){
			System.out.println(especialidades.get(x).getNome());
		}
		
		//FOR EACH -> para cada
		
		System.out.println("- - - - - - - - FOR EACH - - - - - - - -");
		
		for(Especialidade e : especialidades) {
			System.out.println(e.getNome());
		}
		
		//criar 3 planos de saúde, e armazenar em um ArrayList e exibir o nome da operadora de cada um deles usando o FOR EACH
		
		PlanoDeSaude p1 = new PlanoDeSaude("Amil");
		PlanoDeSaude p2 = new PlanoDeSaude("Unimed");
		PlanoDeSaude p3 = new PlanoDeSaude("Notredame");
		
		ArrayList<PlanoDeSaude> planosDeSaude = new ArrayList<>();
		planosDeSaude.add(p1);
		planosDeSaude.add(p2);
		planosDeSaude.add(p3);
		System.out.println("- - - - - - PLANOS DE SAÚDE - - - - - - -");
		
		for(PlanoDeSaude p : planosDeSaude) {
			System.out.println(p.getOperadora());
			System.out.println(p.getQuantidade());
		}
		
		AgendaApp.main(args);
		
		System.out.println("-----------" + PlanoDeSaude.getQuantidade());
		
		
		
		
		

	}

}

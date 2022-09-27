package br.senai.sp.jandira.teste;

import java.util.ArrayList;

import br.senai.sp.jandira.AgendaApp;

//import javax.swing.JOptionPane;

import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class TesteObjetos {

	public static void main(String[] args) {
		
		Especialidade e1 = new Especialidade("Cardiologia");
//		e1.setNome("Cardiologista");
		e1.setDescricao("Não deixa ter um ataque");
		
		Especialidade e2 = new Especialidade();
		e2.setNome("Gastro");
		e2.setDescricao("Cuida do sistema digestivo");
		
		Especialidade e4 = new Especialidade("Otorrino", "Cuida do ouvido");
		
//		JOptionPane.showMessageDialog(null, e1.getNome());
		
		Especialidade e3 = e1;
//		e3.setNome("Qualquer coisa!");
		
//		JOptionPane.showMessageDialog(null, e1.getNome());
		
		ArrayList<Especialidade> especialidades = new ArrayList<>();
		especialidades.add(e1);
		especialidades.add(e2);
		especialidades.add(e3);
		System.out.println(especialidades.size());
		
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

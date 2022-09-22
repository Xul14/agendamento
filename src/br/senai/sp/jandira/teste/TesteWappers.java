package br.senai.sp.jandira.teste;

import java.util.ArrayList;

import br.senai.sp.jandira.model.Especialidade;

public class TesteWappers {

	public static void main(String[] args) {
		
//		int a = 5;
//		
//		Integer b = 5;
//		
//		Double x = 2.9;
//		
		ArrayList<Especialidade> especialidades = new ArrayList<>();
		
		Especialidade e1 = new Especialidade("Cardiologia");
		e1.setNome("Cardiologista");
		e1.setDescricao("Não deixa ter um ataque");
		
		Especialidade e2 = new Especialidade();
		e2.setNome("Gastro");
		e2.setDescricao("Cuida do sistema digestivo");
		
		especialidades.add(e1);
		especialidades.add(e2);
		
		Especialidade e3 = new Especialidade();
		e3.setNome("Fisioterapia");
		e3.setDescricao("Não deixa ficar com dor nas costas");
		
		especialidades.add(e3);
		
		Especialidade e4 = new Especialidade();
		e4.setNome("Clínico geral");
		e4.setDescricao("Sabe de tudo um pouco");
		
//		Especialidade[] especialidades = {e1, e2, e3, e4};
		
		Especialidade e5 = new Especialidade();
		e5.setNome("Pediatria");
		e5.setDescricao("Cuidado com crianças");
		
		//especialidades[4] = e5;
		
		especialidades.add(e4);
		especialidades.add(e5);
		
		System.out.println(especialidades.size());
		
		//Valores inteiros
		
		ArrayList<Integer> notas = new ArrayList<>();
		notas.add(8);
		notas.add(50);
		notas.add(75);
		notas.add(90);
		System.out.println(notas.size());
		
		//Ver o nome da especialidade que está em determinada posição
		
		System.out.println(especialidades.get(3).getNome());
		
		//Trocar nome da especialidade da posição 1 do Array
		
		especialidades.get(1).setNome("Teste");
		System.out.println(especialidades.get(1).getNome());
		
		Especialidade nova = especialidades.get(2);
		System.out.println(nova.getNome());
		
		
		
		
		

	}

}

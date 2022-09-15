package br.senai.sp.jandira;

import javax.swing.JOptionPane;

import br.senai.sp.jandira.model.Especialidade;

public class AgendaApp {

	public static void main(String[] args) {
		
		Especialidade especialidade =  new Especialidade();
		especialidade.setNome("Cardiologia");
		especialidade.setDescricao("A carrdiologia cuida do coração...");
		
		JOptionPane.showMessageDialog(null, especialidade.getNome());
		System.out.println(especialidade.getNome());
		System.out.println(especialidade.getDescricao());
		

	}

}

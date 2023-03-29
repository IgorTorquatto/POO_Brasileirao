package main;

import java.util.ArrayList;

import campeonato.Campeonato;
import campeonato.Clube;


public class Teste {
	public static void main(String[] args) {
		
		ArrayList<Clube> clubes = new ArrayList<Clube>();
		
		//Criando os clubes:
		for(int i = 0; i <5 ; i++) {
			clubes.add(new Clube("Clube " + String.valueOf(i+1)));
		}
		
		//Criando o campeonato:
		Campeonato campeonato = new Campeonato(clubes);
		
		campeonato.jogarCampeonato();
		campeonato.getClassificacao();
	}
}

package main;

import java.util.ArrayList;

import campeonato.Campeonato;
import campeonato.Clube;


public class Teste {
	public static void main(String[] args) {
		
		ArrayList<Clube> clubes = new ArrayList<Clube>();
		
		String[] todos_times = {"Palmeiras","Flamengo","Cruzeiro","Internacional","Fluminense","Corinthians","Athletico-PR","Atlético","Fortaleza","São Paulo","América","Botafogo","Santos","Goiás","Red Bull Bragantino","Coritiba","Cuiabá","Grêmio","Vasco","Bahia" };
		
		//Criando os clubes:
		for(int i = 0; i <todos_times.length ; i++) {
			clubes.add(new Clube(todos_times[i]));
		}
		
		
		//Criando o campeonato:
		Campeonato campeonato = new Campeonato(clubes);
		
		campeonato.jogarCampeonato();
	
	}
}

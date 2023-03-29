package campeonato;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Campeonato {
	//Atributo:
	public ArrayList<Clube> clubes = new ArrayList<Clube>();
	
	
	//Random:
	Random numero_random = new Random();
	
	//Construtor:
	public Campeonato(ArrayList<Clube> clubes)  {
		this.clubes = clubes;
		
	}
	//Métodos:
	public void jogarCampeonato() {
		int numero_clubes = clubes.size();
		int qtd_confrontos = numero_clubes * (numero_clubes -1);
		
		System.out.println("Número times: " + numero_clubes);
		System.out.println("Número confrontos: " + qtd_confrontos);
		System.out.println("\n Confrontos: ");
		
		for(int i = 0 ; i < numero_clubes ; i++) {
			
			for(int j = 0; j < numero_clubes ; j++) {
				if (i == j ) continue;
				//System.out.println("Partida de " + clubes.get(i).getNome()+ " enfrentando  " + clubes.get(j).getNome());
				jogarPartida(clubes.get(i),clubes.get(j));
			}
			
		}
		
	}
	
	public void jogarPartida(Clube x , Clube y) {
		
		int pl_time1 = numero_random.nextInt(6);
		int pl_time2 = numero_random.nextInt(6);
		int saldox;
		int saldoy;
		
		
		if (pl_time1 == pl_time2) {
			x.empatar();
			y.empatar();
			System.out.printf("\n %s X %s (%d - %d) \n",x.nome,y.nome,pl_time1,pl_time2);
		}
		
		else if (pl_time1 > pl_time2) {
			//Para x:
			saldox = pl_time1 - pl_time2;
			x.ganhar(saldox);
			
			//Para y:
			saldoy = pl_time2 - pl_time1;
			y.perder(saldoy);
			
			System.out.printf("\n %s X %s (%d - %d) \n",x.nome,y.nome,pl_time1,pl_time2);
		}
		
		else if (pl_time2 > pl_time1) {
			//Para x:
			saldox = pl_time1 - pl_time2;
			x.perder(saldox);
			
			//Para y:
			saldoy = pl_time2 - pl_time1;
			y.ganhar(saldoy);
			
			System.out.printf("\n %s X %s (%d - %d) \n",x.nome,y.nome,pl_time1,pl_time2);
		}
			
	}
	
	public String getClassificacao() {
		
		/* ArrayList<Integer> times_pontos = new ArrayList<Integer>();
		System.out.println("\n Classificação: ");
		
		
		for(int i = 0 ; i < clubes.size();i++) {
			
			System.out.printf("\n %s : %d \n",clubes.get(i).getNome(),clubes.get(i).getPontos());
		}
		for(int i = 0; i< clubes.size();i++) {
			times_pontos.add(clubes.get(i).pontos);
		}
		
		Collections.sort(times_pontos, Collections.reverseOrder());
		
		for(int i = 0; i < times_pontos.size();i++) {
			System.out.println(times_pontos.get(i)+ " pontos");
		}
		*/
		System.out.println("\n Classificação: ");
		
		clubes.sort(Comparator.comparing(Clube :: getPontos ).reversed());
		for (Clube clube : clubes) {
			System.out.printf("\n %s %d pontos \n",clube.nome,clube.pontos);
			
		}
			
			
			
			
		return "oi";
	}
	
	public String getCampeao() {
		String vencedor ;
		ArrayList<Integer> pontuacoes = new ArrayList<Integer>();
		
		for(int i = 0 ; i < clubes.size();i++) {
			pontuacoes.add(clubes.get(i).pontos);
		}
		
		Collections.sort(pontuacoes);
		
		vencedor = clubes.get(0).nome;
		
		return vencedor;
	}
	
}

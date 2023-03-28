package campeonato;

import java.util.ArrayList;
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
		
		for(int i = 0 ; i < qtd_confrontos ; i++) {
			
			for(int j = 0; j < (numero_clubes -1 ); j++) {
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
			System.out.printf("\n %s X %s (%d - %d) \n",x.getNome(),y.getNome(),pl_time1,pl_time2);
		}
		
		else if (pl_time1 > pl_time2) {
			//Para x:
			saldox = pl_time1 - pl_time2;
			x.ganhar(saldox);
			
			//Para y:
			saldoy = pl_time2 - pl_time1;
			y.perder(saldoy);
			
			System.out.printf("\n %s X %s (%d - %d) \n",x.getNome(),y.getNome(),pl_time1,pl_time2);
		}
		
		else if (pl_time2 > pl_time1) {
			//Para x:
			saldox = pl_time1 - pl_time2;
			x.perder(saldox);
			
			//Para y:
			saldoy = pl_time2 - pl_time1;
			y.ganhar(saldoy);
			
			System.out.printf("\n %s X %s (%d - %d) \n",x.getNome(),y.getNome(),pl_time1,pl_time2);
		}
			
	}
	
	/*public int getClassificacao() {
		
	}
	
	public int getCampeao() {
		
	}*/
	
}

package campeonato;

import java.util.ArrayList;
import java.util.Random;

public class Campeonato {
	//Atributo:
	public ArrayList<Clube> participantes = new ArrayList<Clube>();
	
	//Random:
	Random numero_random = new Random();
	
	//Construtor:
	public Campeonato(ArrayList<Clube> clubes)  {
		this.participantes = clubes;
		String[] texto = {"Bem","Vindo"};
		for(int i =0 ; i<texto.length ;i++) {
			for (String palavra : texto) {
				Thread.currentThread().sleep(1000);
				System.out.println(palavra);
			}
		}
	}
	//Métodos:
	public void jogarCampeonato() {
		
	}
	
	private void jogarPartida(Clube x , Clube y) {
		
		int pl_time1 = numero_random.nextInt(6);
		int pl_time2 = numero_random.nextInt(6);
		int saldox;
		int saldoy;
		
		
		if (pl_time1 == pl_time2) {
			x.empatar();
			y.empatar();
		}
		
		else if (pl_time1 > pl_time2) {
			//Para x:
			saldox = pl_time1 - pl_time2;
			x.ganhar(saldox);
			
			//Para y:
			saldoy = pl_time2 - pl_time1;
			y.perder(saldoy);
		}
		
		else if (pl_time2 > pl_time1) {
			//Para x:
			saldox = pl_time1 - pl_time2;
			x.perder(saldox);
			
			//Para y:
			saldoy = pl_time2 - pl_time1;
			y.ganhar(saldoy);
		}
			
	}
	
	/*public int getClassificacao() {
		
	}
	
	public int getCampeao() {
		
	}*/
	
}

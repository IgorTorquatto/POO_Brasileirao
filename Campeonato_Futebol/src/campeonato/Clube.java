package campeonato;

public class Clube {
		//Atributos:
		private String nome;
		private int pontos;
		private int saldoGols;
		
		
		//Construtor:
		/*public Clube(String nome,int pontos,int saldoGols) {
			this.nome = nome;
			this.pontos = pontos;
			this.saldoGols = saldoGols;
		}*/
		
		//Métodos:
		public void ganhar(int saldoGols) {
			this.pontos += 3;
			
		}
		
		public void empatar() {
			this.pontos += 1;
		}
		
		public void perder(int saldoGols) {
			
		}
	
}

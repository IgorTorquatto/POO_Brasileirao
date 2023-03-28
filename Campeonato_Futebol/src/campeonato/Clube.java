package campeonato;

public class Clube {
		//Atributos:
		private String nome;
		private int pontos;
		private int saldoGols;
		
		
		//Construtor:
		public Clube(String nome) {
			this.nome = nome;
			this.pontos = 0;
			this.saldoGols = 0;
		}
		
		//Métodos:
		public void ganhar(int saldoGols) {
			this.pontos += 3;
			
		}
		
		public void empatar() {
			this.pontos += 1;
		}
		
		public void perder(int saldoGols) {
			this.pontos = this.pontos;
		}
		
		public String getNome() {
			return this.nome;
		}
	
}

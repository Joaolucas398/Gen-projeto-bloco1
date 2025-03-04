package projetoJAVA;

public class exercicios {
	
	//Declarando atributos
		protected String nomeDoExercicio;
		protected int reps;
		protected int series;
		protected String comoFazer;
		protected String tempoEmSegundos;
		protected int ganharMassa;
		protected int queimarGordura;
		protected int definirMusculatura;
		
		//Metodo construtor
		
		public exercicios(String nomeDoExercicio, int reps, int series, String comoFazer, String tempo, int ganharMassa, int queimarGordura, int definirMusculatura)
		{
			this.nomeDoExercicio=nomeDoExercicio;
			this.reps=reps;
			this.series=series;
			this.comoFazer=comoFazer;
			this.tempoEmSegundos=tempo;
			this.ganharMassa=ganharMassa;
			this.queimarGordura=queimarGordura;
			this.definirMusculatura=definirMusculatura;
		}
		
		//Getters, Setters and metods 
		public void imprimirInfo() {
			System.out.println("\nNome do exerc�cio: "+getNomeDoExercicio()
					+"\nN�mero de repeti��es: "+getReps()+
					"\nN�mero de s�ries: "+getSeries()+
					"\ncomoFazer: "+getComoFazer()+
					"\nPor quanto tempo: "+getTempoEmSegundos());
		}
		public String getNomeDoExercicio() {
			return nomeDoExercicio;
		}
		public void setNomeDoExercicio(String nomeDoExercicio) {
			this.nomeDoExercicio = nomeDoExercicio;
		}
		public int getReps() {
			return reps;
		}
		public void setReps(int reps) {
			this.reps = reps;
		}
		public int getSeries() {
			return series;
		}
		public void setSeries(int series) {
			this.series = series;
		}
		public String getComoFazer() {
			return comoFazer;
		}
		public void setComoFazer(String comoFazer) {
			this.comoFazer = comoFazer;
		}
		public  String getTempoEmSegundos() {
			return tempoEmSegundos;
		}
		public void setTempoEmSegundos(String tempo) {
			this.tempoEmSegundos = tempo;
		}
		public void setRepsSeries(int Reps, int Series) {
			this.reps= Reps;
			this.series= Series;
		}
		
		public int getGanharMassa() {
			return ganharMassa;
		}

		public void setGanharMassa(int ganharMassa) {
			this.ganharMassa = ganharMassa;
		}

		public int getQueimarGordura() {
			return queimarGordura;
		}

		public void setQueimarGordura(int queimarGordura) {
			this.queimarGordura = queimarGordura;
		}

		public int getDefinirMusculatura() {
			return definirMusculatura;
		}

		public void setDefinirMusculatura(int definirMusculatura) {
			this.definirMusculatura = definirMusculatura;
		}

		//Aumenta quantidade de repeti��es e s�ries do exerc�cio.
		public void aumentarRepsSeries(int incrementoReps, int incrementoSeries) {
			this.reps= reps+incrementoReps;
			this.series= series+incrementoSeries;
		}


}

package model;

class Tabuleiro {
	private Pecas coord[][];
	private Pecas polo[];
	private int colunas, linhas;
	private String hemisferio;
	
	public Tabuleiro() {
		linhas = 6;
		colunas = 12;
		coord = new Pecas[colunas][linhas];
		polo = new Pecas[7];
		
		for (int i=0; i<colunas; i++)
			for (int j=0; j<linhas; j++) {
				coord[i][j] = new Pecas();
					coord[i][j].adicionaMetaNaCoord(new Meta());
			}
	}
	
	public void iniciaPolo(Jogador jogador, int polo) {
		coord[polo][0].adicionaPeoesNoPolo(jogador);
		return;
	}
	
	private void adicionaPeao(Jogador jogador, int numPeao, int polo, int casa) {
		coord[polo][casa].adicionaPeaoNaCoord(jogador, numPeao);
	}
	
	private void removePeca(Jogador jogador, int polo, int casa) {
		coord[polo][casa].retiraPeao(jogador);
	}
	
	public void movimentaPeaoTabuleiro(Jogador jogador, int numPeao, int movimento, int qtdCasas) {
		
	}

}

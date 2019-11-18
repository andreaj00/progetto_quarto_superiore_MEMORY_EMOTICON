//gamer
//JIANG ANDREA
class Gamer{
	//dichiarazione attributi
	private String nome;//nome del Gamer
	private int minuti;//minuti impiegati dal giocatore
	private int secondi;//secondi impiegati dal giocatore
	private int millesimi;//millesimi impiegati dal giocatore
	//costruttore
	public Gamer(String nome,int minuti,int secondi,int millesimi){
		this.nome=nome;
		this.minuti=minuti;
		this.secondi=secondi;
		this.millesimi=millesimi;
	}
	
	//metodi
	//restituisce il nome
	public String getNome(){
		return nome;
	}	
	
	//restituisce i minuti
	public int getMinuti(){
		return minuti;
	}
	
	//restituisce i secondi
	public int getSecondi(){
		return secondi;
	}
	
	//restituisce i minuti
	public int getMillesimi(){
		return millesimi;
	}
	
	//restituisce la stringa con il tempo
	public String stampaTempo(){
		String msg;
		msg=String.format("%02d:%02d.%03d",minuti,secondi,millesimi);
		return msg;
	}
	
	//restituisce tutti i valori
	public String toString(){
		String msg;
		msg=nome+"  "+minuti+":"+secondi+":"+millesimi;
		return msg;
	}

}
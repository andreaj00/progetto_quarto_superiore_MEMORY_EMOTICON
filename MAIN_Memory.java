/*Memory, noto anche come coppie, è un popolare gioco di carte (il mazzo di carte è costituito da coppie uguali,) 
che richiede concentrazione e memoria. Nel gioco,le carte sono inizialmente mescolate e disposte coperte sul tavolo. 
I giocatori, a turno, scoprono due carte; se queste formano una "coppia", vengono incassate dal giocatore di turno, che può scoprirne altre due; 
altrimenti, vengono nuovamente coperte e rimesse nella loro posizione originale sul tavolo, e il turno passa al prossimo giocatore.
 Vince il giocatore che riesce a scoprire più coppie.

Il gioco può essere anche giocato come solitario, per esempio tenendo conto del numero di carte non corrispondenti scoperte e
 cercando di incassare tutte le carte nel minor numero possibile di tentativi.

Scrivere un programma che simuli il gioco sopra descritto, in modalità solitario, considerando le seguenti indicazioni:

    il numero di coppie è pari a 8 quindi le carte totali sono 16
    il tavolo da gioco è realizzato con una matrice 4 X 4
    i simboli utilizzati sono disegni/foto relativi ad un determinato tema
*/
//JIANG Jia Hao Andrea
import javax.swing.*;
import java.io.File;
public class MAIN_Memory{
	public static void main(String[] argv){
		//dichiarazione componenti
		GUI_Memory f;//GUI
		File nome;//variabile tipo File usata per controllare che le cartelle di appoggio esistano
		String[] elenco;//variabile usata per controllare che le cartelle di appoggio esistano
		
		
		//controllo che le cartelle di appoggio esistano
		//controllo la cartella classifica
		nome = new File("classifica");
		//se non esiste lo creo
		if(!nome.isDirectory()){
			nome.mkdir();
		}
		//controllo la cartella immagini
		nome = new File("immagini");
		//se non esiste chiudo il programma
		if(!nome.isDirectory()){
			JOptionPane.showMessageDialog(null,"la cartella immagini non esiste");
			System.exit(1);
		}
		//se esiste controllo che ci siano tutte le immagini e la cartella sfondo
		elenco=nome.list();
		//Scorro l'elenco e controllo che ci siano tutti
		if(elenco.length==34){
			for(int i=0;i<elenco.length;i++){
				boolean flag=false;
				//controllo che non sia la cartella sfondo
				if(elenco[i].equals("sfondo")){
					flag=true;
				}
				//controllo se è un'immagine tra 0 a 31
				for(int j=0 ;j<elenco.length && !flag;j++){
					if(elenco[i].equals(j+".jpg")){
						flag=true;
					}
				}
				//controllo che sia cocperto.jpg
				if(!flag && elenco[i].equals("coperto.jpg")){
					flag=true;
				}
				if(!flag){
					JOptionPane.showMessageDialog(null,"la cartella immagini non contiene tutte le immagini numerate da 0.jpg a 31.jpg o coperto.jpg o la cartella sfondo");
					System.exit(1);
				}
			}	
		}	
		else{
			JOptionPane.showMessageDialog(null,"la cartella immagini non contiene tutte le immagini numerate da 0.jpg a 31.jpg o coperto.jpg o la cartella sfondo,\n oppure ci sono dei file di troppo");
			System.exit(1);
		}
		//controllo chenella cartella sfondi ci siano utte le immagini (dato che ho controllato precedentemente se esiste o meno)
		nome = new File("immagini/sfondo");
		elenco=nome.list();
		//Scorro l'elenco e controllo che ci siano tutti gli sfondi
		if(elenco.length==4){
			for(int i=0;i<elenco.length;i++){
				boolean flag=false;
				if(elenco[i].equals("base.jpg")){
					flag=true;
				}
				if(!flag && elenco[i].equals("istruzioni.jpg")){
					flag=true;
				}
				if(!flag && elenco[i].equals("podio.jpg")){
					flag=true;
				}
				if(!flag && elenco[i].equals("risultato.jpg")){
					flag=true;
				}
				if(!flag){
					JOptionPane.showMessageDialog(null,"la cartella immagini/sfondo non contiene tutte le immagini di sfondo");
					System.exit(1);
				}
			}	
		}	
		else{
			JOptionPane.showMessageDialog(null,"la cartella immagini/sfondo non contiene tutte le immagini di sfondo,\n oppure ci sono dei file di troppo");
			System.exit(1);
		}
		
		//creo la gui e inizia il gioco
		f=new GUI_Memory("MEMORY");
		
		//Settagio caratteristiche
		f.setSize(810,935);
		f.setVisible(true);
		f.setLocationRelativeTo(null);
		f.setResizable(false);
		
	}
}
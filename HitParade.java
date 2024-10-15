import java.util.ArrayList;

public class HitParade {
	
	ArrayList<Hit> lista;

	public HitParade() {
		
		this.lista = new ArrayList();
	}
	
	public void addHit(Hit h1) {
		
		lista.add(h1);
	}
	
	public void stampa() {
		
		for (Hit h1: lista) {
			System.out.println(h1);
		}
	}
	
	public void cercaTitolo(String titolo) {
		
		for (Hit h1: lista) {
			if (h1.titolo.equalsIgnoreCase(titolo)) {
				
				System.out.println(h1);
			}
		}
		
		
	}
public void cercaGenere(String genere) {
		
		for (Hit h1: lista) {
			if (h1.genere.equalsIgnoreCase(genere)) {
				
				System.out.println(h1);
			}
		}
		
		
	}
public void scambia(int pos1, int pos2) {
	

	
	Hit temp = lista.get(pos1);
	
	
	lista.add((pos1+1) ,lista.get(pos2));
	lista.remove(pos1);
	lista.add((pos2+1) ,temp);
	lista.remove(pos2);


}}

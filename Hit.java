
public class Hit {
	String titolo;
	String autore;
	String genere;
	public Hit(String titolo, String autore, String genere) {
		super();
		this.titolo = titolo;
		this.autore = autore;
		this.genere = genere;
	}
	@Override
	public String toString() {
		return "Hit [titolo=" + titolo + ", autore=" + autore + ", genere=" + genere + "]";
	}
	
	

}


public class UsaHit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HitParade p1 = new HitParade();
		
		p1.addHit(new Hit("Albachiara", "Rossi", "rock"));
		p1.addHit(new Hit("Sweet jane", "Lou Reed", "rock"));
		p1.addHit(new Hit("Rose rosse", "Ranieri", "rock"));
		//p1.stampa();
		//p1.cercaTitolo("Sweet Jane");
		//p1.cercaGenere("rock");
		p1.scambia((2-1), (3-1));
		p1.stampa();

	}

}

import java.util.ArrayList;
import java.util.List;

public class Banque {

	private List<CompteBancaire> comptes;
	private String libell�;

	public Banque(String libell�) {
		this.libell� = libell�;
		this.comptes = new ArrayList<CompteBancaire>();
	}
	
	public String GetLibell�() {
		return this.libell�;
	}
	
	public void setOuvrir(String n, float v) throws IllegalArgumentException{
		if( estCompteExistant(n) && v < 0) {
			throw new IllegalArgumentException("Compte d�j� existant, cr�ation de compte impossible");
		}
		CompteBancaire c = new CompteBancaire(n);
		c.d�poser(v);
		this.comptes.add(c);
	}
	
	public void setFermer(String n) throws IllegalArgumentException {
		if( !estCompteExistant(n) && this.comptes.getCompte.solde != 0) {
			throw new IllegalArgumentException("Compte non existant, fermeture impossible");
		}
		for(int v = 0 ; v < this.comptes.size() ; v++) {
			if(this.comptes.get(v).getNum�ro() == n) {
				this.comptes.remove(v);
			}
		}
	}
	
	public boolean estCompteExistant(String n) {
		for(int x = 0 ; x < this.comptes.size() ; x++) {
			if(this.comptes.get(x).getNum�ro() == n || x == this.comptes.size()) {
				return (this.comptes.get(x).getNum�ro() == n) ;
			}
		}
		return false;
	}
	
	public CompteBancaire getCompte(String n) throws IllegalArgumentException {
		if ( !estCompteExistant(n) ) {
			throw new IllegalArgumentException("Compte non existant");
		}
		for(int x = 0 ; x < this.comptes.size() ; x++) {
			if(this.comptes.get(x).getNum�ro() == n ) {
				return (this.comptes.get(x)) ;
			}
		}
		return null;
	}
	
	public void setD�poser(String n, float v) throws IllegalArgumentException {
		if( !estCompteExistant(this,n) && v < 0) {
			throw new IllegalArgumentException("Compte non existant et d�pot n�gatif");
		}
		for(int x = 0 ; x < this.comptes.size() ; x++) {
			if(this.comptes.get(x).getNum�ro() == n) {
				this.(v);
			}
		}
	}
}

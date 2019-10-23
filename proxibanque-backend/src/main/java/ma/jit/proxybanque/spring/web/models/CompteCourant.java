package ma.jit.proxybanque.spring.web.models;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *  @author fawzi oussama 
 * @author yassir abouzid
 * @author mostafa hantali
 *
 */
/**
 * definition de la classe CompteCourant comme classe fille qui herite de la classe Compte
 *
 */
@Entity
@DiscriminatorValue("CC")
public class CompteCourant extends Compte {

	private double decouvert = 1000;
	
	/** Constructeurs */
	
	public CompteCourant() {
	}

	public CompteCourant(double solde, double decouvert) {
		super(solde);
		this.decouvert = decouvert;
	}

	public CompteCourant(double solde, double decouvert, String carteType) {
		this(solde, decouvert);
		this.carteType = carteType;
	}

	/** Getters and setters */
	
	public double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

	public void setCarteType(String carteType) {
		this.carteType = carteType;
	}


}

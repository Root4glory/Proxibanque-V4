package ma.jit.proxybanque.spring.web.models;

import java.util.Random;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author fawzi oussama 
* @author yassir abouzid
* @author mostafa hantali
 *
 */
/**
 * definition de la classe CompteEpargne comme classe fille qui herite de la
 * classe Compte
 *
 */
@Entity
@DiscriminatorValue("CE")
public class CompteEpargne extends Compte {

	private double taux = 3;

	/** Constructeurs */

	public CompteEpargne() {
	}

	public CompteEpargne(double solde, double taux) {
		super(solde);
		this.taux = taux;
	}

	/** Getters and setters */

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}

	@Override
	public void setCarteType(String carteType) {
	}

}

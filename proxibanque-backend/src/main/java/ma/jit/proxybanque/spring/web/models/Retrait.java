package ma.jit.proxybanque.spring.web.models;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author fawzi oussama
 * @author yassir abouzid
 * @author mostafa hantali
 *
 */
/**
 * 
 * definition de la classe Retrait comme fille qui herite de la classe Operation
 *
 */

@Entity
@DiscriminatorValue("R")
public class Retrait extends Operation {

	/**
	 * Constructeurs
	 */
	public Retrait() {
		super();
	}

	public Retrait(double montant) {
		super(montant);
	}

	public Retrait(double montant, Compte compte) {
		super(montant, compte);
	}

	public Retrait(int id, Date dateOperation, double montant, Compte compte) {
		super(id, dateOperation, montant, compte);
	}

	@Override
	public void setType() {
		this.type = "Retrait";
	}

}

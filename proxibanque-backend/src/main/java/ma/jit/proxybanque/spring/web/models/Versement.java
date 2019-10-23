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
 * 
 * definition de la classe Versement comme fille qui herite de la classe
 * Operation Operation
 *
 *
 */
@Entity
@DiscriminatorValue("V")
public class Versement extends Operation {

	public Versement() {
		super();
	}

	public Versement(double montant) {
		super(montant);
	}

	public Versement(double montant, Compte compte) {
		super(montant, compte);
	}

	public Versement(int id, Date dateOperation, double montant, Compte compte) {
		super(id, dateOperation, montant, compte);
	}

	@Override
	public void setType() {
		this.type = "Versement";
	}

}

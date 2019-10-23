package ma.jit.proxybanque.spring.web.models;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author fawzi oussama 
* @author yassir abouzid
* @author mostafa hantali
 *
 */
/**
 * 
 * definition de la classe Conseiller comme classe fille qui herite de la classe Employer
 * 
 *
 */
 
@Entity
@DiscriminatorValue("C")
public class Conseiller extends Employer {

	@OneToMany(mappedBy = "employe", fetch = FetchType.LAZY, cascade= CascadeType.REFRESH)
	@JsonIgnoreProperties("employe")
	private Collection<Client> clients = new ArrayList<Client>();

	/** Constructeurs */
	
	public Conseiller() {
		super();
	}

	public Conseiller(int id) {
		super(id);
	}

	public Conseiller(int id, String nom, String prenom, String username, String password, String email,
			String adresse) {
		super(id, nom, prenom, username, password, email, adresse);
	}

	public Conseiller(String nom, String prenom, String username, String password, String email, String adresse) {
		super(nom, prenom, username, password, email, adresse);
	}
	
	/** Getters and setters */
	
	public Collection<Client> getClients() {
		return clients;
	}

	public void setClients(Collection<Client> clients) {
		this.clients = clients;
	}

	/**
	 * methode ajouter d'un client 
	 * @param client
	 * @return boolean
	 */
	public boolean addClient(Client client) {
		return this.clients.add(client);
	}

	/** Getters and setters */

	@Override
	public void setType() {
		this.type = "conseiller";
	}

	public void setIdResponsable(int idResponsable) {
		this.idResponsable = idResponsable;
	}

	
}

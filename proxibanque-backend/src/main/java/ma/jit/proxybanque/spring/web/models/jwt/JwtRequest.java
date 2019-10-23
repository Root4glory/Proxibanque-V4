package ma.jit.proxybanque.spring.web.models.jwt;

import java.io.Serializable;

/**
 * <h3>JwtRequest</h3>
 * <p>
 * une classe qui represente les données crypter dans le jeton envouyer par le
 * client
 * </p>
 * <p>
 * le nom d'utilisateur et le mot de passe seront crypter
 * </p>
 * 
 * @author fawzi oussama
 * @author yassir abouzid
 * @author mostafa hantali
 * @version 1.0
 */
public class JwtRequest implements Serializable {

	private static final long serialVersionUID = 5926468583005150707L;

	private String username;
	private String password;

	// need default constructor for JSON Parsing

	/** Constructeurs */

	public JwtRequest() {

	}

	public JwtRequest(String username, String password) {
		this.setUsername(username);
		this.setPassword(password);
	}

	/** Getters and setters */

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}

public class Utilisateur {
	public static final String MODERATEUR = "M";
	public static final String UTILISATEUR = "U";
	private String nom;
	private String prenom;
	private String email;
	private String autorisation;
	private String motDePasse;
	
	public Utilisateur(String nom, String prenom, String email, String motDePasse, String autorisation) {
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.motDePasse = motDePasse;
		this.autorisation = autorisation;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAutorisation() {
		return this.autorisation;
	}

	public void setAutorisation(String autorisation) {
		this.autorisation = autorisation;
	}

	public String getMotDePasse() {
		return this.motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	
	public boolean equals(Object obj) {
		if(this.nom != null) {
			if(obj instanceof Utilisateur) {
				Utilisateur utilisateur = (Utilisateur)obj;
				return this.nom.equals(utilisateur.nom);
			}
		}
		return false;
	}
	
	public int  hashCode() {
		if(this.nom != null) {
			return this.nom.hashCode();
		}else {
			return super.hashCode();
		}
	}
	
	public String toString() {
		if(isModerateur()) {
			return this.nom + "Modérateur";
		}else if(this.nom != null) {
			return this.nom + "Utilisateur";
		}else {
			return "Utilisateur inconnu";
		}
	}

	private boolean isModerateur() {
		// TODO Auto-generated method stub
		return MODERATEUR.equals(this.autorisation);
	}
	
}

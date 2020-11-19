package esercizioGit;

public class Utente {
	
	private String nome;
	private String cognome;
	private String cf;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getCf() {
		return cf;
	}
	public void setCf(String cf) {
		this.cf = cf;
	}
	public Utente(String nome, String cognome, String cf) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.cf = cf;
	}
	@Override
	public String toString() {
		return "Utente [nome=" + nome + ", cognome=" + cognome + ", cf=" + cf + "]";
	}
	
	
}


public class Ordinazione {

	private String nt;
	private String ordine;
	private String scontrino;

	public Ordinazione(String nt,String ordine,String scontrino){
		this.nt=nt;
		this.ordine=ordine;
		this.scontrino=scontrino;
	}

	public String getNt() {
		return nt;
	}

	public void setNt(String nt) {
		this.nt = nt;
	}

	public String getOrdine() {
		return ordine;
	}

	public void setOrdine(String ordine) {
		this.ordine = ordine;
	}

	public String getScontrino() {
		return scontrino;
	}

	public void setScontrino(String scontrino) {
		this.scontrino = scontrino;
	}

}

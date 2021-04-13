public class Vacuna {

	private String nom;
	private float efectivitat;
	private int durada;

	Vacuna(String nom, float e, int d) {
		this.nom = nom;
		efectivitat = e;
		durada = d;
	}
	
	public Vacuna(){
		this.nom = "";
		this.efectivitat = 0;
		this.durada = 0
	}
	public Vacuna(Vacuna v) {
		this.nom = v.nom;
		this.efectivitat = v.efectivitat;
		this.durada = v.durada;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vacuna other = (Vacuna) obj;
		if (durada != other.durada)
			return false;
		if (Float.floatToIntBits(efectivitat) != Float.floatToIntBits(other.efectivitat))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Vacuna [nom=" + nom + ", efectivitat=" + efectivitat + ", durada=" + durada + "]";
	}
	

}

	

}
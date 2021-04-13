public class Covid19 extends vacuna {
		
	private String efectesSecundaris;
	
	public void Covid19() {
		this.efectesSecundaris = "";
	}
	
	public Covid19(String efectesSecundaris){
		this.efectesSecundaris = efectesSecundaris;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Covid19 other = (Covid19) obj;
		if (efectesSecundaris == null) {
			if (other.efectesSecundaris != null)
				return false;
		} else if (!efectesSecundaris.equals(other.efectesSecundaris))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Covid19 [efectesSecundaris=" + efectesSecundaris + "]";
	}
	
}
package exPerson;

public class Person {
	private String voornaam;
	private String achternaam;
	private Gender geslacht;
	private int leeftijd;
	private float gewicht;
	private float lengte;

	public Person(String voornaam, String achternaam, Gender geslacht, int leeftijd, float gewicht, float lengte) {

		this.voornaam = voornaam;
		this.achternaam = achternaam;
		this.geslacht = geslacht;
		this.leeftijd = leeftijd;
		this.gewicht = gewicht;
		this.lengte = lengte;
	}
	public Gender getGender() {
		return geslacht;
	}

	public String getVoornaam() {
		return voornaam;
	}

	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}

	public String getAchternaam() {
		return achternaam;
	}

	public void setAchternaam(String achternaam) {
		this.achternaam = achternaam;
	}

	public int getLeeftijd() {
		return leeftijd;
	}

	public void setLeeftijd(int leeftijd) {
		this.leeftijd = leeftijd;
	}

	public float getGewicht() {
		return gewicht;
	}

	public void setGewicht(float gewicht) {
		this.gewicht = gewicht;
	}

	public float getLengte() {
		return lengte;
	}

	public void setLengte(float lengte) {
		this.lengte = lengte;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (achternaam == null) {
			if (other.achternaam != null)
				return false;
		} else if (!achternaam.equals(other.achternaam))
			return false;
		if (geslacht != other.geslacht)
			return false;
		if (Float.floatToIntBits(gewicht) != Float.floatToIntBits(other.gewicht))
			return false;
		if (leeftijd != other.leeftijd)
			return false;
		if (Float.floatToIntBits(lengte) != Float.floatToIntBits(other.lengte))
			return false;
		if (voornaam == null) {
			if (other.voornaam != null)
				return false;
		} else if (!voornaam.equals(other.voornaam))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Person [voornaam=" + voornaam + ", achternaam=" + achternaam + ", geslacht=" + geslacht + ", leeftijd="
				+ leeftijd + ", gewicht=" + gewicht + ", lengte=" + lengte + "]";
	}

}




public class Patient {
	
	private String firstName = "";
	private String lastName = "";
	private int age;
	private String city;
	private int nic;
	private String prefVaccination = "";
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the nic
	 */
	public int getNic() {
		return nic;
	}
	/**
	 * @param nic the nic to set
	 */
	public void setNic(int nic) {
		this.nic = nic;
	}
	/**
	 * @return the prefVaccination
	 */
	public String getPrefVaccination() {
		return prefVaccination;
	}
	/**
	 * @param prefVaccination the prefVaccination to set
	 */
	public void setPrefVaccination(String prefVaccination) {
		this.prefVaccination = prefVaccination;
	}
	
	
	public int compareTo(Patient patient) {
		if (getFirstName() == null || patient.getFirstName() == null) {
			return 0;
		}
		
		return getFirstName().compareTo(patient.getFirstName());
	}

}

package org.hello.boot.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author sparthasarathy
 *
 *mysql> desc country;
+----------------+---------------------------------------------------------------------------------------+------+-----+---------+-------+
| Field          | Type                                                                                  | Null | Key | Default | Extra |
+----------------+---------------------------------------------------------------------------------------+------+-----+---------+-------+
| Code           | char(3)                                                                               | NO   | PRI |         |       |
| Name           | char(52)                                                                              | NO   |     |         |       |
| Continent      | enum('Asia','Europe','North America','Africa','Oceania','Antarctica','South America') | NO   |     | Asia    |       |
| Region         | char(26)                                                                              | NO   |     |         |       |
| SurfaceArea    | float(10,2)                                                                           | NO   |     | 0.00    |       |
| IndepYear      | smallint(6)                                                                           | YES  |     | NULL    |       |
| Population     | int(11)                                                                               | NO   |     | 0       |       |
| LifeExpectancy | float(3,1)                                                                            | YES  |     | NULL    |       |
| GNP            | float(10,2)                                                                           | YES  |     | NULL    |       |
| GNPOld         | float(10,2)                                                                           | YES  |     | NULL    |       |
| LocalName      | char(45)                                                                              | NO   |     |         |       |
| GovernmentForm | char(45)                                                                              | NO   |     |         |       |
| HeadOfState    | char(60)                                                                              | YES  |     | NULL    |       |
| Capital        | int(11)                                                                               | YES  |     | NULL    |       |
| Code2          | char(2)                                                                               | NO   |     |         |       |
+----------------+---------------------------------------------------------------------------------------+------+-----+---------+-------+
15 rows in set (0.00 sec)


 */
@Entity
@Table(name="country")
public class Country implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String code;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="Continent")
	private String continent;
	
	@Column(name="Region")
	private String region;
	
	@Column(name="SurfaceArea")
	private String surfaceArea;
	
	@Column(name="IndepYear")
	private String indepYear;
	
	@Column(name="Population")
	private Long population;
	
	@Column(name="LifeExpectancy")
	private Float lifeExpectancy;
	
	@Column(name="GNP")
	private Double gnp;
	
	@Column(name="GNPOld")
	private Double gnpOld;
	
	@Column(name="LocalName")
	private String localName;
	
	@Column(name="GovernmentForm")
	private String governmentForm;
	
	@Column(name="HeadOfState")
	private String headOfState;
	
	@Column(name="Capital")
	private Long capital;
	
	@Column(name="Code2")
	private String code2;
	
	
	public enum Continent {
		Asia("Asia"),
		Europe("Europe"),
		North_America("North America"),
		Africa("Africa"),
		Oceania("Oceania"),
		Antarctica("Antarctica"),
		South_America("South America");
		
		private String displayName;

		Continent(String displayName) {
	        this.displayName = displayName;
	    }

	    public String displayName() { return displayName; }
	    
	    @Override public String toString() { return displayName; }
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	public String getContinent() {
		return continent;
	}
	
	public void setContinent(String continent) {
		this.continent = continent;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getSurfaceArea() {
		return surfaceArea;
	}

	public void setSurfaceArea(String surfaceArea) {
		this.surfaceArea = surfaceArea;
	}

	public String getIndepYear() {
		return indepYear;
	}

	public void setIndepYear(String indepYear) {
		this.indepYear = indepYear;
	}

	public Long getPopulation() {
		return population;
	}

	public void setPopulation(Long population) {
		this.population = population;
	}

	public Float getLifeExpectancy() {
		return lifeExpectancy;
	}

	public void setLifeExpectancy(Float lifeExpectancy) {
		this.lifeExpectancy = lifeExpectancy;
	}

	public Double getGnp() {
		return gnp;
	}

	public void setGnp(Double gnp) {
		this.gnp = gnp;
	}

	public Double getGnpOld() {
		return gnpOld;
	}

	public void setGnpOld(Double gnpOld) {
		this.gnpOld = gnpOld;
	}

	public String getLocalName() {
		return localName;
	}

	public void setLocalName(String localName) {
		this.localName = localName;
	}

	public String getGovernmentForm() {
		return governmentForm;
	}

	public void setGovernmentForm(String governmentForm) {
		this.governmentForm = governmentForm;
	}

	public String getHeadOfState() {
		return headOfState;
	}

	public void setHeadOfState(String headOfState) {
		this.headOfState = headOfState;
	}

	public Long getCapital() {
		return capital;
	}

	public void setCapital(Long capital) {
		this.capital = capital;
	}

	public String getCode2() {
		return code2;
	}

	public void setCode2(String code2) {
		this.code2 = code2;
	}
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder().append("Code = ").append(code).append(", ")
				.append("Code = ").append(code).append(", ")
				.append("Name = ").append(name).append(", ")
				.append("Continent = ").append(continent).append(", ")
				.append("Region = ").append(region).append(", ")
				.append("SurfaceArea = ").append(surfaceArea).append(", ")
				.append("IndepYear = ").append(indepYear).append(", ")
				.append("Population = ").append(population).append(", ")
				.append("LifeExpectancy = ").append(lifeExpectancy).append(", ")
				.append("Gnp = ").append(gnp).append(", ")
				.append("GnpOld = ").append(gnpOld).append(", ")
				.append("LocalName = ").append(localName).append(", ")
				.append("GovernmentForm = ").append(governmentForm).append(", ")
				.append("HeadOfState = ").append(headOfState).append(", ")
				.append("Capital = ").append(capital).append(", ")
				.append("Code2 = ").append(code2).append(".");
		return str.toString();
	}
}

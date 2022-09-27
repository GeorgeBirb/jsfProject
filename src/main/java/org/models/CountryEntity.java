package org.models;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "country", schema = "world", catalog = "")
public class CountryEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Code", nullable = false, length = 3)
    private String code;
    @Basic
    @Column(name = "Name", nullable = false, length = 52)
    private String name;
    @Basic
    @Column(name = "Continent", nullable = false)
    private Object continent;
    @Basic
    @Column(name = "Region", nullable = false, length = 26)
    private String region;
    @Basic
    @Column(name = "SurfaceArea", nullable = false, precision = 2)
    private BigDecimal surfaceArea;
    @Basic
    @Column(name = "IndepYear", nullable = true)
    private Short indepYear;
    @Basic
    @Column(name = "Population", nullable = false)
    private int population;
    @Basic
    @Column(name = "LifeExpectancy", nullable = true, precision = 1)
    private BigDecimal lifeExpectancy;
    @Basic
    @Column(name = "GNP", nullable = true, precision = 2)
    private BigDecimal gnp;
    @Basic
    @Column(name = "GNPOld", nullable = true, precision = 2)
    private BigDecimal gnpOld;
    @Basic
    @Column(name = "LocalName", nullable = false, length = 45)
    private String localName;
    @Basic
    @Column(name = "GovernmentForm", nullable = false, length = 45)
    private String governmentForm;
    @Basic
    @Column(name = "HeadOfState", nullable = true, length = 60)
    private String headOfState;
    @Basic
    @Column(name = "Capital", nullable = true)
    private Integer capital;
    @Basic
    @Column(name = "Code2", nullable = false, length = 2)
    private String code2;

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

    public Object getContinent() {
        return continent;
    }

    public void setContinent(Object continent) {
        this.continent = continent;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public BigDecimal getSurfaceArea() {
        return surfaceArea;
    }

    public void setSurfaceArea(BigDecimal surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public Short getIndepYear() {
        return indepYear;
    }

    public void setIndepYear(Short indepYear) {
        this.indepYear = indepYear;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public BigDecimal getLifeExpectancy() {
        return lifeExpectancy;
    }

    public void setLifeExpectancy(BigDecimal lifeExpectancy) {
        this.lifeExpectancy = lifeExpectancy;
    }

    public BigDecimal getGnp() {
        return gnp;
    }

    public void setGnp(BigDecimal gnp) {
        this.gnp = gnp;
    }

    public BigDecimal getGnpOld() {
        return gnpOld;
    }

    public void setGnpOld(BigDecimal gnpOld) {
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

    public Integer getCapital() {
        return capital;
    }

    public void setCapital(Integer capital) {
        this.capital = capital;
    }

    public String getCode2() {
        return code2;
    }

    public void setCode2(String code2) {
        this.code2 = code2;
    }
}

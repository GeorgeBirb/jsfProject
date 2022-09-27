package org.models;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "countrylanguage", schema = "world", catalog = "")
@IdClass(CountrylanguageEntityPK.class)
public class CountrylanguageEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CountryCode", nullable = false, length = 3)
    private String countryCode;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Language", nullable = false, length = 30)
    private String language;
    @Basic
    @Column(name = "IsOfficial", nullable = false)
    private Object isOfficial;
    @Basic
    @Column(name = "Percentage", nullable = false, precision = 1)
    private BigDecimal percentage;

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Object getIsOfficial() {
        return isOfficial;
    }

    public void setIsOfficial(Object isOfficial) {
        this.isOfficial = isOfficial;
    }

    public BigDecimal getPercentage() {
        return percentage;
    }

    public void setPercentage(BigDecimal percentage) {
        this.percentage = percentage;
    }
}

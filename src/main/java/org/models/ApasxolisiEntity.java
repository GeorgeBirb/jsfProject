package org.models;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "apasxolisi", schema = "etaireia", catalog = "")
public class ApasxolisiEntity {
    @Basic
    @Column(name = "E_ARTAYT", nullable = true)
    private Integer eArtayt;
    @Basic
    @Column(name = "K_ERGO", nullable = true)
    private Integer kErgo;
    @Basic
    @Column(name = "ORES", nullable = true, precision = 0)
    private Double ores;

    public Integer geteArtayt() {
        return eArtayt;
    }

    public void seteArtayt(Integer eArtayt) {
        this.eArtayt = eArtayt;
    }

    public Integer getkErgo() {
        return kErgo;
    }

    public void setkErgo(Integer kErgo) {
        this.kErgo = kErgo;
    }

    public Double getOres() {
        return ores;
    }

    public void setOres(Double ores) {
        this.ores = ores;
    }
}

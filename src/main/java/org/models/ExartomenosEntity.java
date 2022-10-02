package org.models;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "exartomenos", schema = "etaireia", catalog = "")
public class ExartomenosEntity {
    @Basic
    @Column(name = "E_ARTAYT", nullable = true)
    private Integer eArtayt;
    @Basic
    @Column(name = "ONOMA_EXARTOMENOU", nullable = true, length = -1)
    private String onomaExartomenou;
    @Basic
    @Column(name = "FYLO", nullable = true, length = -1)
    private String fylo;
    @Basic
    @Column(name = "HM_GEN", nullable = true, length = -1)
    private String hmGen;
    @Basic
    @Column(name = "SXESH", nullable = true, length = -1)
    private String sxesh;

    public Integer geteArtayt() {
        return eArtayt;
    }

    public void seteArtayt(Integer eArtayt) {
        this.eArtayt = eArtayt;
    }

    public String getOnomaExartomenou() {
        return onomaExartomenou;
    }

    public void setOnomaExartomenou(String onomaExartomenou) {
        this.onomaExartomenou = onomaExartomenou;
    }

    public String getFylo() {
        return fylo;
    }

    public void setFylo(String fylo) {
        this.fylo = fylo;
    }

    public String getHmGen() {
        return hmGen;
    }

    public void setHmGen(String hmGen) {
        this.hmGen = hmGen;
    }

    public String getSxesh() {
        return sxesh;
    }

    public void setSxesh(String sxesh) {
        this.sxesh = sxesh;
    }
}

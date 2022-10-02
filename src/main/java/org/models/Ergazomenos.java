package org.models;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ergazomenos", schema = "etaireia", catalog = "")
public class Ergazomenos {
    @Basic
    @Column(name = "ONOMA", nullable = true, length = -1)
    private String onoma;
    @Basic
    @Column(name = "ARX_PATR", nullable = true, length = -1)
    private String arxPatr;
    @Basic
    @Column(name = "EPITHETO", nullable = true, length = -1)
    private String epitheto;
    @Basic
    @Column(name = "AR_TAYT", nullable = true)
    private Integer arTayt;
    @Basic
    @Column(name = "HM_GEN", nullable = true, length = -1)
    private String hmGen;
    @Basic
    @Column(name = "DIEYTHYNSI", nullable = true, length = -1)
    private String dieythynsi;
    @Basic
    @Column(name = "FYLO", nullable = true, length = -1)
    private String fylo;
    @Basic
    @Column(name = "MISTHOS", nullable = true, precision = 0)
    private Double misthos;
    @Basic
    @Column(name = "PROISTAMENOS", nullable = true)
    private Integer proistamenos;
    @Basic
    @Column(name = "ARITH_T", nullable = true)
    private Integer arithT;

    public String getOnoma() {
        return onoma;
    }

    public void setOnoma(String onoma) {
        this.onoma = onoma;
    }

    public String getArxPatr() {
        return arxPatr;
    }

    public void setArxPatr(String arxPatr) {
        this.arxPatr = arxPatr;
    }

    public String getEpitheto() {
        return epitheto;
    }

    public void setEpitheto(String epitheto) {
        this.epitheto = epitheto;
    }

    public Integer getArTayt() {
        return arTayt;
    }

    public void setArTayt(Integer arTayt) {
        this.arTayt = arTayt;
    }

    public String getHmGen() {
        return hmGen;
    }

    public void setHmGen(String hmGen) {
        this.hmGen = hmGen;
    }

    public String getDieythynsi() {
        return dieythynsi;
    }

    public void setDieythynsi(String dieythynsi) {
        this.dieythynsi = dieythynsi;
    }

    public String getFylo() {
        return fylo;
    }

    public void setFylo(String fylo) {
        this.fylo = fylo;
    }

    public Double getMisthos() {
        return misthos;
    }

    public void setMisthos(Double misthos) {
        this.misthos = misthos;
    }

    public Integer getProistamenos() {
        return proistamenos;
    }

    public void setProistamenos(Integer proistamenos) {
        this.proistamenos = proistamenos;
    }

    public Integer getArithT() {
        return arithT;
    }

    public void setArithT(Integer arithT) {
        this.arithT = arithT;
    }
}

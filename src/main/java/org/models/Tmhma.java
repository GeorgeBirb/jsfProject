package org.models;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tmhma", schema = "etaireia", catalog = "")
public class Tmhma {
    @Basic
    @Column(name = "T_ONOMA", nullable = true, length = -1)
    private String tOnoma;
    @Basic
    @Column(name = "KOD_TMHM", nullable = true)
    private Integer kodTmhm;
    @Basic
    @Column(name = "DIEYTHYNTIS", nullable = true)
    private Integer dieythyntis;
    @Basic
    @Column(name = "HMER_ENARXHS", nullable = true, length = -1)
    private String hmerEnarxhs;

    public String gettOnoma() {
        return tOnoma;
    }

    public void settOnoma(String tOnoma) {
        this.tOnoma = tOnoma;
    }

    public Integer getKodTmhm() {
        return kodTmhm;
    }

    public void setKodTmhm(Integer kodTmhm) {
        this.kodTmhm = kodTmhm;
    }

    public Integer getDieythyntis() {
        return dieythyntis;
    }

    public void setDieythyntis(Integer dieythyntis) {
        this.dieythyntis = dieythyntis;
    }

    public String getHmerEnarxhs() {
        return hmerEnarxhs;
    }

    public void setHmerEnarxhs(String hmerEnarxhs) {
        this.hmerEnarxhs = hmerEnarxhs;
    }
}

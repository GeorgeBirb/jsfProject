package org.models;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "topothtmhma", schema = "etaireia", catalog = "")
public class TopothTmhma {
    @Basic
    @Column(name = "KOD_TMHM", nullable = true)
    private Integer kodTmhm;
    @Basic
    @Column(name = "T_TOPOTHESIA", nullable = true, length = -1)
    private String tTopothesia;

    public Integer getKodTmhm() {
        return kodTmhm;
    }

    public void setKodTmhm(Integer kodTmhm) {
        this.kodTmhm = kodTmhm;
    }

    public String gettTopothesia() {
        return tTopothesia;
    }

    public void settTopothesia(String tTopothesia) {
        this.tTopothesia = tTopothesia;
    }
}

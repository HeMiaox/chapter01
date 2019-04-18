package com.hmm.po;


import lombok.Data;

import java.io.Serializable;

@Data
public class Specil implements Serializable {
    private int sid;
    private int did;
    private String scode;
    private String sname;
    private String saim;
    private String sprodire;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public String getScode() {
        return scode;
    }

    public void setScode(String scode) {
        this.scode = scode;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSaim() {
        return saim;
    }

    public void setSaim(String saim) {
        this.saim = saim;
    }

    public String getSprodire() {
        return sprodire;
    }

    public void setSprodire(String sprodire) {
        this.sprodire = sprodire;
    }

    @Override
    public String toString() {
        return "Specil{" +
                "sid=" + sid +
                ", did=" + did +
                ", scode='" + scode + '\'' +
                ", sname='" + sname + '\'' +
                ", saim='" + saim + '\'' +
                ", sprodire='" + sprodire + '\'' +
                '}';
    }
}

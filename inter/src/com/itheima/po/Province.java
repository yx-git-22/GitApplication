package com.itheima.po;

public class Province{
    private int id;
    private String provincename;
    private int provinceCode;




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvincename() {
        return provincename;
    }

    public void setProvincename(String provincename) {
        this.provincename = provincename;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    @Override
    public String toString() {
        return "Province{" +
                "id=" + id +
                ", provincename='" + provincename + '\'' +
                ", provinceCode=" + provinceCode +
                '}';
    }
}


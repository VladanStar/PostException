package com.company;

public class Posiljka {
    private String naziv;
    private double tezina;
    private String adresa;
    private String grad;
    private String postBroj;
    private int brojTelefona;

    public Posiljka(String herbalife, double v, String s, String kragujevac, String s1) {
    }

    public Posiljka(String naziv, double tezina, String adresa, String grad, String  postBroj, int brojTelefona) {
        this.naziv = naziv;
        this.tezina = tezina;
        this.adresa = adresa;
        this.grad = grad;
        this.postBroj = postBroj;
        this.brojTelefona = brojTelefona;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getTezina() {
        return tezina;
    }

    public void setTezina(double tezina) {
        this.tezina = tezina;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getGrad() {
        return grad;
    }

    public void setGrad(String grad) {
        this.grad = grad;
    }

    public String  getPostBroj() {
        return postBroj;
    }

    public void setPostBroj(String postBroj) {
        this.postBroj = postBroj;
    }

    public int getBrojTelefona() {
        return brojTelefona;
    }

    public void setBrojTelefona(int brojTelefona) {
        this.brojTelefona = brojTelefona;
    }

    @Override
    public String toString() {
        return "Posiljka{" +
                "naziv='" + naziv + '\'' +
                ", tezina=" + tezina +
                ", adresa='" + adresa + '\'' +
                ", grad='" + grad + '\'' +
                ", postBroj=" + postBroj +
                ", brojTelefona=" + brojTelefona +
                '}';
    }
}

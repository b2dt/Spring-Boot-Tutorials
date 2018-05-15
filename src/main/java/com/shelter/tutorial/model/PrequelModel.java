package com.shelter.tutorial.model;

public class PrequelModel {
    private String hello;
    private String general;
    private Palpatine palpatine;

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }

    public String getGeneral() {
        return general;
    }

    public void setGeneral(String general) {
        this.general = general;
    }

    public Palpatine getPalpatine() {
        return palpatine;
    }

    public void setPalpatine(Palpatine palpatine) {
        this.palpatine = palpatine;
    }

    @Override
    public String toString() {
        return "PrequelModel{" +
                "hello='" + hello + '\'' +
                ", general='" + general + '\'' +
                ", palpatine=" + palpatine +
                '}';
    }
}

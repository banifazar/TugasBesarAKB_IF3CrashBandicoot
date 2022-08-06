package com.example.tugasbesarakbif3crashbandicoot.BotNav;
/*
    TANGGAL PENGERJAAN: 3 Agustus 2022
    NIM, NAMA DAN KELAS: 1. 10119105 - RYNDRA PUTRA P.F. - IF3
*/
public class Liburan {

    private String nama;
    private String tempat;
    private String longitude;
    private String latitude;

    public Liburan() {
    }

    public Liburan(String nama, String tempat, String longitude, String latitude) {
        this.nama = nama;
        this.tempat = tempat;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTempat() {
        return tempat;
    }

    public void setTempat(String tempat) {
        this.tempat = tempat;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }
}

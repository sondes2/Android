package com.esprit.myapplication.entities;

import android.widget.EditText;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Salaire")
public class salaire {
    @PrimaryKey(autoGenerate = true)
    private int ids;
    @ColumnInfo
    private String salaire1;
    @ColumnInfo
    private String Autres;
    @ColumnInfo
    private String loisirs;
    @ColumnInfo
    private String Medicament;
    @ColumnInfo
    private String  Nourriture;

    public salaire() {
    }

    public salaire(String salaire1, String autres, String loisirs, String medicament, String nourriture) {
        this.salaire1 = salaire1;
        this.Autres = autres;
        this.loisirs = loisirs;
        this.Medicament = medicament;
        this.Nourriture = nourriture;
    }

    public int getIds() {
        return ids;
    }

    public void setIds(int ids) {
        this.ids = ids;
    }

    public String getSalaire1() {
        return salaire1;
    }

    public void setSalaire1(String salaire1) {
        this.salaire1 = salaire1;
    }

    public String getAutres() {
        return Autres;
    }

    public void setAutres(String autres) {
        Autres = autres;
    }

    public String getLoisirs() {
        return loisirs;
    }

    public void setLoisirs(String loisirs) {
        this.loisirs = loisirs;
    }

    public String getMedicament() {
        return Medicament;
    }

    public void setMedicament(String medicament) {
        Medicament = medicament;
    }

    public String getNourriture() {
        return Nourriture;
    }

    public void setNourriture(String nourriture) {
        Nourriture = nourriture;
    }

    @Override
    public String toString() {
        return "salaire{" +
                "ids=" + ids +
                ", salaire1='" + salaire1 + '\'' +
                ", Autres='" + Autres + '\'' +
                ", loisirs='" + loisirs + '\'' +
                ", Médicament='" + Medicament + '\'' +
                ", Nourriture='" + Nourriture + '\'' +
                '}';
    }
}

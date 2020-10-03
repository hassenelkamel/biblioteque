package com.company.entity;

import java.util.Vector;

public class Journal extends Document {
    Date dates;
    public Journal(){
    }

    public Journal(String titre, Date dates) {
        super(titre);
        this.dates = dates;
    }
}

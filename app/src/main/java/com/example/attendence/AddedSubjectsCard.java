package com.example.attendence;

import android.icu.text.DateFormat;
import android.icu.text.SimpleDateFormat;

import java.util.Calendar;
import java.util.Date;

public class AddedSubjectsCard {
    private String name;

    public AddedSubjectsCard(String name)
    {
        this.name=name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

}
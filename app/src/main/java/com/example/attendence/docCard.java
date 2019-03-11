package com.example.attendence;

import android.icu.text.DateFormat;
import android.icu.text.SimpleDateFormat;

import java.util.Calendar;
import java.util.Date;

public class docCard {
    private String name;
    private String attend;

    public docCard(String name,String attend)
    {
        this.name=name;
        this.attend=attend;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public String getAttend()
    {
        return attend;
    }

    public void setAttend(String attend)
    {
        this.attend= attend;
    }

}

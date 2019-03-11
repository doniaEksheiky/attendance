package com.example.attendence;

import android.icu.text.DateFormat;
import android.icu.text.SimpleDateFormat;

import java.util.Calendar;
import java.util.Date;

public class stuCard {
    private String lec_no;
    private String imgUrl;
    private Date date= Calendar.getInstance().getTime();
    DateFormat dateFormat = new SimpleDateFormat("mm-dd-yyyy");
    private String strDate = dateFormat.format(date);

    public stuCard(String lec_no, String strDate, String imgUrl)
    {
        this.lec_no=lec_no;
        this.strDate=strDate;
        this.imgUrl=imgUrl;
    }
    public String getimgUrl()
    {
        return imgUrl;
    }

    public void setimgUrl(String imgUrl)
    {
        this.imgUrl = imgUrl;
    }

    public String getlec_no()
    {
        return lec_no;
    }

    public void setlec_no(String lec_no)
    {
        this.lec_no = lec_no;
    }
    public String getStrDate()
    {
        return strDate;
    }

    public void setstrDate(String strDate)
    {
        this.strDate = strDate;
    }

}

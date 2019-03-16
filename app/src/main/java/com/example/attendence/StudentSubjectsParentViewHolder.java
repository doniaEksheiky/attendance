package com.example.attendence;

import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bignerdranch.expandablerecyclerview.ViewHolder.ParentViewHolder;

public class StudentSubjectsParentViewHolder extends ParentViewHolder {
    public TextView stuSubName;
    public TextView stuSubCode;
    public ImageView stuSubImg;
    public StudentSubjectsParentViewHolder(View itemView) {
        super(itemView);
        stuSubName=(TextView)itemView.findViewById(R.id.stu_sub_name);
        stuSubCode=(TextView)itemView.findViewById(R.id.stu_sub_code);
        stuSubImg=(ImageView)itemView.findViewById(R.id.stu_sub_img);

    }

}

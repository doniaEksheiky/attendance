package com.example.attendence;

import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bignerdranch.expandablerecyclerview.ViewHolder.ParentViewHolder;

public class DoctorSubjectsParentViewHolder extends ParentViewHolder {
    public TextView subName;
    public TextView subCode;
    public ImageView subImg;
    public DoctorSubjectsParentViewHolder(View itemView) {
        super(itemView);
        subName=(TextView)itemView.findViewById(R.id.sub_name);
        subCode=(TextView)itemView.findViewById(R.id.sub_code);
        subImg=(ImageView)itemView.findViewById(R.id.sub_img);

    }

}

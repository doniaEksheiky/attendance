package com.example.attendence;

import android.view.View;
import android.widget.TextView;

import com.bignerdranch.expandablerecyclerview.ViewHolder.ChildViewHolder;

public class StudentSubjectsChildViewHolder extends ChildViewHolder {
    public TextView scan;
    public TextView report;

    public StudentSubjectsChildViewHolder(View itemView) {
        super(itemView);
        scan=(TextView)itemView.findViewById(R.id.scan);
        report=(TextView)itemView.findViewById(R.id.stu_report);

    }

}

package com.example.attendence;

import android.view.View;
import android.widget.TextView;

import com.bignerdranch.expandablerecyclerview.ViewHolder.ChildViewHolder;

public class DoctorSubjectsChildViewHolder extends ChildViewHolder {
    public TextView students;
    public TextView generate;
    public TextView report;

    public DoctorSubjectsChildViewHolder(View itemView) {
        super(itemView);
        students=(TextView)itemView.findViewById(R.id.students);
        generate=(TextView)itemView.findViewById(R.id.generate);
        report=(TextView)itemView.findViewById(R.id.doc_report);

    }

}

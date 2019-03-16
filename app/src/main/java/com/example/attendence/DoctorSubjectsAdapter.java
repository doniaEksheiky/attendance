package com.example.attendence;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


import com.bignerdranch.expandablerecyclerview.Adapter.ExpandableRecyclerAdapter;
import com.bignerdranch.expandablerecyclerview.Model.ParentObject;
import com.bignerdranch.expandablerecyclerview.ViewHolder.ParentViewHolder;

import java.util.List;

public class DoctorSubjectsAdapter extends ExpandableRecyclerAdapter<DoctorSubjectsParentViewHolder,DoctorSubjectsChildViewHolder> {
LayoutInflater inflater;

    public DoctorSubjectsAdapter(Context context, List<ParentObject> parentItemList) {
        super(context, parentItemList);
        inflater=LayoutInflater.from(context);
    }

    @Override
    public DoctorSubjectsParentViewHolder onCreateParentViewHolder(ViewGroup viewGroup) {
        View view=inflater.inflate(R.layout.doctor_subjects_parent,viewGroup,false);
        return new DoctorSubjectsParentViewHolder(view);
    }

    @Override
    public DoctorSubjectsChildViewHolder onCreateChildViewHolder(ViewGroup viewGroup) {
        View view=inflater.inflate(R.layout.doctor_subjects_child,viewGroup,false);
        return new DoctorSubjectsChildViewHolder(view);    }

    @Override
    public void onBindParentViewHolder(DoctorSubjectsParentViewHolder doctorSubjectsParentViewHolder, int i, Object o) {
        DoctorSubjectsParent doctorSubjectsParent=(DoctorSubjectsParent)o;
        doctorSubjectsParentViewHolder.subName.setText(doctorSubjectsParent.getSubName());
        doctorSubjectsParentViewHolder.subCode.setText(doctorSubjectsParent.getSubCode());
        doctorSubjectsParentViewHolder.subImg.setImageResource(doctorSubjectsParent.getSubImg());




    }

    @Override
    public void onBindChildViewHolder(DoctorSubjectsChildViewHolder doctorSubjectsChildViewHolder, int i, Object o) {
        DoctorSubjectsChild doctorSubjectsChild=(DoctorSubjectsChild) o;
        doctorSubjectsChildViewHolder.students.setText(doctorSubjectsChild.getStudents());
        doctorSubjectsChildViewHolder.generate.setText(doctorSubjectsChild.getGenerate());
        doctorSubjectsChildViewHolder.report.setText(doctorSubjectsChild.getReport());




    }
}

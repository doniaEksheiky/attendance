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

public class StudentSubjectsAdapter extends ExpandableRecyclerAdapter<StudentSubjectsParentViewHolder,StudentSubjectsChildViewHolder> {
    LayoutInflater inflater;

    public StudentSubjectsAdapter(Context context, List<ParentObject> parentItemList) {
        super(context, parentItemList);
        inflater=LayoutInflater.from(context);
    }

    @Override
    public StudentSubjectsParentViewHolder onCreateParentViewHolder(ViewGroup viewGroup) {
        View view=inflater.inflate(R.layout.student_subjects_parent,viewGroup,false);
        return new StudentSubjectsParentViewHolder(view);
    }

    @Override
    public StudentSubjectsChildViewHolder onCreateChildViewHolder(ViewGroup viewGroup) {
        View view=inflater.inflate(R.layout.student_subjects_child,viewGroup,false);
        return new StudentSubjectsChildViewHolder(view);    }

    @Override
    public void onBindParentViewHolder(StudentSubjectsParentViewHolder studentSubjectsParentViewHolder, int i, Object o) {
        StudentSubjectsParent doctorSubjectsParent=(StudentSubjectsParent)o;
        studentSubjectsParentViewHolder.stuSubName.setText(doctorSubjectsParent.getStuSubName());
        studentSubjectsParentViewHolder.stuSubCode.setText(doctorSubjectsParent.getStuSubCode());
        studentSubjectsParentViewHolder.stuSubImg.setImageResource(doctorSubjectsParent.getStuSubImg());




    }

    @Override
    public void onBindChildViewHolder(StudentSubjectsChildViewHolder studentSubjectsChildViewHolder, int i, Object o) {
        StudentSubjectsChild doctorSubjectsChild=(StudentSubjectsChild) o;
        studentSubjectsChildViewHolder.scan.setText(doctorSubjectsChild.getScan());
        studentSubjectsChildViewHolder.report.setText(doctorSubjectsChild.getReport());




    }
}

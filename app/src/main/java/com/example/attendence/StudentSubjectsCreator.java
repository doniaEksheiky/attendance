package com.example.attendence;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class StudentSubjectsCreator {
    static StudentSubjectsCreator _studentSubjectsCreator;
    List <StudentSubjectsParent> _studentSubjectsParents;

    public StudentSubjectsCreator(Context context) {
        _studentSubjectsParents=new ArrayList<>();
        _studentSubjectsParents.add(new StudentSubjectsParent("automata","MT-505", R.drawable.logo));
        _studentSubjectsParents.add(new StudentSubjectsParent("Database","MT-500", R.drawable.automata));
        _studentSubjectsParents.add(new StudentSubjectsParent("networks","MT-405", R.drawable.ai));

    }

    public static StudentSubjectsCreator get(Context context)
    {
        if(_studentSubjectsCreator==null)
            _studentSubjectsCreator = new StudentSubjectsCreator(context);
        return _studentSubjectsCreator;
    }

    public List<StudentSubjectsParent> getAll() {
        return _studentSubjectsParents;
    }
}

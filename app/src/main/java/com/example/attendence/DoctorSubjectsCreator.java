package com.example.attendence;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class DoctorSubjectsCreator {
    static DoctorSubjectsCreator _doctorSubjectsCreator;
    List <DoctorSubjectsParent> _doctorSubjectsParents;

    public DoctorSubjectsCreator(Context context) {
        _doctorSubjectsParents=new ArrayList<>();
        _doctorSubjectsParents.add(new DoctorSubjectsParent("automata","MT-505", R.drawable.logo));
        _doctorSubjectsParents.add(new DoctorSubjectsParent("Database","MT-500", R.drawable.automata));
        _doctorSubjectsParents.add(new DoctorSubjectsParent("networks","MT-405", R.drawable.ai));

    }

    public static DoctorSubjectsCreator get(Context context)
    {
        if(_doctorSubjectsCreator==null)
            _doctorSubjectsCreator = new DoctorSubjectsCreator(context);
        return _doctorSubjectsCreator;
    }

    public List<DoctorSubjectsParent> getAll() {
        return _doctorSubjectsParents;
    }
}

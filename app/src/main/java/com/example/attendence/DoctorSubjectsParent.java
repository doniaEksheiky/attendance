package com.example.attendence;

import com.bignerdranch.expandablerecyclerview.Model.ParentObject;

import java.util.List;
import java.util.UUID;

public class DoctorSubjectsParent implements ParentObject {
    private List<Object> mChildList;
    private UUID _id;
    private String subName;
    private String subCode;
    private int subImg;

    public DoctorSubjectsParent(String subName, String subCode, int subImg) {
        this.subName = subName;
        this.subCode = subCode;
        this.subImg = subImg;
        _id=UUID.randomUUID();
    }

    public UUID get_id() {
        return _id;
    }

    public void set_id(UUID _id) {
        this._id = _id;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public String getSubCode() {
        return subCode;
    }

    public void setSubCode(String subCode) {
        this.subCode = subCode;
    }

    public int getSubImg() {
        return subImg;
    }

    public void setSubImg(int subImg) {
        this.subImg = subImg;
    }

    @Override
    public List<Object> getChildObjectList() {
        return mChildList;
    }

    @Override
    public void setChildObjectList(List<Object> list) {
        mChildList =list;

    }
}

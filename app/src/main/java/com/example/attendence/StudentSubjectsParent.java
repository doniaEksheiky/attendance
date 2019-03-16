package com.example.attendence;

import com.bignerdranch.expandablerecyclerview.Model.ParentObject;

import java.util.List;
import java.util.UUID;

public class StudentSubjectsParent implements ParentObject {
    private List<Object> mChildList;
    private UUID _id;
    private String stuSubName;
    private String stuSubCode;
    private int stuSubImg;

    public StudentSubjectsParent(String stuSubName, String stuSubCode, int stuSubImg) {
        this.stuSubName = stuSubName;
        this.stuSubCode = stuSubCode;
        this.stuSubImg = stuSubImg;
        _id=UUID.randomUUID();
    }

    public UUID get_id() {
        return _id;
    }

    public void set_id(UUID _id) {
        this._id = _id;
    }

    public String getStuSubName() {
        return stuSubName;
    }

    public void setStuSubName(String StuSubName) {
        this.stuSubName = stuSubName;
    }

    public String getStuSubCode() {
        return stuSubCode;
    }

    public void setStuSubCode(String stuSubCode) {
        this.stuSubCode = stuSubCode;
    }

    public int getStuSubImg() {
        return stuSubImg;
    }

    public void setStuSubImg(int subImg) {
        this.stuSubImg = stuSubImg;
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

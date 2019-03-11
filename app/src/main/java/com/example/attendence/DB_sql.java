package com.example.attendence;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.strictmode.SqliteObjectLeakedViolation;

public class DB_sql extends SQLiteOpenHelper {
    public static final String DBname="data.db";
    public DB_sql(Context context) {
        super(context, DBname, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table users (code INTEGER PRIMARY KEY, name TEXT, email TEXT, phone INTEGER, password TEXT, type TEXT )");
        db.execSQL("create table subjects (code TEXT PRIMARY KEY, level INTEGER, term TEXT )");
        db.execSQL("create table doc_sub (code INTEGER PRIMARY KEY, sub_1 TEXT, sub_2 TEXT, sub_3 TEXT, sub_4 TEXT, sub_5 TEXT, sub_6 TEXT, sub_7 TEXT, sub_8 )");
        db.execSQL("create table stu_sub (code INTEGER PRIMARY KEY, sub_1 TEXT, sub_2 TEXT, sub_3 TEXT, sub_4 TEXT, sub_5 TEXT, sub_6 TEXT, sub_7 TEXT, sub_8 )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS users");
        db.execSQL("DROP TABLE IF EXISTS subjects");
        db.execSQL("DROP TABLE IF EXISTS doc_sub");
        db.execSQL("DROP TABLE IF EXISTS stu_sub");
        onCreate(db);

    }
}

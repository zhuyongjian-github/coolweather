package com.coolweather.app.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Administrator on 2017/4/13.
 */
public class CoolweatherOpenHelper extends SQLiteOpenHelper {

    /**
     * Province Table Select
     */
    public static final String CREATE_PROVINCE = "create table Province("
            + "id integer primary key autoincrement, "
            + "province_name text,"
            + "province_code text,)";

    /**
     * City Table Select
     */
    public static final String CREATE_CITY = "create table City("
            + "id integer primary key autoincrement,"
            + "city_name text,"
            + "city_code text,"
            + "province_id integer)";

    public static final String CREATE_COUNTY = "create table Country("
            + "id integer primary key autoincrement,"
            + "country_name text,"
            + "country_code text,"
            + "city_id integer)";

    public CoolweatherOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        /**
         * create table
         */
        db.execSQL(CREATE_PROVINCE);
        db.execSQL(CREATE_CITY);
        db.execSQL(CREATE_COUNTY);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i2) {

    }
}

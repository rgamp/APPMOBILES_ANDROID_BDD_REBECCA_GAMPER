package com.example.becca.appmob_gamper_bdd;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase.CursorFactory;

/**
 * Created by BECCA on 15/03/2017.
 */

public class MyDBsqLite extends SQLiteOpenHelper {
    private static final String TABLE_CHAPITRE = "table_chapitre";
    private static final String COL_ID = "ID";
    private static final String COL_NAME = "Nom";
    private static final String COL_DESC = "Description";

    private static final String CREATE_BDD = "CREATE TABLE " + TABLE_CHAPITRE + " ("
            + COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + COL_NAME + " TEXT NOT NULL, "
            + COL_DESC + " TEXT NOT NULL);";

    public MyDBsqLite(Context context, String nom, CursorFactory factory, int version){
        super(context, nom,factory,version);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL(CREATE_BDD);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL("DROP TABLE " + TABLE_CHAPITRE + ";");
        onCreate(db);
    }



}

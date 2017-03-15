package com.example.becca.appmob_gamper_bdd;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by BECCA on 15/03/2017.
 */

public class ChapitreBDD {
    private static final int VERSION_BDD = 1;
    private static final String NOM_BDD = "chapitre.db";

    private static final String TABLE_CHAPITRE = "table_chapitre";
    private static final String COL_ID = "ID";
    private static final int NUM_COL_ID = 0;
    private static final String COL_NAME = "Nom";
    private static final int NUM_COL_NAME = 1;
    private static final String COL_DESC = "Description";
    private static final int NUM_COL_DESC = 2;

    private SQLiteDatabase bdd;

    private MyDBsqLite myDBsqLite;

    public  ChapitreBDD(Context context){
        myDBsqLite = new MyDBsqLite(context, NOM_BDD, null, VERSION_BDD);
    }

    public  void open(){
        bdd = myDBsqLite.getWritableDatabase();
    }

    public void  close(){
        bdd.close();
    }

    public SQLiteDatabase getBdd(){
        return bdd;
    }

    public long insertChapitre(Chapitre chapitre){
        ContentValues values = new ContentValues();
        values.put(COL_NAME,chapitre.getName());
        values.put(COL_DESC,chapitre.getDescription());
        return  bdd.insert(TABLE_CHAPITRE,null,values);
    }
}

package com.example.mie;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

class MyDatabase extends SQLiteOpenHelper {

    private static final String COLUMN_ID5 = "id_niveau";
    private static final String COLUMN_ID6 = "id_niveau";
    private static final String COLUMN_ID7 = "id_matiere";
    private Context context;
    private static final String DATABASE_NAME = "MIE_db";
    private static final int DATABASE_VERSION = 1;

    // determination variables premiere table
    private static final String TABLE_NAME = "niveau";
    private static final String COLUMN_ID = "id_niveau";
    private static final String COLUMN_NAME = "nom_niveau";

    // determination variables deuxieme table
    private static final String TABLE_NAME2 = "matiere";
    private static final String COLUMN_ID2 = "id_matiere";
    private static final String COLUMN_NAME2 = "nom_matiere";

    // determination variabes troisieme table
    private static final String TABLE_NAME3 = "utilisateur";
    private static final String COLUMN_ID3 = "id_utilisateur";
    private static final String COLUMN_MDP = "mdp";
    private static final String COLUMN_NAME3 = "nom";
    private static final String COLUMN_FIRSTNAME = "prenom";
    private static final String COLUMN_TEL = "tel";
    private static final String COLUMN_MAIL = "mail";

    // determination variables quatrieme table
    private static final String TABLE_NAME4 = "exercice";
    private static final String COLUMN_ID4 = "id_exercice";
    private static final String COLUMN_NAME4 = "nom_exercice";



    public MyDatabase(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE " + TABLE_NAME +
                        " (" + COLUMN_ID + "INTEGER PRIMARY KEY AUTOINCREMENT, " +
                        COLUMN_NAME + " TEXT )";
        db.execSQL(query);


        query = "CREATE TABLE " + TABLE_NAME2 +
                " (" + COLUMN_ID2 + "INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_NAME2 + " TEXT " +
                ", FOREIGN KEY (" + COLUMN_ID5 +") REFERENCES " + TABLE_NAME +"(" + COLUMN_ID + ") );";
        db.execSQL(query);


        query = "CREATE TABLE " + TABLE_NAME3 +
                " (" + COLUMN_ID3 + "INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_MDP + "TEXT" +
                COLUMN_NAME3 + " TEXT " +
                COLUMN_FIRSTNAME + "TEXT " +
                COLUMN_TEL + "INTEGER " +
                COLUMN_MAIL + "TEXT ";
        db.execSQL(query);


        query = "CREATE TABLE " + TABLE_NAME4 +
                " (" + COLUMN_ID4 + "INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_NAME4 + " TEXT " +
                ", FOREIGN KEY (" + COLUMN_ID6 +") REFERENCES " + TABLE_NAME +"(" + COLUMN_ID +
                ", FOREIGN KEY (" + COLUMN_ID7 +") REFERENCES " + TABLE_NAME2 +"(" + COLUMN_ID2 +")";
        db.execSQL(query);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);

        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME2);
        onCreate(db);

        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME3);
        onCreate(db);

        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME4);
        onCreate(db);

    }
}

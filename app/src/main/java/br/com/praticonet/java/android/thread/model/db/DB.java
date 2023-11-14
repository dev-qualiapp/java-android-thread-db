package br.com.praticonet.java.android.thread.model.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DB extends SQLiteOpenHelper {
    private static final String DATABASE = "banco.db";
    private static final int VERSION = 1;
    private static DB base;

    public DB(@Nullable Context context) {
        super(context, DATABASE, null, VERSION);
    }

    public static DB getInstance(Context context) {
        if (base == null){
            base = new DB(context);
        }
        return base;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE PRODUTO(" +
                "ID                         INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT," +
                "NOME                       VARCHAR(150) NOT NULL," +
                "PRECO                      NUMERIC(15,2)," +
                "DATA_HORA_CADASTRO         TEXT," +
                "DATA_HORA_ULTIMA_ALTERACAO TEXT" +
                ")");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}

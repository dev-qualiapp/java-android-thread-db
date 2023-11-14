package br.com.praticonet.java.android.thread.model.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import br.com.praticonet.java.android.thread.model.db.DB;
import br.com.praticonet.java.android.thread.model.dto.Produto;

public class ProdutoDAO {
    private DB data;
    public ProdutoDAO(Context context){
        data = DB.getInstance(context);
    }
    public Long insert(Produto produto){
        SQLiteDatabase db = data.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("NOME",produto.getNome());
        values.put("DATA_HORA_CADASTRO", produto.getDataHoraCadastro().toString());
        return db.insert("PRODUTO",null, values);
    }

}

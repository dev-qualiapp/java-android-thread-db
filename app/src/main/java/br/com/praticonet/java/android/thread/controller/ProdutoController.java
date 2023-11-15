package br.com.praticonet.java.android.thread.controller;

import android.content.Context;

import br.com.praticonet.java.android.thread.model.dao.ProdutoDAO;
import br.com.praticonet.java.android.thread.model.db.DB;
import br.com.praticonet.java.android.thread.model.dto.Produto;

public class ProdutoController {
    private ProdutoDAO dao;

    public ProdutoController(Context context){
        dao = new ProdutoDAO(context);
    }

    public Long insert(Produto produto){
        return dao.insert(produto);
    }

}

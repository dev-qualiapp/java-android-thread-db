package br.com.praticonet.java.android.thread;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Date;

import br.com.praticonet.java.android.thread.controller.ProdutoController;
import br.com.praticonet.java.android.thread.model.dto.Produto;

public class MainActivity extends AppCompatActivity {
    private EditText nome;
    private Button salvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        salvar = findViewById(R.id.btn_salvar);
        nome = findViewById(R.id.edt_nome);

        salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                salvar();
            }
        });

    }

    private void salvar() {
        ProdutoController produtoController = new ProdutoController(this.getBaseContext());
        Produto produto = new Produto();
        produto.setDataHoraCadastro(new Date());
        produto.setNome(nome.getText().toString());
        Long id = produtoController.insert(produto);
        String retorno =  id > 0 ? "Salvo com sucesso "+id : "Produto não foi salvo.";
        Toast.makeText(getBaseContext(), retorno, Toast.LENGTH_LONG).show();
        nome.setText("");
    }
}
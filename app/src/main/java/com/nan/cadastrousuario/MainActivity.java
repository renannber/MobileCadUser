package com.nan.cadastrousuario;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //Declaração dos componetens visuais e do adaptadpr da lista

    RecyclerView recyclerView;
    UserAdapter adapter;
    Button bntCadastrar;

    //Atenção:Atributo estático(static) permite que oa daos persisram na memória, enquanto o app estiver abernto e seja acessado diretamente por outras telas (Activities)

    public static List<String> listaNomes = new ArrayList<>();
 //Método de inicialização da Activity ( Ponto de entrada da tela )

 @Override
 protected void onCreate( Bundle savedInstanceState) {
     super.onCreate(savedInstanceState);
     //Vincula  o arquivo de layout XML (activity_main.xml) a essa classe java
     setContentView(R.layout.activity_main);

     //Regra de negócio: insere um texto no topo da lista, casos ela esteja vazia
     if (listaNomes.isEmpty()) {
         listaNomes.add("Nome de cadastro");

     }

     //mapeamento dos componentes do RecyclerView do XML para o objeto java
     recyclerView = findViewById(R.id.recycler_view);

     //Define o layout: organiza itens da lista em uma coluna vertical simples
     recyclerView.setLayoutManager(new LinearLayoutManager(this));

     //Instancia o Adaptador passando a nossa lista de nomes
     adapter = new UserAdapter(listaNomes);

     //Conecta o adaptador ao RecyclerView e adaptador para que os dados sejam desenhados na tela
     recyclerView.setAdapter(adapter);

     //Mapear o botão de cadastro
     bntCadastrar = findViewById(R.id.btnCadastrar);

     //Configurar o evento de clique usando a expressão lembda (java8+)
     bntCadastrar.setOnClickListener(v -> {
         startActivity(new Intent(MainActivity.this, CreateUser.class));
     });
 }
     //Método chamado sempre que a tela volta a ficar visivel para o usuário
     @Override
             protected void onResume(){
         super.onResume();
     //Avisa o adaptador que a fonte de dados (listaNome) pode ter sido alterada na outra tela, forçando a atualização visual da lista
     adapter.notifyDataSetChanged();// noticia se houver alteração nos dados
     }
 }

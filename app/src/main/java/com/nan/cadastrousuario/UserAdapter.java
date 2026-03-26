package com.nan.cadastrousuario;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.jetbrains.annotations.NotNull;

import java.util.Formatter;
import java.util.List;

// Class adapter: gerencia a criação e o preenchimento dos itens da RecyleView
public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {

    //Atributo preivado que armazena a refenrencia dos dados que serão exibidos
    private List<String> listaUsuario;

    //Construtor que permite que a MainActivity  "entregue " a lista de dados para este Adapter
    public UserAdapter(List<String> lista){
        this.listaUsuario = lista;
    }
    //Método 1: cria do 0 o visual de uma linha da lista (+ViewHolder)

    @NotNull
    @Override


    public ViewHolder onCreatViewHolder (@NotNull ViewGroup parent, int viewType){
        //LayoutInflater transforma o arquivo XML em um objeto VIEW JAVA

        //Aqui usamos um layout padrão do android (simple_list_item_1) para facilitar
         View view = LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_1,parent,false);

    )

    }


}

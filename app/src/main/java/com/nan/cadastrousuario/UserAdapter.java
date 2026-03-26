package com.nan.cadastrousuario;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

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

         //Retorna uma nova intancia da classe interna View criada
        return new ViewHolder(View);

    }

    //Método para vincular os dados de um objeto de lista a uma linha espercifica da tela

    @Override
    public void onBindViewHolder (@NotNull RecyclerView.ViewHolder holder, int position){
        //Recupera os dados da lista de acordo com a posição que o android está desenhando agora

        String nome = listaUsuario.get(position); // pega a posição

        //defini o texto no componente visual que está guardado dentro de 'holder'
        holder.tvNome.setText(nome);

    }

    //Método 3: informa ao android quantos itens a lista possui ao tod
    @Override
    public  int getItemCount(){
        //Se a lista existir, retorna o tamanho. Se não, retorna zero

        //Operador ternario: if, else em uma unica linha

        return listaUsuario != null ? listaUsuario.size():0;

    }

    //Classe interna ViewHolder: Servir  para "sequer" as referencias dos componentes de cada linha. Evitando chamadas respectivas ao finfViewById, melhorando a performance do RecyclerView

    public class ViewHolder extends RecyclerView.ViewHolder{
        //Referencia para o TextView da linha
        TextView tvNome;
         public ViewHolder(@NotNull View itemView){
             super(itemView);

             //Faz o mapeamento do ID do layout para objeto java
             //Android.R.id.text é ID padrão do layout "simple_list_item_1"

             tvNome = itemView.findViewById(android.R.id.text1);

         }
    }

}

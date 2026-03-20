package com.nan.cadastrousuario;
//Bloco de importações
 import android.os.Bundle;
 import android.widget.Button;

 import androidx.appcompat.app.AppCompatActivity;
 import com.google.android.material.textfield.TextInputEditText;

//Classe principal
public class CreateUser extends AppCompatActivity {
    TextInputEditText editNome, editEmail;

    Button btnSalvar;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_user);
         // vinculo variavel com o elemento da interface grafica, escrito no arquivo xml
        editNome = findViewById(R.id.nome);
        editEmail = findViewById(R.id.email);
        btnSalvar = findViewById(R.id.btnSalvar);

       //função de click
        btnSalvar.setOnClickListener(v -> {

        //pega o que for digitado no input nome e email e converte para String
        String nome = editNome.getText().toString();
        String email = editEmail.getText().toString();

        if(!nome.isEmpty()){
            MainActivity.listNomes.add(nome + " (" + email + ") ");
            finish();

        }
    });
    }

}
package com.teste.cardview.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.teste.cardview.Adapters.AdaptadorCard;
import com.teste.cardview.Model.PostagemC;
import com.teste.cardview.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerV;
    private List<PostagemC> postagens = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gerarPostagem();


        recyclerV = findViewById(R.id.recycleV);


        //layout.

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager( this);
        recyclerV.setLayoutManager(layoutManager);

        //adapter
        recyclerV.setAdapter(adaptadorPost);
    }
    AdaptadorCard adaptadorPost = new AdaptadorCard(postagens);

    public void gerarPostagem ( ){
        PostagemC post = new PostagemC( "Matheus", "Dia Lindo ", R.drawable.img);
        this.postagens.add(post);

    }
}
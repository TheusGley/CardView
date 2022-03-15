package com.teste.cardview.Adapters;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.teste.cardview.Model.PostagemC;
import com.teste.cardview.R;

import java.util.List;

public class AdaptadorCard extends  RecyclerView.Adapter<AdaptadorCard.ViewerHolder> {
    private List<PostagemC> postagens;
    public AdaptadorCard(List<PostagemC> lista){
        postagens = lista;
    }

    @NonNull
    @Override
    public ViewerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {



    View itemLista = LayoutInflater.from(parent.getContext()).inflate(
            R.layout.layout1, parent, false);

    return new ViewerHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewerHolder holder, int position) {
        PostagemC post = postagens.get(position);
        holder.nome.setText(post.getNome());
        holder.imagem.setImageResource(post.getImagem());
        holder.postagem.setText(post.getLegenda());

    }

    @Override
    public int getItemCount() {
        return postagens.size();
    }

    public class ViewerHolder extends RecyclerView.ViewHolder{

        private TextView nome;
        private TextView postagem;
        private ImageView imagem;

        public ViewerHolder(@NonNull View itemView) {
            super(itemView);

            nome    = itemView.findViewById(R.id.TextNome);
            imagem  = itemView.findViewById(R.id.imagemPos);
            postagem= itemView.findViewById(R.id.TextPosta);
        }




    }

}


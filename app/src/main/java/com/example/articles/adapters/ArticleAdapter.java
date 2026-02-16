package com.example.articles.adapters;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.articles.ui.DetailActivity;
import com.example.articles.models.Article;
import com.example.articles.R;

import java.util.List;

public class ArticleAdapter extends RecyclerView.Adapter<ArticleAdapter.ArticleViewHolder> {
    private List<Article> articles;

    public ArticleAdapter(List<Article> articles) {
        this.articles = articles;
    }

    @Override
    public ArticleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_article, parent, false);
        return new ArticleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ArticleViewHolder holder, int position) {
        Article current = articles.get(position);
        holder.title.setText(current.getTitle());
        holder.body.setText(current.getBody());

        // Chargement de l'image placeholder via Glide
        Glide.with(holder.itemView.getContext())
                .load(current.getImageUrl())
                .into(holder.image);


        holder.itemView.setOnClickListener(v -> {

            Intent intent = new Intent(v.getContext(), DetailActivity.class);

            intent.putExtra("title", current.getTitle());
            intent.putExtra("body", current.getBody());
            intent.putExtra("image", current.getImageUrl());

            v.getContext().startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return articles.size();
    }

    public static class ArticleViewHolder extends RecyclerView.ViewHolder {
        TextView title, body;
        ImageView image;

        public ArticleViewHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.txtTitle);
            body = itemView.findViewById(R.id.txtBody);
            image = itemView.findViewById(R.id.imgArticle);
        }
    }


}
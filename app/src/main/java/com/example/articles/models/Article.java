package com.example.articles.models;
public class Article {
    private int id;
    private String title;
    private String body; // Correspond au contenu de l'article

    public Article(int id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    // Pour l'image, nous utiliserons une URL générique basée sur l'ID
    public String getImageUrl() {
        return "https://picsum.photos/seed/" + id + "/200/200";
    }
}
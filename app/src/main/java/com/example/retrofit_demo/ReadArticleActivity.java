package com.example.retrofit_demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.retrofit_demo.model.response.ArticleResponse;
import com.squareup.picasso.Picasso;

public class ReadArticleActivity extends AppCompatActivity {
    ImageView image;
    TextView title,author,date,desc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_article);

        image = findViewById(R.id.image);
        title = findViewById(R.id.amsTitle);
        author = findViewById(R.id.author);
        date = findViewById(R.id.amsDate);
        desc = findViewById(R.id.desc);

        // get data from intent

        Intent intent = getIntent();
        if(intent!=null){

            ArticleResponse.DataEntity article = intent.getParcelableExtra("data");
            if(article!=null){

                title.setText(article.getTitle()==null?"":article.getTitle());
                date.setText(article.getCreatedDate()==null?"":article.getCreatedDate());
                author.setText(article.getAuthor()==null?"":article.getAuthor().getName());
                desc.setText(article.getDescription()==null?"":article.getDescription());

                //image

                if(article.getImage()==null)
                    image.setImageResource(R.drawable.image);
                else
                    Picasso.get().load(article.getImage())
                    .into(image);

            }
        }

    }
}

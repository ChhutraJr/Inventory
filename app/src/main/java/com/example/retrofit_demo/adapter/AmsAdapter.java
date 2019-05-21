package com.example.retrofit_demo.adapter;

import  com.example.retrofit_demo.R;
import com.example.retrofit_demo.model.response.ArticleResponse;
import com.squareup.picasso.Picasso;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;

import java.util.List;

public class AmsAdapter  extends  RecyclerView.Adapter<AmsAdapter.ViewHolder>{

    List<ArticleResponse.DataEntity> articles;
    Context  mContext;

    public AmsAdapter(List<ArticleResponse.DataEntity> articles, Context mContext) {
        this.articles = articles;
        this.mContext = mContext;
        this.callback = (OnItemClickedCallback)mContext;
    }

    public void removeArticle(ArticleResponse.DataEntity article, int position) {
        this.articles.remove(article);
        notifyItemRemoved(position);
    }

    public void setArticle(ArticleResponse.DataEntity article) {
        this.articles.add(0,article);
        notifyItemInserted(0);
    }


    public void setArticles(List<ArticleResponse.DataEntity> articles) {
        this.articles.addAll(articles);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(mContext).
                inflate(R.layout.article_item_layout,viewGroup,false);
        return  new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        ArticleResponse.DataEntity article = articles.get(i);
        viewHolder.title.setText(article.getTitle());
        viewHolder.date.setText(article.getCreatedDate());
        viewHolder.author.setText(article.getAuthor().getName());

        //image
        if(article.getImage()==null)

         viewHolder.thumb.setImageResource(R.drawable.image);
        else
            Picasso.get().load(article.getImage())
            .into(viewHolder.thumb);
    }

    @Override
    public int getItemCount() {
        return articles.size();
    }

    class  ViewHolder extends RecyclerView.ViewHolder{

        private ImageView thumb,btnMenu;
        private TextView title,date,author;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            thumb =itemView.findViewById(R.id.thumb);
            title = itemView.findViewById(R.id.title);
            date = itemView.findViewById(R.id.date);
            author = itemView.findViewById(R.id.author);
            btnMenu = itemView.findViewById(R.id.btnMenu);

            // set event to each item
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    callback.OnItemClicked(articles.get(getAdapterPosition()));
                }
            });

        }

        void btnMenuClicked(final ArticleResponse.DataEntity article){

            btnMenu.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    PopupMenu menu = new PopupMenu(mContext,btnMenu);
                    menu.inflate(R.menu.popup_menu);
                    menu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                        @Override
                        public boolean onMenuItemClick(MenuItem item) {

                            switch (item.getItemId()){
                                case  R.id.edit:
                                    callback.onItemSend(article,getAdapterPosition());
                                    return true;
                                case R.id.remove:
                                    callback.onRemoveArticle(article,getAdapterPosition());
                                return  true;

                                default: return  false;
                            }
                        }
                    });

                    menu.show();
                }
            });
        }
    }

    OnItemClickedCallback callback;

    public  interface  OnItemClickedCallback{

        void onItemSend(ArticleResponse.DataEntity article ,int position);
        void onRemoveArticle(ArticleResponse.DataEntity article,int position);
        void OnItemClicked(ArticleResponse.DataEntity article);
    }

}

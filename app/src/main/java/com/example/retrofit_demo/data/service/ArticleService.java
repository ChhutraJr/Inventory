package com.example.retrofit_demo.data.service;

import com.example.retrofit_demo.model.form.Article;
import com.example.retrofit_demo.model.response.ArticleResponse;
import com.example.retrofit_demo.model.response.ImageResponse;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Query;

public interface ArticleService {

    @POST("/v1/api/articles")
    Call<com.example.retrofit_demo.model.response.Article>
        addArticle(
            @Body Article article
            );

    @GET("/v1/api/articles")
    Call<ArticleResponse> getArticles(
            @Query("page") int page,
            @Query("limit") int limit
    );

    @DELETE("/v1/api/articles/{amsId}")
    Call<com.example.retrofit_demo.model.response.Article>
    removeArticle(@Part("amsId") int id);



    @Multipart
    @POST("/v1/api/uploadfile/single")
    Call<ImageResponse> uploadImage(
            @Part MultipartBody.Part file
    );


}

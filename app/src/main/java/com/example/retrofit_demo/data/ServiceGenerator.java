package com.example.retrofit_demo.data;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServiceGenerator {
    public  static final  String BASE_RUL = "http://api-ams.me";

    private static  final  String API_KEY= "";

    private  static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(BASE_RUL)
            .addConverterFactory(GsonConverterFactory.create()).build();

    public  static <S> S createServices(Class<S> service){

        return retrofit.create(service);
    }

}

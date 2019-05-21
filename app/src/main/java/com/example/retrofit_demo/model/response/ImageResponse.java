package com.example.retrofit_demo.model.response;

import com.google.gson.annotations.SerializedName;

public class ImageResponse {
    @SerializedName("DATA")
    private String image;
    @SerializedName("MESSAGE")
    private String message;
    @SerializedName("CODE")
    private String code;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}

package com.example.retrofit_demo.model.response;
import com.google.gson.annotations.SerializedName;

public class Article {

    @SerializedName("DATA")
    private DataEntity data;
    @SerializedName("MESSAGE")
    private String message;
    @SerializedName("CODE")
    private String code;

    public DataEntity getData() {
        return data;
    }

    public void setData(DataEntity data) {
        this.data = data;
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

    @Override
    public String toString() {
        return "Article{" +
                "data=" + data +
                ", message='" + message + '\'' +
                ", code='" + code + '\'' +
                '}';
    }

    public class DataEntity {
        @SerializedName("IMAGE")
        private String image;
        @SerializedName("CATEGORY")
        private CategoryEntity category;
        @SerializedName("STATUS")
        private String status;
        @SerializedName("AUTHOR")
        private AuthorEntity author;
        @SerializedName("CREATED_DATE")
        private String createdDate;
        @SerializedName("DESCRIPTION")
        private String description;
        @SerializedName("TITLE")
        private String title;
        @SerializedName("ID")
        private int id;

        @Override
        public String toString() {
            return "DataEntity{" +
                    "image='" + image + '\'' +
                    ", category=" + category +
                    ", status='" + status + '\'' +
                    ", author=" + author +
                    ", createdDate='" + createdDate + '\'' +
                    ", description='" + description + '\'' +
                    ", title='" + title + '\'' +
                    ", id=" + id +
                    '}';
        }
    }

    public class CategoryEntity {
        @SerializedName("NAME")
        private String name;
        @SerializedName("ID")
        private int id;

        @Override
        public String toString() {
            return "CategoryEntity{" +
                    "name='" + name + '\'' +
                    ", id=" + id +
                    '}';
        }
    }

    public class AuthorEntity {
        @SerializedName("IMAGE_URL")
        private String imageUrl;
        @SerializedName("FACEBOOK_ID")
        private String facebookId;
        @SerializedName("STATUS")
        private String status;
        @SerializedName("TELEPHONE")
        private String telephone;
        @SerializedName("GENDER")
        private String gender;
        @SerializedName("EMAIL")
        private String email;
        @SerializedName("NAME")
        private String name;
        @SerializedName("ID")
        private int id;

        @Override
        public String toString() {
            return "AuthorEntity{" +
                    "imageUrl='" + imageUrl + '\'' +
                    ", facebookId='" + facebookId + '\'' +
                    ", status='" + status + '\'' +
                    ", telephone='" + telephone + '\'' +
                    ", gender='" + gender + '\'' +
                    ", email='" + email + '\'' +
                    ", name='" + name + '\'' +
                    ", id=" + id +
                    '}';
        }
    }
}

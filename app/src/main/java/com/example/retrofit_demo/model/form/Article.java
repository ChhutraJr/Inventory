package com.example.retrofit_demo.model.form;

import android.os.Parcel;
import  android.os.Parcelable;
import com.google.gson.annotations.SerializedName;

public class Article implements  Parcelable {

    public int id;
    @SerializedName("IMAGE")
    public String image;
    @SerializedName("STATUS")
    public String status;
    @SerializedName("CATEGORY_ID")
    public int categoryId;
    @SerializedName("AUTHOR")
    public int author;
    @SerializedName("DESCRIPTION")
    public String description;
    @SerializedName("TITLE")
    public String title;

    protected Article(Parcel in) {
        id = in.readInt();
        image = in.readString();
        status = in.readString();
        categoryId = in.readInt();
        author = in.readInt();
        description = in.readString();
        title = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(image);
        dest.writeString(status);
        dest.writeInt(categoryId);
        dest.writeInt(author);
        dest.writeString(description);
        dest.writeString(title);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Article> CREATOR = new Creator<Article>() {
        @Override
        public Article createFromParcel(Parcel in) {
            return new Article(in);
        }

        @Override
        public Article[] newArray(int size) {
            return new Article[size];
        }
    };

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Article(){}



    @Override
    public String toString() {
        return "Article{" +
                "image='" + image + '\'' +
                ", status='" + status + '\'' +
                ", categoryId=" + categoryId +
                ", author=" + author +
                ", description='" + description + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getAuthor() {
        return author;
    }

    public void setAuthor(int author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}

package com.example.retrofit_demo.model.response;
import  android.os.Parcel;
import  android.os.Parcelable;
import  java.util.List;

import com.google.gson.annotations.SerializedName;


public class ArticleResponse {

    @SerializedName("PAGINATION")
    private PaginationEntity pagination;
    @SerializedName("DATA")
    private List<DataEntity> data;
    @SerializedName("MESSAGE")
    private String message;
    @SerializedName("CODE")
    private String code;

    public PaginationEntity getPagination() {
        return pagination;
    }

    public void setPagination(PaginationEntity pagination) {
        this.pagination = pagination;
    }

    public List<DataEntity> getData() {
        return data;
    }

    public void setData(List<DataEntity> data) {
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
        return "ArticleResponse{" +
                "pagination=" + pagination +
                ", data=" + data +
                ", message='" + message + '\'' +
                ", code='" + code + '\'' +
                '}';
    }

    public class PaginationEntity {
        @SerializedName("TOTAL_PAGES")
        private int totalPages;
        @SerializedName("TOTAL_COUNT")
        private int totalCount;
        @SerializedName("LIMIT")
        private int limit;
        @SerializedName("PAGE")
        private int page;

        public int getTotalPages() {
            return totalPages;
        }

        public void setTotalPages(int totalPages) {
            this.totalPages = totalPages;
        }

        public int getTotalCount() {
            return totalCount;
        }

        public void setTotalCount(int totalCount) {
            this.totalCount = totalCount;
        }

        public int getLimit() {
            return limit;
        }

        public void setLimit(int limit) {
            this.limit = limit;
        }

        public int getPage() {
            return page;
        }

        public void setPage(int page) {
            this.page = page;
        }

        @Override
        public String toString() {
            return "PaginationEntity{" +
                    "totalPages=" + totalPages +
                    ", totalCount=" + totalCount +
                    ", limit=" + limit +
                    ", page=" + page +
                    '}';
        }
    }

    public static class DataEntity  implements Parcelable {
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

        public DataEntity() {
        }

        protected DataEntity(Parcel in) {
            image = in.readString();
            status = in.readString();
            createdDate = in.readString();
            description = in.readString();
            title = in.readString();
            id = in.readInt();
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(image);
            dest.writeString(status);
            dest.writeString(createdDate);
            dest.writeString(description);
            dest.writeString(title);
            dest.writeInt(id);
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public static final Creator<DataEntity> CREATOR = new Creator<DataEntity>() {
            @Override
            public DataEntity createFromParcel(Parcel in) {
                return new DataEntity(in);
            }

            @Override
            public DataEntity[] newArray(int size) {
                return new DataEntity[size];
            }
        };

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public CategoryEntity getCategory() {
            return category;
        }

        public void setCategory(CategoryEntity category) {
            this.category = category;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public AuthorEntity getAuthor() {
            return author;
        }

        public void setAuthor(AuthorEntity author) {
            this.author = author;
        }

        public String getCreatedDate() {
            return createdDate;
        }

        public void setCreatedDate(String createdDate) {
            this.createdDate = createdDate;
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

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

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

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

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

        public String getImageUrl() {
            return imageUrl;
        }

        public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }

        public String getFacebookId() {
            return facebookId;
        }

        public void setFacebookId(String facebookId) {
            this.facebookId = facebookId;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getTelephone() {
            return telephone;
        }

        public void setTelephone(String telephone) {
            this.telephone = telephone;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

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

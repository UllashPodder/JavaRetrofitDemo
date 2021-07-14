
package com.example.javaretrofitdemo.DataModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PostManResponseModel {

    @SerializedName("json")
    @Expose
    private Json json;
    @SerializedName("url")
    @Expose
    private String url;

    public Json getJson() {
        return json;
    }

    public void setJson(Json json) {
        this.json = json;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}

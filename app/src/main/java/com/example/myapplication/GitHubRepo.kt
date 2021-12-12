package com.example.myapplication

import com.google.gson.annotations.SerializedName

class GitHubRepo {

    data class GitHubRepo(
        @SerializedName("name") val name:String,
        @SerializedName("id") val id:String,
        @SerializedName("created_at") val date: String,
        @SerializedName("html_url") val url:String
    )
}
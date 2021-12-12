package com.example.myapplication

import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path

interface GitHubService {
    @GET("users/{owner}/repos")
    fun getRepos(@Path("owner") owner: String) : Single<List<GitHubRepo>>
}
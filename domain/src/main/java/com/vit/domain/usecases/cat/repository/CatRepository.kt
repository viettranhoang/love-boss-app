package com.vit.domain.usecases.cat.repository

interface CatRepository {
    fun getCatList(
        mimeTypes: String,
        limit: Int,
        page: Int
    )
}
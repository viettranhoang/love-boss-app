package com.vit.domain.usecases.favourite.repository

interface FavoriteRepository {
    suspend fun favouriteCat(catId: String, userId: String): Any

    suspend fun getFavouriteCats(userId: String)

    suspend fun unfavouriteCat(favouriteId: String)
}
package com.vit.domain.usecases.cat.repository

import com.vit.domain.usecases.cat.model.Breed
import com.vit.domain.usecases.cat.model.Cat

interface CatRepository {
    suspend fun getCatList(
        mimeTypes: String,
        limit: Int,
        page: Int
    ): List<Cat>

    suspend fun getBreedList(
        limit: Int,
        page: Int
    ): List<Breed>
}
package com.vit.data.features.cat.source

import com.vit.data.features.cat.model.BreedEntity
import com.vit.data.features.cat.model.CatEntity

interface CatRemote {
    suspend fun getCatList(
        mimeTypes: String,
        limit: Int,
        page: Int
    ): List<CatEntity>

    suspend fun getBreedList(
        limit: Int,
        page: Int
    ): List<BreedEntity>
}
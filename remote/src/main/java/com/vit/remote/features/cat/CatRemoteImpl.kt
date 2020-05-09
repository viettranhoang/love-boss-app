package com.vit.remote.features.cat

import com.vit.data.features.cat.model.BreedEntity
import com.vit.data.features.cat.model.CatEntity
import com.vit.data.features.cat.source.CatRemote

class CatRemoteImpl : CatRemote {

    override suspend fun getCatList(mimeTypes: String, limit: Int, page: Int): List<CatEntity> {
        TODO("Not yet implemented")
    }

    override suspend fun getBreedList(limit: Int, page: Int): List<BreedEntity> {
        TODO("Not yet implemented")
    }
}
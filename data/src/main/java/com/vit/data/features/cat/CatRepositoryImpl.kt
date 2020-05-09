package com.vit.data.features.cat

import com.vit.data.features.cat.mapper.mapFromListEntity
import com.vit.data.features.cat.source.CatRemote
import com.vit.domain.usecases.cat.model.Breed
import com.vit.domain.usecases.cat.model.Cat
import com.vit.domain.usecases.cat.repository.CatRepository
import javax.inject.Inject

class CatRepositoryImpl : CatRepository{

    @Inject
    lateinit var catRemote: CatRemote

    override suspend fun getCatList(mimeTypes: String, limit: Int, page: Int): List<Cat> {
        return catRemote.getCatList(mimeTypes, limit, page).mapFromListEntity()
    }

    override suspend fun getBreedList(limit: Int, page: Int): List<Breed> {
        return catRemote.getBreedList(limit, page).mapFromListEntity()
    }
}
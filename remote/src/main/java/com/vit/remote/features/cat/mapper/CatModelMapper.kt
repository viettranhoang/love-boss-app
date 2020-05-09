package com.vit.remote.features.cat.mapper

import com.vit.data.features.cat.model.CatEntity
import com.vit.remote.common.Mapper
import com.vit.remote.features.cat.model.CatModel

internal object CatModelMapper : Mapper<CatModel, CatEntity> {

    override fun mapToEntity(type: CatModel): CatEntity {
        return CatEntity(
            type.id.orEmpty(),
            type.url.orEmpty(),
            type.width ?: 0,
            type.height ?: 0,
            type.breeds.mapToListEntity()
        )
    }

    override fun mapFromEntity(type: CatEntity): CatModel {
        throw UnsupportedOperationException()
    }
}

internal fun CatModel.mapToEntity() = CatModelMapper.mapToEntity(this)

internal fun List<CatModel?>?.mapToListEntity() = this?.mapNotNull { it?.mapToEntity() } ?: emptyList()

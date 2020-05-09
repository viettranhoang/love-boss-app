package com.vit.remote.features.cat.mapper;

import com.vit.data.features.cat.model.BreedEntity
import com.vit.remote.common.Mapper
import com.vit.remote.features.cat.model.BreedModel

internal object BreedModelMapper : Mapper<BreedModel, BreedEntity> {

    override fun mapToEntity(type: BreedModel): BreedEntity {
        return BreedEntity(
            type.id.orEmpty(),
            type.name.orEmpty(),
            type.temperament.orEmpty(),
            type.origin.orEmpty(),
            type.description.orEmpty(),
            type.wikipediaUrl.orEmpty()
        )
    }

    override fun mapFromEntity(type: BreedEntity): BreedModel {
        throw UnsupportedOperationException()
    }
}

internal fun BreedModel.mapToEntity() = BreedModelMapper.mapToEntity(this)

internal fun List<BreedModel?>?.mapToListEntity() = this?.mapNotNull { it?.mapToEntity() } ?: emptyList()

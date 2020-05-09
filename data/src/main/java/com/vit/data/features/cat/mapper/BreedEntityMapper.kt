package com.vit.data.features.cat.mapper

import com.vit.data.Mapper
import com.vit.data.features.cat.model.BreedEntity
import com.vit.data.features.cat.model.CatEntity
import com.vit.domain.usecases.cat.model.Breed

internal object BreedEntityMapper : Mapper<BreedEntity, Breed> {
    override fun mapToEntity(type: Breed): BreedEntity {
        return BreedEntity(
            type.id,
            type.name,
            type.temperament,
            type.origin,
            type.description,
            type.wikipediaUrl
        )
    }

    override fun mapFromEntity(type: BreedEntity): Breed {
        return Breed(
            type.id,
            type.name,
            type.temperament,
            type.origin,
            type.description,
            type.wikipediaUrl
        )
    }
}

internal fun BreedEntity.mapFromEntity() = BreedEntityMapper.mapFromEntity(this)

internal fun List<BreedEntity>.mapFromListEntity() = this.map { it.mapFromEntity() }


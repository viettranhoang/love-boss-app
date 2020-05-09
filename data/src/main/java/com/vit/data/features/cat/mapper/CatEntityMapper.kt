package com.vit.data.features.cat.mapper

import com.vit.data.Mapper
import com.vit.data.features.cat.model.CatEntity
import com.vit.domain.usecases.cat.model.Cat

internal object CatEntityMapper : Mapper<CatEntity, Cat> {

    override fun mapToEntity(type: Cat): CatEntity {
        throw UnsupportedOperationException()
    }

    override fun mapFromEntity(type: CatEntity): Cat {
        return Cat(
            type.id,
            type.url,
            type.width,
            type.height,
            type.breeds.map { it.mapFromEntity() }
        )
    }
}

internal fun CatEntity.mapFromEntity() = CatEntityMapper.mapFromEntity(this)

internal fun List<CatEntity>.mapFromListEntity() = this.map { it.mapFromEntity() }
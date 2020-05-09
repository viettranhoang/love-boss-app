package com.vit.data

internal interface Mapper<E, M> {
    fun mapToEntity(type: M): E

    fun mapFromEntity(type: E): M
}
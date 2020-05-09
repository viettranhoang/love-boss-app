package com.vit.data.features.cat.model

data class CatEntity (
    val id: String,
    val url: String,
    val width: Int,
    val height: Int,
    val breeds: List<BreedEntity>
)
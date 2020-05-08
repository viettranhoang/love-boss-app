package com.vit.domain.usecases.favourite.model

import com.vit.domain.usecases.cat.model.Cat

data class Favourite (
    val id: String,
    val userId: String,
    val cat: Cat,
    val createdAt: String
)
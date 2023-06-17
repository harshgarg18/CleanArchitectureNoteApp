package com.harsh.cleanarchitecturenoteapp.feature_note.domain.use_case

sealed interface OrderType {
    object Ascending: OrderType
    object Descending: OrderType
}

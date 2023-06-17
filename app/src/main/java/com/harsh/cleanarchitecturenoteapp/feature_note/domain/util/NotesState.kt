package com.harsh.cleanarchitecturenoteapp.feature_note.domain.util

import com.harsh.cleanarchitecturenoteapp.feature_note.domain.model.Note
import com.harsh.cleanarchitecturenoteapp.feature_note.domain.use_case.NoteOrder
import com.harsh.cleanarchitecturenoteapp.feature_note.domain.use_case.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)

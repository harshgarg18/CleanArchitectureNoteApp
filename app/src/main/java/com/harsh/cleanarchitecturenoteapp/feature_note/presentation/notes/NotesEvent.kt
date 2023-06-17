package com.harsh.cleanarchitecturenoteapp.feature_note.presentation.notes

import com.harsh.cleanarchitecturenoteapp.feature_note.domain.model.Note
import com.harsh.cleanarchitecturenoteapp.feature_note.domain.use_case.NoteOrder

sealed interface NotesEvent {
    data class Order(val noteOrder: NoteOrder): NotesEvent
    data class DeleteNote(val note: Note): NotesEvent
    object RestoreNote: NotesEvent
    object ToggleOrderSection: NotesEvent
}

package com.example.aplikasidaftarbukuudin.room

import org.jetbrains.annotations.NotNull

@Dao
interface NoteDao {
    @Insert
    fun addNote(note: Note)
    @Update
    fun updateNote(note: Note)
    @Delete
    fun deleteNote(note: Note)
    @Query("SELECT * FROM note")
    fun getNotes(): List<Note>
    @Query("SELECT * FROM note WHERE id=:note_id")
    fun getNote(note_id: Int): List<Note>
}


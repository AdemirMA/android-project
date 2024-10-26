package com.example.appauladsm.roomDB

import com.example.appauladsm.roomDB.Pessoa
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert

@Dao
interface
PessoaDao {
    @Upsert
    suspend fun upsertPessoa(pessoa: Pessoa)

    @Delete
    suspend fun deletePessoa(pessoa: Pessoa)
    @Query("SELECT * FROM pessoa")
    fun getAllPessoas(): List<Pessoa>
}


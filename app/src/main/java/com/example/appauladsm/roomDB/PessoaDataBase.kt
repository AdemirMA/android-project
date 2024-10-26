package com.example.appauladsm.roomDBimport

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.appauladsm.roomDB.Pessoa
import com.example.appauladsm.roomDB.PessoaDao

@Database(
    entities = [Pessoa::class],
    version = 1
)
abstract class PessoaDataBase : RoomDatabase() {
    abstract fun pessoaDao(): PessoaDao
}
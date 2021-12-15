package com.jonareas.rentapp.data.database.dao

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Update

interface BaseDao<T> {


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(entity : T)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(entity : List<T>)

    @Update
    suspend fun update(entity : T)

    @Delete
    suspend fun delete(entity : T)

}
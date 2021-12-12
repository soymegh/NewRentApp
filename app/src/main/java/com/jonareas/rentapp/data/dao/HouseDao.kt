package com.jonareas.rentapp.data.dao

import androidx.lifecycle.LiveData
import androidx.room.Query
import com.jonareas.rentapp.data.models.House

interface HouseDao :BaseDao<House> {
    @Query("SELECT * FROM house where idHouse = :id_house")
    suspend fun getById(id_house : Int) : House

    @Query("SELECT * FROM house")
    suspend fun getAll() : LiveData<List<House>>
}
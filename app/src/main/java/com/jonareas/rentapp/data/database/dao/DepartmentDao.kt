package com.jonareas.rentapp.data.database.dao

import androidx.room.Dao
import androidx.room.Query
import com.jonareas.rentapp.data.model.Department

@Dao
interface DepartmentDao : BaseDao<Department> {

    @Query("SELECT departmentName FROM department")
    suspend fun getAllDepartment() : List<Department>

}
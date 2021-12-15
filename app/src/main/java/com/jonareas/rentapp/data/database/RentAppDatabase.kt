package com.jonareas.rentapp.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.jonareas.rentapp.data.model.FavHouse
import com.jonareas.rentapp.data.model.House
import com.jonareas.rentapp.data.model.User

@Database(entities = [User::class, House::class, FavHouse::class], version = 1, exportSchema = false)
abstract class RentAppDatabase : RoomDatabase() {

    companion object {

        const val DATABASE_NAME = "RentAppDB"

        @Volatile
        private var INSTANCE : RentAppDatabase? = null

        fun database(context : Context) : RentAppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    RentAppDatabase::class.java,
                    DATABASE_NAME
                ).fallbackToDestructiveMigration().build()

                return instance
            }
        }

    }

    }
//    abstract fun houseDao() : HouseDao
//
//    abstract fun userDao() : UserDao
//
//    abstract fun favHouseDao() : FavHouseDao
//}
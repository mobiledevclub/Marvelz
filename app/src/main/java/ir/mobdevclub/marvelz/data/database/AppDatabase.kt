package ir.mobdevclub.marvelz.data.database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [],//todo
    version = 1
)

abstract class AppDatabase : RoomDatabase() {
    abstract val appDao: DatabaseDao

}
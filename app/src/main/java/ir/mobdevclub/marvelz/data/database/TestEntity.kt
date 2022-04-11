package ir.mobdevclub.marvelz.data.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class TestEntity(
    @PrimaryKey val id:Int,
) {
}
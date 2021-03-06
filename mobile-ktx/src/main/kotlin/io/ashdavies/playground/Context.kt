package io.ashdavies.playground

import android.content.Context
import androidx.room.RoomDatabase

inline fun <reified T : RoomDatabase> Context.database(
    name: String
): T = databaseBuilder<T>(this, name).build()

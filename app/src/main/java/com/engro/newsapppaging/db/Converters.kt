package com.engro.newsapppaging.db

import androidx.room.TypeConverter
import com.engro.newsapppaging.data.model.Source

class Converters {
    @TypeConverter
    fun fromSource(value: String?): Source?{
        return value?.let { Source(it) }
    }

    @TypeConverter
    fun sourceToString(source: Source?): String {
        return source?.name.toString()
    }
}
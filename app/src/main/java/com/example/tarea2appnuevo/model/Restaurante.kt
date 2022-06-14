package com.example.tarea2appnuevo.model

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "Restaurante")
data class Restaurante(
@PrimaryKey(autoGenerate = true)
val id:Int,
@ColumnInfo(name = "nombre")
val nombre: String,
@ColumnInfo(name = "correo")
val correo: String?,
@ColumnInfo(name = "telefono")
val telefono: String?,
@ColumnInfo(name = "latitud")
val latitud: Double?,
@ColumnInfo(name = "longitud")
val longitud: Double?,
@ColumnInfo(name = "altura")
val altura: Double?,
@ColumnInfo(name = "rutaAudio")
val rutaAudio: String?,
@ColumnInfo(name = "rutaImagen")
val rutaImagen: String?,
) : Parcelable
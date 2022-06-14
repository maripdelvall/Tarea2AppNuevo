package com.example.tarea2appnuevo.data

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.tarea2appnuevo.model.Restaurante

@Dao
interface RestauranteDao {

    @Query("SELECT * FROM RESTAURANTE")
    fun getAllData() : LiveData<List<Restaurante>>

    @Insert (onConflict = OnConflictStrategy.IGNORE)
   suspend fun addRestaurante(Restaurante: Restaurante)

    @Update (onConflict = OnConflictStrategy.IGNORE)
    suspend fun updateRestaurante(Restaurante: Restaurante)

    @Delete
    suspend fun deleteRestaurante(Restaurante: Restaurante)


}
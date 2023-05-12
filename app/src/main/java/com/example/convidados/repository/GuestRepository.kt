package com.example.convidados.repository

import android.content.Context

//Não vou deixar que instancien o repository desde fora
class GuestRepository private constructor(context: Context){

    private val guestDatabase = GuestDatabase(context)

    companion object {

        private lateinit var repository: GuestRepository

        fun getInstance(context: Context): GuestRepository {
            if(!Companion::repository.isInitialized){
                repository = GuestRepository(context)
            }
            return repository
        }
    }

    fun insert(){

    }

}
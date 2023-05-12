package com.example.convidados.repository

//Não vou deixar que instancien o repository desde fora
class GuestRepository private constructor(){

    companion object {

        private lateinit var repository: GuestRepository

        fun getInstance(): GuestRepository {
            if(!Companion::repository.isInitialized){
                repository = GuestRepository()
            }
            return repository
        }
    }

    fun save(){

    }

}
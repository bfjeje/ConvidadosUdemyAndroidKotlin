package com.example.convidados.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.convidados.repository.GuestRepository

//Cambiamos de ViewModel a AndroidViewModel, porque este ultimo tiene contexto. El otro no. Y tengo que pasarlo al repository
class GuestFormViewModel(application: Application) : AndroidViewModel(application) {

    private val repository = GuestRepository.getInstance(application)

}
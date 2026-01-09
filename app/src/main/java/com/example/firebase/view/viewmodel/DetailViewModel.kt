@file:OptIn(InternalSerializationApi::class)
package com.example.firebase.view.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.firebase.modeldata.Siswa
import com.example.firebase.repository.RepositorySiswa
import com.example.firebase.view.route.DestinasiDetail
import kotlinx.coroutines.launch
import kotlinx.serialization.InternalSerializationApi
import java.io.IOException

sealed interface StatusUIDetail {
    data class Success(val satusiswa: Siswa?) : StatusUIDetail
    object Error : StatusUIDetail
    object Loading : StatusUIDetail
}

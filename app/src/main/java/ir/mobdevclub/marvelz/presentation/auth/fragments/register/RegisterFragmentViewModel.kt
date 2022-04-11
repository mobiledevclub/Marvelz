package ir.mobdevclub.marvelz.presentation.auth.fragments.register

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import ir.mobdevclub.marvelz.common.Event
import ir.mobdevclub.marvelz.common.Resource
import ir.mobdevclub.marvelz.data.remote.dto.register.TestBody
//import ir.mobdevclub.marvelz.domain.use_case.auth_user.RegisterUserUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class RegisterFragmentViewModel @Inject constructor(
//    private val registerUserUseCase: RegisterUserUseCase
) : ViewModel() {

//    private val _state = MutableStateFlow<RegisterUiState>(RegisterUiState.Initial) //todo can be replaced with LiveData for now!
//    val state: StateFlow<RegisterUiState> = _state
//
//    private val _livedata = MutableLiveData<Event<List<TestBody>>>()
//    val livedata: LiveData<Event<List<TestBody>>> = _livedata
//
//    fun registerUser(userData: Int) {
//        val body = TestBody(userData)
//
//        registerUserUseCase(body).onEach { result ->
//            when (result) {
//                is Resource.Success -> {
//                    _state.value = RegisterUiState.Success(result.data!!)
//                }
//                is Resource.Error -> {
//                    val errorMessage = result.message ?: "Error!" //todo get default error string
//
//                    _state.value = RegisterUiState.Error(errorMessage)
//                }
//                is Resource.Loading -> {
//                    _state.value = RegisterUiState.Loading
//                }
//            }
//        }.launchIn(viewModelScope)
//    }

}
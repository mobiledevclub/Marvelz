package ir.mobdevclub.marvelz.presentation.auth.fragments.register

import ir.mobdevclub.marvelz.data.remote.dto.register.TestResponse


sealed class RegisterUiState {
    data class Success(val response: TestResponse) : RegisterUiState()
    object Loading : RegisterUiState()
    object Initial : RegisterUiState()
    data class Error(val errorMessage: String) : RegisterUiState()
}

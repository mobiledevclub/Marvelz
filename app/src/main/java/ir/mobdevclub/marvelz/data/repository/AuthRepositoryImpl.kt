package ir.mobdevclub.marvelz.data.repository


import ir.mobdevclub.marvelz.data.remote.AuthApiService
import ir.mobdevclub.marvelz.data.remote.dto.register.TestBody
import ir.mobdevclub.marvelz.data.remote.dto.register.TestResponse
import ir.mobdevclub.marvelz.domain.repository.AuthRepository
import javax.inject.Inject

class AuthRepositoryImpl @Inject constructor(
    private val api: AuthApiService
) : AuthRepository {

    override suspend fun registerUser(userData: TestBody): TestResponse {
        return api.registerUser(userData)
    }


}

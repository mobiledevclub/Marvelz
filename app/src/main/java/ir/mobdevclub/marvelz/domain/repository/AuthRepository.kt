package ir.mobdevclub.marvelz.domain.repository

import ir.mobdevclub.marvelz.data.remote.dto.register.TestBody
import ir.mobdevclub.marvelz.data.remote.dto.register.TestResponse

interface AuthRepository {

    suspend fun registerUser(userData: TestBody): TestResponse

}
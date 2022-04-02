package ir.mobdevclub.marvelz.data.remote

import ir.mobdevclub.marvelz.data.remote.dto.register.TestBody
import ir.mobdevclub.marvelz.data.remote.dto.register.TestResponse
import retrofit2.http.Body
import retrofit2.http.POST


interface AuthApiService {

    // Register
    @POST("api/v1/auth/register/")
    suspend fun registerUser(
        @Body body: TestBody
    ): TestResponse

}
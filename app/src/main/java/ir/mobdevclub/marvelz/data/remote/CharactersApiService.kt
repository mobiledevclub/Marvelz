package ir.mobdevclub.marvelz.data.remote

import ir.mobdevclub.marvelz.common.Constants
import ir.mobdevclub.marvelz.data.remote.dto.characters.MarvelCharactersModel
import ir.mobdevclub.marvelz.data.remote.dto.register.TestBody
import ir.mobdevclub.marvelz.data.remote.dto.register.TestResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query


interface CharactersApiService {

    // character
    @GET("v1/public/characters")
    suspend fun getAllCharacters(
        @Query("apikey") apiKey: String = Constants.API_PUBLIC_KEY,
        @Query("ts") ts: String,
        @Query("hash") hash: String,
    ): Response<MarvelCharactersModel>

}
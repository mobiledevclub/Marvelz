package ir.mobdevclub.marvelz.domain.repository

import ir.mobdevclub.marvelz.common.Resource
import ir.mobdevclub.marvelz.data.remote.dto.characters.MarvelCharactersModel
import ir.mobdevclub.marvelz.data.remote.dto.register.TestBody
import ir.mobdevclub.marvelz.data.remote.dto.register.TestResponse

interface CharacterRepository {

//    suspend fun registerUser(userData: TestBody): TestResponse
    suspend fun getAllCharacters(): Resource<MarvelCharactersModel>

}
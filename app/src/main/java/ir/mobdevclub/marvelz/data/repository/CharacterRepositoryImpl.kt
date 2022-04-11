package ir.mobdevclub.marvelz.data.repository


import ir.mobdevclub.marvelz.common.Constants
import ir.mobdevclub.marvelz.common.Resource
import ir.mobdevclub.marvelz.common.safeApiCall
import ir.mobdevclub.marvelz.common.utils.md5
import ir.mobdevclub.marvelz.data.remote.CharactersApiService
import ir.mobdevclub.marvelz.data.remote.dto.characters.MarvelCharactersModel
import ir.mobdevclub.marvelz.domain.repository.CharacterRepository
import java.util.*
import javax.inject.Inject

class CharacterRepositoryImpl @Inject constructor(
    private val api: CharactersApiService
) : CharacterRepository {

    private val ts =
        (Calendar.getInstance(TimeZone.getTimeZone("UTC")).timeInMillis / 1000L).toString()
    private val hash = md5(ts + Constants.API_PRIVATE_KEY + Constants.API_PUBLIC_KEY)

    override suspend fun getAllCharacters(): Resource<MarvelCharactersModel> {
        return safeApiCall {
            api.getAllCharacters(ts = ts, hash = hash)
        }
    }


}

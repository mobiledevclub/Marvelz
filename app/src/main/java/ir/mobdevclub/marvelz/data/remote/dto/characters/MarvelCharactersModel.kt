package ir.mobdevclub.marvelz.data.remote.dto.characters

data class MarvelCharactersModel(
    val attributionHTML: String,
    val attributionText: String,
    val code: Int,
    val copyright: String,
    val data: MarvelCharactersData,
    val etag: String,
    val status: String
)
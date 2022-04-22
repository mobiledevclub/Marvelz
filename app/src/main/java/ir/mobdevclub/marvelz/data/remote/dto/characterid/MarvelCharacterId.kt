package ir.mobdevclub.marvelz.data.remote.dto.characterid

data class MarvelCharacterId(
    val attributionHTML: String,
    val attributionText: String,
    val code: Int,
    val copyright: String,
    val `data`: Data,
    val etag: String,
    val status: String
)
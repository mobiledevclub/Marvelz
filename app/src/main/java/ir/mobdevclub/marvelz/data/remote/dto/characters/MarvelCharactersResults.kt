package ir.mobdevclub.marvelz.data.remote.dto.characters

data class MarvelCharactersResults(
    val description: String,
    val id: Int,
    val name: String,
    val thumbnail: MarvelCharactersThumbnail
)
package ir.mobdevclub.marvelz.data.remote.dto.characterid

data class Result(
    val description: String,
    val id: Int,
    val modified: String,
    val name: String,
    val thumbnail: Thumbnail
)
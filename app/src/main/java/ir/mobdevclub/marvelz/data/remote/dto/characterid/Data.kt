package ir.mobdevclub.marvelz.data.remote.dto.characterid

data class Data(
    val count: Int,
    val limit: Int,
    val offset: Int,
    val results: List<Result>,
    val total: Int
)
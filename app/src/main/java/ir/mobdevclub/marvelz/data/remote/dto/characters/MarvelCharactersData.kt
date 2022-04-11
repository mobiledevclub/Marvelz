package ir.mobdevclub.marvelz.data.remote.dto.characters

import ir.mobdevclub.marvelz.data.remote.dto.characters.MarvelCharactersResults

data class MarvelCharactersData(
    val count: Int,
    val limit: Int,
    val offset: Int,
    val results: List<MarvelCharactersResults>,
    val total: Int
)
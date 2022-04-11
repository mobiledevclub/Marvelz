package ir.mobdevclub.marvelz.data.remote.dto.characters

import ir.mobdevclub.marvelz.presentation.main.MarvelCharacterItem

data class MarvelCharactersResults(
    val description: String,
    val id: Int,
    val name: String,
    val thumbnail: MarvelCharactersThumbnail
){
    fun toCharacterListItem() = MarvelCharacterItem(this)
}
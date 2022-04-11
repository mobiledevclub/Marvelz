package ir.mobdevclub.marvelz.presentation.main

import android.view.LayoutInflater
import android.view.ViewGroup
import com.mikepenz.fastadapter.binding.AbstractBindingItem
import ir.mobdevclub.marvelz.R
import ir.mobdevclub.marvelz.data.remote.dto.characters.MarvelCharactersModel
import ir.mobdevclub.marvelz.data.remote.dto.characters.MarvelCharactersResults
import ir.mobdevclub.marvelz.databinding.ItemCharacterBinding

class MarvelCharacterItem(
    val character: MarvelCharactersResults
) :
    AbstractBindingItem<ItemCharacterBinding>() {

    override val type: Int
        get() = R.id.fastadapter_movie_list

    override fun createBinding(inflater: LayoutInflater, parent: ViewGroup?): ItemCharacterBinding {
        return ItemCharacterBinding.inflate(inflater, parent, false)
    }

    override fun bindView(binding: ItemCharacterBinding, payloads: List<Any>) {
        binding.apply {
            tvName.text = character.name
        }
    }
}
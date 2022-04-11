package ir.mobdevclub.marvelz.presentation.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import ir.mobdevclub.marvelz.common.Resource
import ir.mobdevclub.marvelz.data.remote.dto.characters.MarvelCharactersModel
import ir.mobdevclub.marvelz.domain.repository.CharacterRepository
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CharacterListViewModel @Inject constructor(
    private val characterRepository: CharacterRepository
) : ViewModel() {

    init {
        getCharacters()
    }

    private val _characters: MutableLiveData<Resource<MarvelCharactersModel>> = MutableLiveData()
    val characters: LiveData<Resource<MarvelCharactersModel>> = _characters

    fun getCharacters() {
        viewModelScope.launch {
            val result = characterRepository.getAllCharacters()
            _characters.value = result
        }
    }

}
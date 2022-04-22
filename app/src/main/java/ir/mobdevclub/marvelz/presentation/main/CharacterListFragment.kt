package ir.mobdevclub.marvelz.presentation.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.mikepenz.fastadapter.adapters.FastItemAdapter
import dagger.hilt.android.AndroidEntryPoint
import ir.mobdevclub.marvelz.common.Resource
import ir.mobdevclub.marvelz.common.utils.observe
import ir.mobdevclub.marvelz.data.remote.dto.characters.MarvelCharactersModel
import ir.mobdevclub.marvelz.databinding.FragmentMovieListBinding

@AndroidEntryPoint
class CharacterListFragment : Fragment() {

    private lateinit var binding: FragmentMovieListBinding
    private val viewModel: CharacterListViewModel by viewModels()

    private lateinit var charactersAdapter: FastItemAdapter<MarvelCharacterItem>

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMovieListBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initAdapter()
        with(viewModel) {
            observe(characters, ::onCharactersLoaded)
        }


    }

    private fun initAdapter() {
        binding.rvCharacters.apply {
            layoutManager = LinearLayoutManager(requireContext())
            charactersAdapter = FastItemAdapter()
            adapter = charactersAdapter

        }
    }

    private fun onCharactersLoaded(resource: Resource<MarvelCharactersModel>?) {
        when (resource) {
            is Resource.Error -> {
                Toast.makeText(requireContext(), resource.message, Toast.LENGTH_SHORT).show()
            }
            is Resource.Loading -> {
                Toast.makeText(requireContext(), "loading", Toast.LENGTH_SHORT).show()
            }
            is Resource.Success -> {
                charactersAdapter.set(resource.data!!.data.results.map { it.toCharacterListItem() })
            }
        }
    }
}
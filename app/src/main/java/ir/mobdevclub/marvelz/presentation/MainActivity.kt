package ir.mobdevclub.marvelz.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import dagger.hilt.android.AndroidEntryPoint
import ir.mobdevclub.marvelz.R
import ir.mobdevclub.marvelz.common.utils.observeEvent
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        with(lifecycle){
//            observeEvent(viewModel.livedata, ::renderTestBodyResponse)    todo for showcase purpose
        }

    }

    private fun renderTestBodyResponse(any: Any) {
        //todo
    }
}
package com.example.jetpacknavigationtest.ui.download

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.jetpacknavigationtest.R
import kotlinx.android.synthetic.main.download_fragment.*

class DownloadFragment : androidx.fragment.app.Fragment() {

    private lateinit var viewModel: DownloadViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.download_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        view.findNavController().popBackStack()
//        button.setOnClickListener(
//                Navigation.createNavigateOnClickListener(R.id.action_downloadFragment_to_mainFragment))
        button.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_downloadFragment_to_mainFragment))

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(DownloadViewModel::class.java)
        // TODO: Use the ViewModel
    }

}

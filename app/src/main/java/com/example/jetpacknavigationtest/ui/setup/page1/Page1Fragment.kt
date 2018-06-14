package com.example.jetpacknavigationtest.ui.setup.page1

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.jetpacknavigationtest.R
import kotlinx.android.synthetic.main.setup_page1_fragment.*

class Page1Fragment : Fragment() {

    private lateinit var viewModel: Page1ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.setup_page1_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_page1Fragment_to_page2Fragment))
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(Page1ViewModel::class.java)
        // TODO: Use the ViewModel
    }

}

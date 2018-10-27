package com.example.jetpacknavigationtest.ui.setup.page3

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.jetpacknavigationtest.R

import kotlinx.android.synthetic.main.setup_page3_fragment.*

class Page3Fragment : androidx.fragment.app.Fragment() {

    private lateinit var viewModel: Page3ViewModel

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.setup_page3_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button_normal_pop.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_page3Fragment_to_downloadFragment))
        button_normal_no_pop.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_page3Fragment_to_downloadFragment_no_pop))
        button_global.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_global_downloadFragment3))
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(Page3ViewModel::class.java)
    }

}

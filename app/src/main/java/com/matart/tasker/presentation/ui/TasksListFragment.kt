package com.matart.tasker.presentation.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.matart.tasker.R
import com.matart.tasker.databinding.FragmentTasksListBinding
import com.matart.tasker.presentation.ui.base.BaseFragment

class TasksListFragment : BaseFragment<FragmentTasksListBinding>() {
    override fun getViewBinding() = FragmentTasksListBinding.inflate(layoutInflater)

    
}
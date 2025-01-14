package com.example.funnyapp.di

import com.example.funnyapp.presentation.vm.ChatViewModel
import com.example.funnyapp.presentation.vm.ChatsViewModel
import com.example.funnyapp.presentation.vm.ProfileViewModel
import com.example.funnyapp.presentation.vm.SearchViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel {
        ProfileViewModel()
    }

    viewModel {
        SearchViewModel()
    }

    viewModel {
        ChatsViewModel()
    }

    viewModel {
        ChatViewModel()
    }
}
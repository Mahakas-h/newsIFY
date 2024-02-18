package com.example.newsify.domain.usecases.app_entry

import com.example.newsify.domain.manager.LocalUserManager

class SaveAppEntry(
    private val localUserManager: LocalUserManager
) {
    suspend  operator fun invoke(){
        localUserManager.saveAppEntry()
    }

}
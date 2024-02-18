package com.example.newsify.domain.usecases.app_entry

import com.example.newsify.domain.manager.LocalUserManager
import kotlinx.coroutines.flow.Flow

class ReadAppEntry (
    private val localUserManager: LocalUserManager
) {
    operator fun invoke():Flow<Boolean>{
        return localUserManager.readAppEntry()
    }

}
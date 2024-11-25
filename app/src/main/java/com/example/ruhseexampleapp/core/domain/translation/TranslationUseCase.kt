package com.example.ruhseexampleapp.core.domain.translation

import jakarta.inject.Inject
import com.example.ruhseexampleapp.core.TranslationApi
import com.example.ruhseexampleapp.core.TranslationResponse
import com.example.ruhseexampleapp.core.domain.LanguageCode

class TranslationUseCase @Inject constructor(
    private val translationApi: TranslationApi
) {
    suspend fun translate(sl: LanguageCode, dl: LanguageCode, text: String): TranslationResponse {
        return translationApi.translate(sl.code, dl.code, text)
    }
}
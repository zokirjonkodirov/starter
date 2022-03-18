package com.raywenderlich.android.majesticreader.interactors

import com.raywenderlich.android.majesticreader.data.repositories.DocumentRepository
import com.raywenderlich.android.majesticreader.domain.Document

class SetOpenDocument(private val documentRepository: DocumentRepository) {

    suspend operator fun invoke(document: Document) =
        documentRepository.setOpenDocument(document)
}
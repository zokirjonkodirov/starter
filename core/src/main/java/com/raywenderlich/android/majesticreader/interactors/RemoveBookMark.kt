package com.raywenderlich.android.majesticreader.interactors

import com.raywenderlich.android.majesticreader.data.repositories.BookmarkRepository
import com.raywenderlich.android.majesticreader.domain.Bookmark
import com.raywenderlich.android.majesticreader.domain.Document

class RemoveBookMark(private val bookmarkRepository: BookmarkRepository) {

    suspend operator fun invoke(document: Document, bookmark: Bookmark) =
        bookmarkRepository.removeBookmark(document, bookmark)
}
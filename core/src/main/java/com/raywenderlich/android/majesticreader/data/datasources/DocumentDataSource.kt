package com.raywenderlich.android.majesticreader.data.datasources

import com.raywenderlich.android.majesticreader.domain.Document

interface DocumentDataSource {

    suspend fun add(document: Document)

    suspend fun readALl(): List<Document>

    suspend fun remove(document: Document)
}
package com.ElOuedUniv.maktaba.data.repository

import com.ElOuedUniv.maktaba.data.model.Book
import com.ElOuedUniv.maktaba.data.model.Category

interface BookRepository {

    fun getAllBooks(): List<Book>

    fun getBookByIsbn(isbn: String): Book

}
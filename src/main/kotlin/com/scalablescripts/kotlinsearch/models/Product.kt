package com.scalablescripts.kotlinsearch.models

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
class Product {
    @Id
    var _id = ""

    var title = ""

    var description = ""

    var image = ""

    var price = ""
}
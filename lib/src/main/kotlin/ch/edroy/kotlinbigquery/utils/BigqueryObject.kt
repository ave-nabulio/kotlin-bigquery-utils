package ch.edroy.kotlinbigquery.utils

import com.google.cloud.bigquery.Dataset

interface BigqueryObject {
    fun getOrCreate(name: String, location: String): Dataset
}
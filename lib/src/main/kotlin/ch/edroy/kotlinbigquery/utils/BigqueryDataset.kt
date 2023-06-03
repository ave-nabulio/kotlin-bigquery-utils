package ch.edroy.kotlinbigquery.utils

import com.google.cloud.bigquery.BigQuery
import com.google.cloud.bigquery.BigQueryOptions
import com.google.cloud.bigquery.Dataset
import com.google.cloud.bigquery.DatasetInfo

class BigqueryDataset {
    companion object : BigqueryObject {
        override fun getOrCreate(name: String, location: String): Dataset {
            val bigquery: BigQuery = BigQueryOptions.getDefaultInstance()
                .service
            val datasetInfo = DatasetInfo.newBuilder(name)
                .setLocation(location)
                .build()
            return bigquery.getDataset(name) ?: bigquery.create(datasetInfo)
        }
    }
}
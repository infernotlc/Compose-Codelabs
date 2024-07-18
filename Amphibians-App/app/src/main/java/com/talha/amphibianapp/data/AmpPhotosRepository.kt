package com.talha.amphibianapp.data

import com.talha.amphibianapp.model.Amphibian
import com.talha.amphibianapp.network.AmphibiansApiService



interface AmphibiansRepository {
    /** Retrieves list of amphibians from underlying data source */
    suspend fun getAmphibians(): List<Amphibian>
}

/**
 * Network Implementation of repository that retrieves amphibian data from underlying data source.
 */
class DefaultAmphibiansRepository(
    private val amphibiansApiService: AmphibiansApiService
) : AmphibiansRepository {
    /** Retrieves list of amphibians from underlying data source */
    override suspend fun getAmphibians(): List<Amphibian> = amphibiansApiService.getAmphibians()
}
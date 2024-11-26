package pe.com.agileapps.data.repository

import pe.com.agileapps.data.remote.CoinPaprikaApi
import pe.com.agileapps.data.remote.dto.CoinDetailDto
import pe.com.agileapps.data.remote.dto.CoinDto
import pe.com.agileapps.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api : CoinPaprikaApi
) : CoinRepository {
    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId = coinId)
    }

}
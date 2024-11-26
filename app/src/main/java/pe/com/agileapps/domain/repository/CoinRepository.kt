package pe.com.agileapps.domain.repository

import pe.com.agileapps.data.remote.dto.CoinDetailDto
import pe.com.agileapps.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins() : List<CoinDto>

    suspend fun getCoinById(coinId : String) : CoinDetailDto
}
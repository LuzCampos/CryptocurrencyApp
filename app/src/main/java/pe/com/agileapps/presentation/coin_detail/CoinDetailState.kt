package pe.com.agileapps.presentation.coin_detail

import pe.com.agileapps.domain.model.Coin
import pe.com.agileapps.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading : Boolean = false,
    val coin : CoinDetail? = null,
    val error : String = ""
)
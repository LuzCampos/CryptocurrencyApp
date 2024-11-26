package pe.com.agileapps.presentation.coin_list

import pe.com.agileapps.domain.model.Coin

data class CoinListState(
    val isLoading : Boolean = false,
    val coins : List<Coin> = emptyList(),
    val error : String = ""
)
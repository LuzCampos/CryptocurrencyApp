package pe.com.agileapps.domain.use_case.get_coin

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import pe.com.agileapps.common.Resource
import pe.com.agileapps.data.remote.dto.toCoin
import pe.com.agileapps.data.remote.dto.toCoinDetail
import pe.com.agileapps.domain.model.Coin
import pe.com.agileapps.domain.model.CoinDetail
import pe.com.agileapps.domain.repository.CoinRepository
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCoinUseCase @Inject constructor(
    private val repository: CoinRepository
) {

}
package pe.com.agileapps.domain.use_case.get_coins

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import pe.com.agileapps.common.Resource
import pe.com.agileapps.data.remote.dto.toCoin
import pe.com.agileapps.domain.model.Coin
import pe.com.agileapps.domain.repository.CoinRepository
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCoinsUseCase @Inject constructor(
    private val repository: CoinRepository
) {
    operator fun invoke() : Flow<Resource<List<Coin>>> = flow {
        try {
            emit(Resource.Loading<List<Coin>>())
            val coins = repository.getCoins().map { it.toCoin() }
            emit(Resource.Success<List<Coin>>(coins))
        } catch ( e: HttpException ){
            emit(Resource.Error<List<Coin>>(e.localizedMessage ?: "Un error inesperado surgió, vuelve a intentarlo más tarde"))
        } catch (e: IOException){
            emit(Resource.Error<List<Coin>>("Verifique su conexión a Internet"))
        }
    }
}
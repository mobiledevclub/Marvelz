package ir.mobdevclub.marvelz.domain.use_case.auth_user

import ir.mobdevclub.marvelz.common.Resource
import ir.mobdevclub.marvelz.data.remote.dto.register.TestBody
import ir.mobdevclub.marvelz.data.remote.dto.register.TestResponse
import ir.mobdevclub.marvelz.domain.repository.CharacterRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

//class RegisterUserUseCase @Inject constructor(
//    private val repository: CharacterRepository
//) {
//    operator fun invoke(userData: TestBody): Flow<Resource<TestResponse>> = flow {
//        try {
//            emit(Resource.Loading())
//            val result = repository.registerUser(userData)
//            emit(Resource.Success(result))
//        } catch (e: HttpException) {
////            val message = ErrorUtils.convertErrorBody(e)
//            emit(Resource.Error(e.localizedMessage ?: "An unexpected error occured")) //todo errors can be generalized by sealed classes
//        } catch (e: IOException) {
//            emit(Resource.Error("Couldn't reach server. Check your internet connection."))
//        }
//    }
//}
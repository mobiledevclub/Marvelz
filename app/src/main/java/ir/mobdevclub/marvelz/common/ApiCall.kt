package ir.mobdevclub.marvelz.common

import retrofit2.Response

suspend fun <T : Any> safeApiCall(call: suspend () -> Response<T>): Resource<T> {
    return try {
        val myResp = call.invoke()
        if (myResp.isSuccessful) {
            Resource.Success(myResp.body()!!)
        } else {
            Resource.Error(myResp.errorBody()?.string() ?: "Something goes wrong")
        }

    } catch (e: Exception) {
        Resource.Error(e.message ?: "Internet error runs")
    }
}
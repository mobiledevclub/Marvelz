package ir.mobdevclub.marvelz.di

import android.app.Application
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ir.mobdevclub.marvelz.common.Constants
import ir.mobdevclub.marvelz.data.database.AppDatabase
import ir.mobdevclub.marvelz.data.remote.CharactersApiService
import ir.mobdevclub.marvelz.data.repository.CharacterRepositoryImpl
import ir.mobdevclub.marvelz.domain.repository.CharacterRepository
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit {
        val interceptor = HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY
        }
        val client = OkHttpClient.Builder()
            .addInterceptor(interceptor)
            .build()
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }


    @Provides
    @Singleton
    fun provideApiService(client: Retrofit): CharactersApiService {
        return client.create(CharactersApiService::class.java)
    }


    @Provides
    @Singleton
    fun provideDatabase(app: Application) =
        Room.databaseBuilder(
            app,
            AppDatabase::class.java,
            Constants.DATABASE_NAME
        ).build()

    @Provides
    fun provideDao(db: AppDatabase) = db.appDao


    //Repositories
    @Provides
    @Singleton
    fun provideCharacterRepository(api: CharactersApiService): CharacterRepository {
        return CharacterRepositoryImpl(api)
    }

}
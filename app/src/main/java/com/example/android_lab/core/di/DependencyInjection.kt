//import android.app.Application
//import androidx.room.Room
//import com.google.android.datatransport.runtime.dagger.Module
//import com.google.android.datatransport.runtime.dagger.Provides
//import dagger.Module
//import dagger.Provides
//import dagger.hilt.InstallIn
//import dagger.hilt.components.SingletonComponent
//import javax.inject.Singleton
//
//@com.google.android.datatransport.runtime.dagger.Module
//@InstallIn(SingletonComponent::class)
//object AppModule {
//
//    @Provides
//    @Singleton
//    fun provideDatabase(app: Application): TodoDatabase =
//        Room.databaseBuilder(app, TodoDatabase::class.java, "todo_db")
//            .fallbackToDestructiveMigration(false) // Optional, but useful for development
//            .build()
//
//    @Provides
//    @Singleton
//    fun provideTodoDao(db: TodoDatabase) = db.todoDao()
//
//    @Provides
//    @Singleton
//    fun provideRepository(dao: TodoDao): TodoRepository = TodoRepositoryImpl(dao)
//
//    @Provides
//    @Singleton
//    fun provideUseCases(repo: TodoRepository): TodoUseCases =
//        TodoUseCases(
//            addTodo = AddTodoUseCase(repo),
//            getTodos = GetTodosUseCase(repo),
//            updateTodo = UpdateTodoUseCase(repo),
//            deleteTodo = DeleteTodoUseCase(repo)
//        )
//}
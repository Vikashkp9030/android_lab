interface TodoRepository {
    suspend fun add(todo: Todo)
    suspend fun getAll(): List<Todo>
    suspend fun update(todo: Todo)
    suspend fun delete(todo: Todo)
}

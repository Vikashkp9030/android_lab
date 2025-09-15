class TodoRepositoryImpl(private val dao: TodoDao) : TodoRepository {
    override suspend fun add(todo: Todo) = dao.insert(todo.toEntity())
    override suspend fun getAll() = dao.getAll().map { it.toDomain() }
    override suspend fun update(todo: Todo) = dao.update(todo.toEntity())
    override suspend fun delete(todo: Todo) = dao.delete(todo.toEntity())
}

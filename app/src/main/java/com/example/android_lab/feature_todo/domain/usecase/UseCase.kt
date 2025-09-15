class AddTodoUseCase(private val repo: TodoRepository) {
    suspend operator fun invoke(todo: Todo) = repo.add(todo)
}
class GetTodosUseCase(private val repo: TodoRepository) {
    suspend operator fun invoke() = repo.getAll()
}
class UpdateTodoUseCase(private val repo: TodoRepository) {
    suspend operator fun invoke(todo: Todo) = repo.update(todo)
}
class DeleteTodoUseCase(private val repo: TodoRepository) {
    suspend operator fun invoke(todo: Todo) = repo.delete(todo)
}

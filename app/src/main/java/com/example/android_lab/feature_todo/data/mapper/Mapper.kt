fun TodoEntity.toDomain(): Todo =
    Todo(id = id, title = title, description = description, isDone = isDone)

fun Todo.toEntity(): TodoEntity =
    TodoEntity(id = id, title = title, description = description, isDone = isDone)

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class TodoViewModel @Inject constructor(
    private val addTodo: AddTodoUseCase,
    private val getTodos: GetTodosUseCase,
    private val updateTodo: UpdateTodoUseCase,
    private val deleteTodo: DeleteTodoUseCase
) : ViewModel() {
    annotation class Inject

    private val _temp = mutableStateOf<List<Todo>>(emptyList())

    private val _todos = mutableStateOf<List<Todo>>(emptyList())
    val todos = _todos

    init {
        loadTodos()
    }

    fun loadTodos() = viewModelScope.launch {
        _todos.value = getTodos()
    }

    viewModelScope.launch{

    }

    fun addTask(title: String, description: String) = viewModelScope.launch {
        addTodo(Todo(title = title, description = description))
        loadTodos()
    }

    fun updateTask(todo: Todo) = viewModelScope.launch {
        updateTodo(todo)
        loadTodos()
    }

    fun deleteTask(todo: Todo) = viewModelScope.launch {
        deleteTodo(todo)
        loadTodos()
    }
}


import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.app.auth.domain.model.User
import com.example.app.auth.domain.usecase.LoginUseCase
import com.example.app.auth.domain.usecase.SignupUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class AuthViewModel(
    private val loginUseCase: LoginUseCase,
    private val signupUseCase: SignupUseCase
) : ViewModel() {

    private val _authState = MutableStateFlow(false)
    val authState: StateFlow<Boolean> = _authState

    fun login(email: String, password: String) {
        viewModelScope.launch {
            _authState.value = loginUseCase(email, password)
        }
    }

    fun signup(email: String, password: String, password1: String) {
        viewModelScope.launch {
            signupUseCase(User(email, password))
        }
    }
}

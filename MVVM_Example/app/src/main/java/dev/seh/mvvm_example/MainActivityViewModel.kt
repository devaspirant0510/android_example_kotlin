package dev.seh.mvvm_example

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

enum class ActionType {
    SHIFT_LEFT, SHIFT_RIGHT
}

class MainActivityViewModel : ViewModel() {
    companion object {
        private val TAG: String = this.javaClass.simpleName
    }

    private val _currentValue = MutableLiveData<Int>()
    val currentValue: LiveData<Int>
        get() = _currentValue



    init {
        Log.e(TAG, "$TAG called ")
        _currentValue.value = 2
    }

    fun updateValue(type: ActionType, value: Int) {
        when (type) {
            ActionType.SHIFT_LEFT -> {
                _currentValue.value = currentValue.value?.shl(value)
            }
            ActionType.SHIFT_RIGHT -> {
                _currentValue.value = currentValue.value?.shr(value)
            }
        }
    }
}
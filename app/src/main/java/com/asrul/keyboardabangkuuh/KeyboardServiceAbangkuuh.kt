package com.asrul.keyboardabangkuuh

import android.view.KeyEvent
import android.view.KeyEvent.ACTION_DOWN
import android.view.KeyEvent.ACTION_UP
import android.view.KeyEvent.KEYCODE_DEL
import android.view.KeyEvent.KEYCODE_ENTER
import android.view.View
import android.view.inputmethod.EditorInfo.IME_ACTION_NONE
import android.view.inputmethod.EditorInfo.IME_FLAG_NO_ENTER_ACTION
import android.view.inputmethod.EditorInfo.IME_MASK_ACTION
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.ViewModelStore
import androidx.lifecycle.ViewModelStoreOwner
import androidx.lifecycle.setViewTreeLifecycleOwner
import androidx.lifecycle.setViewTreeViewModelStoreOwner
import androidx.savedstate.SavedStateRegistry
import androidx.savedstate.SavedStateRegistryController
import androidx.savedstate.SavedStateRegistryOwner
import androidx.savedstate.setViewTreeSavedStateRegistryOwner
import com.asrul.keyboardabangkuuh.util.Constants.KeyboardKey.DELETE
import com.asrul.keyboardabangkuuh.util.Constants.KeyboardKey.ENTER
import com.asrul.keyboardabangkuuh.util.Constants.KeyboardKey.SHIFT

class KeyboardServiceAbangkuuh : LifecycleInputMethodService(), SavedStateRegistryOwner, ViewModelStoreOwner {

    override fun onCreateInputView(): View {
        val view = KeyboardView(
            context = this,
            currentImeOptions = getImeOption(),
            onKeyPressed = {
                when (it) {
                    DELETE -> currentInputConnection.sendKeyEvent(KeyEvent(ACTION_DOWN, KEYCODE_DEL))
                    ENTER -> handleEnterKey()
                    SHIFT -> Unit
                    else -> currentInputConnection.commitText(it, 1)
                }
            }
        )

        window?.window?.decorView?.let { decorView ->
            decorView.setViewTreeLifecycleOwner(this)
            decorView.setViewTreeViewModelStoreOwner(this)
            decorView.setViewTreeSavedStateRegistryOwner(this)
        }

        return view
    }

    override fun onCreate() {
        super.onCreate()
        savedStateRegistryController.performRestore(null)

    }

    override val viewModelStore: ViewModelStore
        get() = _viewModelStore
    override val lifecycle: Lifecycle
        get() = dispatcher.lifecycle


    private val _viewModelStore = ViewModelStore()

    private val savedStateRegistryController = SavedStateRegistryController.create(this)
    override val savedStateRegistry: SavedStateRegistry get() = savedStateRegistryController.savedStateRegistry

    private fun getImeOption(): Int =
        if (currentInputEditorInfo.imeOptions and IME_FLAG_NO_ENTER_ACTION != 0) IME_ACTION_NONE
        else currentInputEditorInfo.imeOptions and IME_MASK_ACTION

    private fun handleEnterKey() {
        val imeOptionsActionId = getImeOption()

        if (imeOptionsActionId != IME_ACTION_NONE) {
            currentInputConnection.performEditorAction(imeOptionsActionId)
        } else {
            currentInputConnection.sendKeyEvent(KeyEvent(ACTION_DOWN, KEYCODE_ENTER))
            currentInputConnection.sendKeyEvent(KeyEvent(ACTION_UP, KEYCODE_ENTER))
        }
    }
}
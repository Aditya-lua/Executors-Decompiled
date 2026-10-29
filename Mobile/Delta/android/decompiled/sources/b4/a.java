package b4;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f3887a;
    public int b = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3888c = 0;

    /* JADX INFO: renamed from: b4.a$a, reason: collision with other inner class name */
    public static class C0070a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EditText f3889a;
        public final g b;

        public C0070a(@NonNull EditText editText, boolean z10) {
            this.f3889a = editText;
            g gVar = new g(editText, z10);
            this.b = gVar;
            editText.addTextChangedListener(gVar);
            editText.setEditableFactory(b4.b.getInstance());
        }

        @Override // b4.a.b
        public KeyListener a(KeyListener keyListener) {
            if (keyListener instanceof e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return keyListener instanceof NumberKeyListener ? keyListener : new e(keyListener);
        }

        @Override // b4.a.b
        public InputConnection b(@NonNull InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
            return inputConnection instanceof c ? inputConnection : new c(this.f3889a, inputConnection, editorInfo);
        }

        @Override // b4.a.b
        public void c(boolean z10) {
            this.b.c(z10);
        }
    }

    public static class b {
        public KeyListener a(KeyListener keyListener) {
            throw null;
        }

        public InputConnection b(@NonNull InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
            throw null;
        }

        public void c(boolean z10) {
            throw null;
        }
    }

    public a(@NonNull EditText editText, boolean z10) {
        x2.g.h(editText, "editText cannot be null");
        this.f3887a = new C0070a(editText, z10);
    }

    public KeyListener a(KeyListener keyListener) {
        return this.f3887a.a(keyListener);
    }

    public InputConnection b(InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f3887a.b(inputConnection, editorInfo);
    }

    public void c(boolean z10) {
        this.f3887a.c(z10);
    }
}

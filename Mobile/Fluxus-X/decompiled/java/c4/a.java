package c4;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f4770a;
    public int b = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4771c = 0;

    /* JADX INFO: renamed from: c4.a$a, reason: collision with other inner class name */
    public static class C0091a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EditText f4772a;
        public final g b;

        public C0091a(@NonNull EditText editText, boolean z10) {
            this.f4772a = editText;
            g gVar = new g(editText, z10);
            this.b = gVar;
            editText.addTextChangedListener(gVar);
            editText.setEditableFactory(c4.b.getInstance());
        }

        @Override // c4.a.b
        public KeyListener a(KeyListener keyListener) {
            if (keyListener instanceof e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return keyListener instanceof NumberKeyListener ? keyListener : new e(keyListener);
        }

        @Override // c4.a.b
        public InputConnection b(@NonNull InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
            return inputConnection instanceof c ? inputConnection : new c(this.f4772a, inputConnection, editorInfo);
        }

        @Override // c4.a.b
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
        this.f4770a = new C0091a(editText, z10);
    }

    public KeyListener a(KeyListener keyListener) {
        return this.f4770a.a(keyListener);
    }

    public InputConnection b(InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f4770a.b(inputConnection, editorInfo);
    }

    public void c(boolean z10) {
        this.f4770a.c(z10);
    }
}

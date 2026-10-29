package q;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final EditText f29035a;

    @NonNull
    public final b4.a b;

    public m(@NonNull EditText editText) {
        this.f29035a = editText;
        this.b = new b4.a(editText, false);
    }

    public KeyListener a(KeyListener keyListener) {
        return b(keyListener) ? this.b.a(keyListener) : keyListener;
    }

    public boolean b(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    public void c(AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = this.f29035a.getContext().obtainStyledAttributes(attributeSet, i.j.f20058i0, i10, 0);
        try {
            int i11 = i.j.f20128w0;
            boolean z10 = typedArrayObtainStyledAttributes.hasValue(i11) ? typedArrayObtainStyledAttributes.getBoolean(i11, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            e(z10);
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public InputConnection d(InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
        return this.b.b(inputConnection, editorInfo);
    }

    public void e(boolean z10) {
        this.b.c(z10);
    }
}

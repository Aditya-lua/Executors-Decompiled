package p365q;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.annotation.NonNull;
import p024b4.C1215a;
import p181i.C6598j;

/* JADX INFO: renamed from: q.m */
/* JADX INFO: loaded from: classes.dex */
public class C10387m {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final EditText f37377a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final C1215a f37378b;

    public C10387m(@NonNull EditText editText) {
        this.f37377a = editText;
        this.f37378b = new C1215a(editText, false);
    }

    /* JADX INFO: renamed from: a */
    public KeyListener m39918a(KeyListener keyListener) {
        return m39919b(keyListener) ? this.f37378b.m6831a(keyListener) : keyListener;
    }

    /* JADX INFO: renamed from: b */
    public boolean m39919b(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    /* JADX INFO: renamed from: c */
    public void m39920c(AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = this.f37377a.getContext().obtainStyledAttributes(attributeSet, C6598j.f25367i0, i10, 0);
        try {
            int i11 = C6598j.f25437w0;
            boolean z10 = typedArrayObtainStyledAttributes.hasValue(i11) ? typedArrayObtainStyledAttributes.getBoolean(i11, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            m39922e(z10);
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: d */
    public InputConnection m39921d(InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
        return this.f37378b.m6832b(inputConnection, editorInfo);
    }

    /* JADX INFO: renamed from: e */
    public void m39922e(boolean z10) {
        this.f37378b.m6833c(z10);
    }
}

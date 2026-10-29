package p024b4;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.annotation.NonNull;
import p533x2.C12637g;

/* JADX INFO: renamed from: b4.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1215a {

    /* JADX INFO: renamed from: a */
    public final b f5081a;

    /* JADX INFO: renamed from: b */
    public int f5082b = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: c */
    public int f5083c = 0;

    /* JADX INFO: renamed from: b4.a$a */
    public static class a extends b {

        /* JADX INFO: renamed from: a */
        public final EditText f5084a;

        /* JADX INFO: renamed from: b */
        public final C1221g f5085b;

        public a(@NonNull EditText editText, boolean z10) {
            this.f5084a = editText;
            C1221g c1221g = new C1221g(editText, z10);
            this.f5085b = c1221g;
            editText.addTextChangedListener(c1221g);
            editText.setEditableFactory(C1216b.getInstance());
        }

        @Override // p024b4.C1215a.b
        /* JADX INFO: renamed from: a */
        public KeyListener mo6834a(KeyListener keyListener) {
            if (keyListener instanceof C1219e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return keyListener instanceof NumberKeyListener ? keyListener : new C1219e(keyListener);
        }

        @Override // p024b4.C1215a.b
        /* JADX INFO: renamed from: b */
        public InputConnection mo6835b(@NonNull InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
            return inputConnection instanceof C1217c ? inputConnection : new C1217c(this.f5084a, inputConnection, editorInfo);
        }

        @Override // p024b4.C1215a.b
        /* JADX INFO: renamed from: c */
        public void mo6836c(boolean z10) {
            this.f5085b.m6865c(z10);
        }
    }

    /* JADX INFO: renamed from: b4.a$b */
    public static class b {
        /* JADX INFO: renamed from: a */
        public KeyListener mo6834a(KeyListener keyListener) {
            throw null;
        }

        /* JADX INFO: renamed from: b */
        public InputConnection mo6835b(@NonNull InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
            throw null;
        }

        /* JADX INFO: renamed from: c */
        public void mo6836c(boolean z10) {
            throw null;
        }
    }

    public C1215a(@NonNull EditText editText, boolean z10) {
        C12637g.m47076h(editText, "editText cannot be null");
        this.f5081a = new a(editText, z10);
    }

    /* JADX INFO: renamed from: a */
    public KeyListener m6831a(KeyListener keyListener) {
        return this.f5081a.mo6834a(keyListener);
    }

    /* JADX INFO: renamed from: b */
    public InputConnection m6832b(InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f5081a.mo6835b(inputConnection, editorInfo);
    }

    /* JADX INFO: renamed from: c */
    public void m6833c(boolean z10) {
        this.f5081a.mo6836c(z10);
    }
}

package p024b4;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.emoji2.text.C0900c;

/* JADX INFO: renamed from: b4.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1219e implements KeyListener {

    /* JADX INFO: renamed from: a */
    public final KeyListener f5095a;

    /* JADX INFO: renamed from: b */
    public final a f5096b;

    /* JADX INFO: renamed from: b4.e$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public boolean m6843a(@NonNull Editable editable, int i10, @NonNull KeyEvent keyEvent) {
            return C0900c.m4272g(editable, i10, keyEvent);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1219e(KeyListener keyListener) {
        this(keyListener, new a());
    }

    @Override // android.text.method.KeyListener
    public void clearMetaKeyState(View view, Editable editable, int i10) {
        this.f5095a.clearMetaKeyState(view, editable, i10);
    }

    @Override // android.text.method.KeyListener
    public int getInputType() {
        return this.f5095a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyDown(View view, Editable editable, int i10, KeyEvent keyEvent) {
        return this.f5096b.m6843a(editable, i10, keyEvent) || this.f5095a.onKeyDown(view, editable, i10, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f5095a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyUp(View view, Editable editable, int i10, KeyEvent keyEvent) {
        return this.f5095a.onKeyUp(view, editable, i10, keyEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C1219e(KeyListener keyListener, a aVar) {
        this.f5095a = keyListener;
        this.f5096b = aVar;
    }
}

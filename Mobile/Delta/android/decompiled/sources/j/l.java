package j;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import e.w;

/* JADX INFO: loaded from: classes.dex */
public class l extends w implements c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e f20960e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final androidx.core.view.l.a f20961f;

    public l(@NonNull Context context, int i10) {
        super(context, m(context, i10));
        this.f20961f = new androidx.core.view.l.a() { // from class: j.k
            @Override // androidx.core.view.l.a
            public final boolean D(KeyEvent keyEvent) {
                return this.f20959a.n(keyEvent);
            }
        };
        e eVarL = l();
        eVarL.K(m(context, i10));
        eVarL.w(null);
    }

    private static int m(Context context, int i10) {
        if (i10 != 0) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i.a.B, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // j.c
    public void M(o.b bVar) {
    }

    @Override // e.w, android.app.Dialog
    public void addContentView(@NonNull View view, ViewGroup.LayoutParams layoutParams) {
        h();
        l().e(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        l().x();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return androidx.core.view.l.e(this.f20961f, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i10) {
        return (T) l().j(i10);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        l().t();
    }

    @NonNull
    public e l() {
        if (this.f20960e == null) {
            this.f20960e = e.i(this, this);
        }
        return this.f20960e;
    }

    public boolean n(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean o(int i10) {
        return l().F(i10);
    }

    @Override // e.w, android.app.Dialog
    public void onCreate(Bundle bundle) {
        l().s();
        super.onCreate(bundle);
        l().w(bundle);
    }

    @Override // e.w, android.app.Dialog
    public void onStop() {
        super.onStop();
        l().C();
    }

    @Override // j.c
    public o.b s(o.b.a aVar) {
        return null;
    }

    @Override // e.w, android.app.Dialog
    public void setContentView(int i10) {
        h();
        l().G(i10);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        l().L(charSequence);
    }

    @Override // j.c
    public void x(o.b bVar) {
    }

    @Override // e.w, android.app.Dialog
    public void setContentView(@NonNull View view) {
        h();
        l().H(view);
    }

    @Override // android.app.Dialog
    public void setTitle(int i10) {
        super.setTitle(i10);
        l().L(getContext().getString(i10));
    }

    @Override // e.w, android.app.Dialog
    public void setContentView(@NonNull View view, ViewGroup.LayoutParams layoutParams) {
        h();
        l().I(view, layoutParams);
    }
}

package p203j;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.core.view.C0617l;
import p088e.DialogC4736w;
import p181i.C6589a;
import p316o.AbstractC9609b;

/* JADX INFO: renamed from: j.l */
/* JADX INFO: loaded from: classes.dex */
public class DialogC7002l extends DialogC4736w implements InterfaceC6993c {

    /* JADX INFO: renamed from: e */
    public AbstractC6995e f27389e;

    /* JADX INFO: renamed from: f */
    public final C0617l.a f27390f;

    public DialogC7002l(@NonNull Context context, int i10) {
        super(context, m29602m(context, i10));
        this.f27390f = new C0617l.a() { // from class: j.k
            @Override // androidx.core.view.C0617l.a
            /* JADX INFO: renamed from: D */
            public final boolean mo2939D(KeyEvent keyEvent) {
                return this.f27388a.m29604n(keyEvent);
            }
        };
        AbstractC6995e abstractC6995eM29603l = m29603l();
        abstractC6995eM29603l.mo29482K(m29602m(context, i10));
        abstractC6995eM29603l.mo29495w(null);
    }

    /* JADX INFO: renamed from: m */
    private static int m29602m(Context context, int i10) {
        if (i10 != 0) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C6589a.f25006B, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // p203j.InterfaceC6993c
    /* JADX INFO: renamed from: M */
    public void mo29449M(AbstractC9609b abstractC9609b) {
    }

    @Override // p088e.DialogC4736w, android.app.Dialog
    public void addContentView(@NonNull View view, ViewGroup.LayoutParams layoutParams) {
        m23107h();
        m29603l().mo29484e(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        m29603l().mo29496x();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C0617l.m2937e(this.f27390f, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i10) {
        return (T) m29603l().mo29487j(i10);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        m29603l().mo29493t();
    }

    @NonNull
    /* JADX INFO: renamed from: l */
    public AbstractC6995e m29603l() {
        if (this.f27389e == null) {
            this.f27389e = AbstractC6995e.m29468i(this, this);
        }
        return this.f27389e;
    }

    /* JADX INFO: renamed from: n */
    public boolean m29604n(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX INFO: renamed from: o */
    public boolean m29605o(int i10) {
        return m29603l().mo29477F(i10);
    }

    @Override // p088e.DialogC4736w, android.app.Dialog
    public void onCreate(Bundle bundle) {
        m29603l().mo29492s();
        super.onCreate(bundle);
        m29603l().mo29495w(bundle);
    }

    @Override // p088e.DialogC4736w, android.app.Dialog
    public void onStop() {
        super.onStop();
        m29603l().mo29476C();
    }

    @Override // p203j.InterfaceC6993c
    /* JADX INFO: renamed from: s */
    public AbstractC9609b mo29450s(AbstractC9609b.a aVar) {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p088e.DialogC4736w, android.app.Dialog
    public void setContentView(int i10) {
        m23107h();
        m29603l().mo29478G(i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        m29603l().mo29483L(charSequence);
    }

    @Override // p203j.InterfaceC6993c
    /* JADX INFO: renamed from: x */
    public void mo29457x(AbstractC9609b abstractC9609b) {
    }

    @Override // p088e.DialogC4736w, android.app.Dialog
    public void setContentView(@NonNull View view) {
        m23107h();
        m29603l().mo29479H(view);
    }

    @Override // android.app.Dialog
    public void setTitle(int i10) {
        super.setTitle(i10);
        m29603l().mo29483L(getContext().getString(i10));
    }

    @Override // p088e.DialogC4736w, android.app.Dialog
    public void setContentView(@NonNull View view, ViewGroup.LayoutParams layoutParams) {
        m23107h();
        m29603l().mo29480I(view, layoutParams);
    }
}

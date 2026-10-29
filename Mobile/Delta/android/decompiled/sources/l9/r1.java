package l9;

import android.app.Dialog;

/* JADX INFO: loaded from: classes.dex */
public final class r1 extends p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Dialog f23078a;
    public final /* synthetic */ s1 b;

    public r1(s1 s1Var, Dialog dialog) {
        this.b = s1Var;
        this.f23078a = dialog;
    }

    @Override // l9.p0
    public final void a() {
        this.b.b.o();
        if (this.f23078a.isShowing()) {
            this.f23078a.dismiss();
        }
    }
}

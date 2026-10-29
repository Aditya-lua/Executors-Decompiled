package p268l9;

import android.app.Dialog;

/* JADX INFO: renamed from: l9.r1 */
/* JADX INFO: loaded from: classes.dex */
public final class C8071r1 extends AbstractC8064p0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Dialog f30085a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ RunnableC8074s1 f30086b;

    public C8071r1(RunnableC8074s1 runnableC8074s1, Dialog dialog) {
        this.f30086b = runnableC8074s1;
        this.f30085a = dialog;
    }

    @Override // p268l9.AbstractC8064p0
    /* JADX INFO: renamed from: a */
    public final void mo33264a() {
        this.f30086b.f30090b.m33278o();
        if (this.f30085a.isShowing()) {
            this.f30085a.dismiss();
        }
    }
}

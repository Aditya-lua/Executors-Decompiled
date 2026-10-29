package p268l9;

import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: renamed from: l9.c1 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC8026c1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ BinderC8035f1 f29985a;

    public RunnableC8026c1(BinderC8035f1 binderC8035f1) {
        this.f29985a = binderC8035f1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f29985a.f30017g.mo33126c(new ConnectionResult(4));
    }
}

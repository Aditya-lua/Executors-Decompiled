package l9;

import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes.dex */
public final class c1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f1 f22997a;

    public c1(f1 f1Var) {
        this.f22997a = f1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f22997a.f23026g.c(new ConnectionResult(4));
    }
}

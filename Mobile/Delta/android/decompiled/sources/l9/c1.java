package l9;

import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes.dex */
public final class c1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f1 f23391a;

    public c1(f1 f1Var) {
        this.f23391a = f1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f23391a.f23420g.c(new ConnectionResult(4));
    }
}

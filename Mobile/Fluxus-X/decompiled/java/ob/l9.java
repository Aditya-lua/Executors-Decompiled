package ob;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class l9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f27562a;
    public final /* synthetic */ va b;

    public l9(va vaVar, long j10) {
        this.f27562a = j10;
        Objects.requireNonNull(vaVar);
        this.b = vaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l7 l7Var = this.b.f27641a;
        m6 m6Var = l7Var.x().f27692l;
        long j10 = this.f27562a;
        m6Var.b(j10);
        l7Var.a().v().b("Session timeout duration set", Long.valueOf(j10));
    }
}

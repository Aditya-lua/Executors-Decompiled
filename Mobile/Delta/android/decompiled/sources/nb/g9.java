package nb;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class g9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f25559a;
    public final /* synthetic */ qa b;

    public g9(qa qaVar, long j10) {
        this.f25559a = j10;
        Objects.requireNonNull(qaVar);
        this.b = qaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g7 g7Var = this.b.f25625a;
        h6 h6Var = g7Var.x().f25677l;
        long j10 = this.f25559a;
        h6Var.b(j10);
        g7Var.a().v().b("Session timeout duration set", Long.valueOf(j10));
    }
}

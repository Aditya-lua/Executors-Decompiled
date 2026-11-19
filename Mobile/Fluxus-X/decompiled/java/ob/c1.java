package ob;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class c1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f27140a;
    public final /* synthetic */ d2 b;

    public c1(d2 d2Var, long j10) {
        this.f27140a = j10;
        Objects.requireNonNull(d2Var);
        this.b = d2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.n(this.f27140a);
    }
}

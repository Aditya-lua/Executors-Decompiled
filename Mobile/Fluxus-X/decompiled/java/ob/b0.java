package ob;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class b0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f27098a;
    public final /* synthetic */ long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d2 f27099c;

    public b0(d2 d2Var, String str, long j10) {
        this.f27098a = str;
        this.b = j10;
        Objects.requireNonNull(d2Var);
        this.f27099c = d2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f27099c.m(this.f27098a, this.b);
    }
}

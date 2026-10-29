package nb;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class y implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f26114a;
    public final /* synthetic */ long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y1 f26115c;

    public y(y1 y1Var, String str, long j10) {
        this.f26114a = str;
        this.b = j10;
        Objects.requireNonNull(y1Var);
        this.f26115c = y1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f26115c.m(this.f26114a, this.b);
    }
}

package nb;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class dd implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f25463a;
    public final /* synthetic */ ld b;

    public dd(ld ldVar, long j10) {
        this.f25463a = j10;
        Objects.requireNonNull(ldVar);
        this.b = ldVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.s(this.f25463a);
    }
}

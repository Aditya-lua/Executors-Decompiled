package ob;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class hd implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f27420a;
    public final /* synthetic */ qd b;

    public hd(qd qdVar, long j10) {
        this.f27420a = j10;
        Objects.requireNonNull(qdVar);
        this.b = qdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.r(this.f27420a);
    }
}

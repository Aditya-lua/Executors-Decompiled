package ob;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class id implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f27479a;
    public final /* synthetic */ qd b;

    public id(qd qdVar, long j10) {
        this.f27479a = j10;
        Objects.requireNonNull(qdVar);
        this.b = qdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.s(this.f27479a);
    }
}

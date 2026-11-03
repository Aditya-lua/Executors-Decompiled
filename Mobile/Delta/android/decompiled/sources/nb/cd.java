package nb;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class cd implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f26259a;
    public final /* synthetic */ ld b;

    public cd(ld ldVar, long j10) {
        this.f26259a = j10;
        Objects.requireNonNull(ldVar);
        this.b = ldVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.r(this.f26259a);
    }
}

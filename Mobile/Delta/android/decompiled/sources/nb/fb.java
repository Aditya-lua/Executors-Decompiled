package nb;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class fb implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f26339a;
    public final /* synthetic */ jb b;

    public fb(jb jbVar, long j10) {
        this.f26339a = j10;
        Objects.requireNonNull(jbVar);
        this.b = jbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jb jbVar = this.b;
        jbVar.f26446a.M().k(this.f26339a);
        jbVar.f26454e = null;
    }
}

package nb;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class fb implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f25518a;
    public final /* synthetic */ jb b;

    public fb(jb jbVar, long j10) {
        this.f25518a = j10;
        Objects.requireNonNull(jbVar);
        this.b = jbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jb jbVar = this.b;
        jbVar.f25625a.M().k(this.f25518a);
        jbVar.f25633e = null;
    }
}

package nb;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class gb implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bb f26382a;
    public final /* synthetic */ long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ jb f26383c;

    public gb(jb jbVar, bb bbVar, long j10) {
        this.f26382a = bbVar;
        this.b = j10;
        Objects.requireNonNull(jbVar);
        this.f26383c = jbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jb jbVar = this.f26383c;
        jbVar.C(this.f26382a, false, this.b);
        jbVar.f26454e = null;
        jbVar.f26446a.J().u(null);
    }
}

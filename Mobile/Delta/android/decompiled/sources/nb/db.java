package nb;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class db implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bb f25455a;
    public final /* synthetic */ bb b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f25456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f25457d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jb f25458e;

    public db(jb jbVar, bb bbVar, bb bbVar2, long j10, boolean z10) {
        this.f25455a = bbVar;
        this.b = bbVar2;
        this.f25456c = j10;
        this.f25457d = z10;
        Objects.requireNonNull(jbVar);
        this.f25458e = jbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f25458e.B(this.f25455a, this.b, this.f25456c, this.f25457d, null);
    }
}

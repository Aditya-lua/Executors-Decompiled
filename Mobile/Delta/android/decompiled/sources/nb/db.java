package nb;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class db implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bb f26276a;
    public final /* synthetic */ bb b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f26277c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f26278d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jb f26279e;

    public db(jb jbVar, bb bbVar, bb bbVar2, long j10, boolean z10) {
        this.f26276a = bbVar;
        this.b = bbVar2;
        this.f26277c = j10;
        this.f26278d = z10;
        Objects.requireNonNull(jbVar);
        this.f26279e = jbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f26279e.B(this.f26276a, this.b, this.f26277c, this.f26278d, null);
    }
}

package ob;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class sb implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hf f27798a;
    public final /* synthetic */ boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bf f27799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yc f27800d;

    public sb(yc ycVar, hf hfVar, boolean z10, bf bfVar) {
        this.f27798a = hfVar;
        this.b = z10;
        this.f27799c = bfVar;
        Objects.requireNonNull(ycVar);
        this.f27800d = ycVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yc ycVar = this.f27800d;
        i5 i5VarN = ycVar.N();
        if (i5VarN == null) {
            ycVar.f27641a.a().o().a("Discarding data. Failed to set user property");
            return;
        }
        hf hfVar = this.f27798a;
        o9.s.l(hfVar);
        ycVar.b0(i5VarN, this.b ? null : this.f27799c, hfVar);
        ycVar.J();
    }
}

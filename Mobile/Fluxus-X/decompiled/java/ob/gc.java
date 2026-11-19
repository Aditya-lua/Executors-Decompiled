package ob;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class gc implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hf f27359a;
    public final /* synthetic */ boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f27360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yc f27361d;

    public gc(yc ycVar, boolean z10, hf hfVar, boolean z11, i iVar, i iVar2) {
        this.f27359a = hfVar;
        this.b = z11;
        this.f27360c = iVar;
        Objects.requireNonNull(ycVar);
        this.f27361d = ycVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yc ycVar = this.f27361d;
        i5 i5VarN = ycVar.N();
        if (i5VarN == null) {
            ycVar.f27641a.a().o().a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        hf hfVar = this.f27359a;
        o9.s.l(hfVar);
        ycVar.b0(i5VarN, this.b ? null : this.f27360c, hfVar);
        ycVar.J();
    }
}

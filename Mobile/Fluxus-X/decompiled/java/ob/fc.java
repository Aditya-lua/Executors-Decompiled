package ob;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class fc implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hf f27327a;
    public final /* synthetic */ boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i0 f27328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yc f27329d;

    public fc(yc ycVar, boolean z10, hf hfVar, boolean z11, i0 i0Var, String str) {
        this.f27327a = hfVar;
        this.b = z11;
        this.f27328c = i0Var;
        Objects.requireNonNull(ycVar);
        this.f27329d = ycVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yc ycVar = this.f27329d;
        i5 i5VarN = ycVar.N();
        if (i5VarN == null) {
            ycVar.f27641a.a().o().a("Discarding data. Failed to send event to service");
            return;
        }
        hf hfVar = this.f27327a;
        o9.s.l(hfVar);
        ycVar.b0(i5VarN, this.b ? null : this.f27328c, hfVar);
        ycVar.J();
    }
}

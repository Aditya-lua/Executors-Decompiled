package p306nb;

import java.util.Objects;

/* JADX INFO: renamed from: nb.d9 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9046d9 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f32846a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C9257qa f32847b;

    public RunnableC9046d9(C9257qa c9257qa, boolean z10) {
        this.f32846a = z10;
        Objects.requireNonNull(c9257qa);
        this.f32847b = c9257qa;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9257qa c9257qa = this.f32847b;
        C9094g7 c9094g7 = c9257qa.f33067a;
        boolean zM36327g = c9094g7.m36327g();
        boolean zM36326f = c9094g7.m36326f();
        boolean z10 = this.f32846a;
        c9094g7.m36320P(z10);
        if (zM36326f == z10) {
            c9094g7.mo36321a().m37011w().m36912b("Default data collection state already set to", Boolean.valueOf(z10));
        }
        if (c9094g7.m36327g() == zM36327g || c9094g7.m36327g() != c9094g7.m36326f()) {
            c9094g7.mo36321a().m37008t().m36913c("Default data collection is different than actual status", Boolean.valueOf(z10), Boolean.valueOf(zM36327g));
        }
        c9257qa.m36686Y();
    }
}

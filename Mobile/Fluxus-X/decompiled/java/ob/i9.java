package ob;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class i9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f27469a;
    public final /* synthetic */ va b;

    public i9(va vaVar, boolean z10) {
        this.f27469a = z10;
        Objects.requireNonNull(vaVar);
        this.b = vaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        va vaVar = this.b;
        l7 l7Var = vaVar.f27641a;
        boolean zG = l7Var.g();
        boolean zF = l7Var.f();
        boolean z10 = this.f27469a;
        l7Var.P(z10);
        if (zF == z10) {
            l7Var.a().w().b("Default data collection state already set to", Boolean.valueOf(z10));
        }
        if (l7Var.g() == zG || l7Var.g() != l7Var.f()) {
            l7Var.a().t().c("Default data collection is different than actual status", Boolean.valueOf(z10), Boolean.valueOf(zG));
        }
        vaVar.Y();
    }
}

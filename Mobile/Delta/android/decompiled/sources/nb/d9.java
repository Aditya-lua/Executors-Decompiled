package nb;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class d9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f25453a;
    public final /* synthetic */ qa b;

    public d9(qa qaVar, boolean z10) {
        this.f25453a = z10;
        Objects.requireNonNull(qaVar);
        this.b = qaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qa qaVar = this.b;
        g7 g7Var = qaVar.f25625a;
        boolean zG = g7Var.g();
        boolean zF = g7Var.f();
        boolean z10 = this.f25453a;
        g7Var.P(z10);
        if (zF == z10) {
            g7Var.a().w().b("Default data collection state already set to", Boolean.valueOf(z10));
        }
        if (g7Var.g() == zG || g7Var.g() != g7Var.f()) {
            g7Var.a().t().c("Default data collection is different than actual status", Boolean.valueOf(z10), Boolean.valueOf(zG));
        }
        qaVar.Y();
    }
}

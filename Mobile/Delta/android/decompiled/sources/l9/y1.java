package l9;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class y1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f23501a;
    public final /* synthetic */ String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z1 f23502c;

    public y1(z1 z1Var, i iVar, String str) {
        this.f23501a = iVar;
        this.b = str;
        Objects.requireNonNull(z1Var);
        this.f23502c = z1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        z1 z1Var = this.f23502c;
        if (z1Var.k() > 0) {
            i iVar = this.f23501a;
            if (z1Var.l() != null) {
                bundle = z1Var.l().getBundle(this.b);
            } else {
                bundle = null;
            }
            iVar.f(bundle);
        }
        if (z1Var.k() >= 2) {
            this.f23501a.j();
        }
        if (z1Var.k() >= 3) {
            this.f23501a.h();
        }
        if (z1Var.k() >= 4) {
            this.f23501a.k();
        }
        if (z1Var.k() >= 5) {
            this.f23501a.g();
        }
    }
}

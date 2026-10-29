package b1;

import java.util.UUID;
import n0.d2;
import n0.o0;
import p0.a0;

/* JADX INFO: loaded from: classes.dex */
public class q extends d2 {
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3824c;

    public q(o0 o0Var) {
        super(o0Var);
        this.b = "virtual-" + o0Var.e() + "-" + UUID.randomUUID().toString();
    }

    public void B(int i10) {
        this.f3824c = i10;
    }

    @Override // n0.d2, g0.t
    public int d() {
        return w(0);
    }

    @Override // n0.d2, n0.o0
    public String e() {
        return this.b;
    }

    @Override // n0.d2, g0.t
    public int w(int i10) {
        return a0.w(super.w(i10) - this.f3824c);
    }
}

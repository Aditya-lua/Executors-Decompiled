package p296n0;

import p140g0.InterfaceC5872c2;
import p533x2.C12637g;

/* JADX INFO: renamed from: n0.b4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8729b4 implements InterfaceC5872c2 {

    /* JADX INFO: renamed from: d */
    public final long f31771d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC5872c2 f31772e;

    public C8729b4(long j10, InterfaceC5872c2 interfaceC5872c2) {
        C12637g.m47070b(j10 >= 0, "Timeout must be non-negative.");
        this.f31771d = j10;
        this.f31772e = interfaceC5872c2;
    }

    @Override // p140g0.InterfaceC5872c2
    /* JADX INFO: renamed from: a */
    public long mo26317a() {
        return this.f31771d;
    }

    @Override // p140g0.InterfaceC5872c2
    /* JADX INFO: renamed from: e */
    public InterfaceC5872c2.c mo26311e(InterfaceC5872c2.b bVar) {
        InterfaceC5872c2.c cVarMo26311e = this.f31772e.mo26311e(bVar);
        return (mo26317a() <= 0 || bVar.mo26321o() < mo26317a() - cVarMo26311e.m26323b()) ? cVarMo26311e : InterfaceC5872c2.c.f22393d;
    }
}

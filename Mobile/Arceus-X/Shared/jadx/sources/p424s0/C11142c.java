package p424s0;

import android.graphics.Matrix;
import p140g0.InterfaceC5895i1;
import p296n0.C8857z3;
import p296n0.InterfaceC8743e0;
import p347p0.C10093i;

/* JADX INFO: renamed from: s0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C11142c implements InterfaceC5895i1 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC8743e0 f39350a;

    public C11142c(InterfaceC8743e0 interfaceC8743e0) {
        this.f39350a = interfaceC8743e0;
    }

    @Override // p140g0.InterfaceC5895i1
    /* JADX INFO: renamed from: a */
    public void mo26498a(C10093i.b bVar) {
        this.f39350a.mo35072a(bVar);
    }

    @Override // p140g0.InterfaceC5895i1
    /* JADX INFO: renamed from: b */
    public int mo26440b() {
        return this.f39350a.mo6734b().m35035b();
    }

    @Override // p140g0.InterfaceC5895i1
    /* JADX INFO: renamed from: c */
    public C8857z3 mo26441c() {
        return this.f39350a.mo6735c();
    }

    @Override // p140g0.InterfaceC5895i1
    /* JADX INFO: renamed from: d */
    public int mo26442d() {
        return 0;
    }

    @Override // p140g0.InterfaceC5895i1
    /* JADX INFO: renamed from: e */
    public Matrix mo26443e() {
        return new Matrix();
    }

    /* JADX INFO: renamed from: f */
    public InterfaceC8743e0 m41941f() {
        return this.f39350a;
    }

    @Override // p140g0.InterfaceC5895i1
    public long getTimestamp() {
        return this.f39350a.getTimestamp();
    }
}

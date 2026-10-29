package p140g0;

import android.graphics.Matrix;
import p296n0.C8857z3;
import p347p0.C10093i;

/* JADX INFO: renamed from: g0.o1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5919o1 implements InterfaceC5895i1 {
    /* JADX INFO: renamed from: f */
    public static InterfaceC5895i1 m26552f(C8857z3 c8857z3, long j10, int i10, Matrix matrix, int i11) {
        return new C5885g(c8857z3, j10, i10, matrix, i11);
    }

    @Override // p140g0.InterfaceC5895i1
    /* JADX INFO: renamed from: a */
    public void mo26498a(C10093i.b bVar) {
        bVar.m38978m(mo26442d());
    }

    @Override // p140g0.InterfaceC5895i1
    /* JADX INFO: renamed from: b */
    public abstract int mo26440b();

    @Override // p140g0.InterfaceC5895i1
    /* JADX INFO: renamed from: c */
    public abstract C8857z3 mo26441c();

    @Override // p140g0.InterfaceC5895i1
    /* JADX INFO: renamed from: d */
    public abstract int mo26442d();

    @Override // p140g0.InterfaceC5895i1
    /* JADX INFO: renamed from: e */
    public abstract Matrix mo26443e();

    @Override // p140g0.InterfaceC5895i1
    public abstract long getTimestamp();
}

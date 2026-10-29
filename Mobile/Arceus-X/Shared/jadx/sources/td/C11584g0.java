package td;

import android.os.RemoteException;
import ee.InterfaceC5080l0;
import sb.C11264k;

/* JADX INFO: renamed from: td.g0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C11584g0 extends AbstractC11602m0 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f40947c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C11264k f40948d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C11605n0 f40949e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11584g0(C11605n0 c11605n0, C11264k c11264k, int i10, long j10, C11264k c11264k2) {
        super(c11605n0, c11264k);
        this.f40947c = j10;
        this.f40948d = c11264k2;
        this.f40949e = c11605n0;
    }

    @Override // ee.AbstractRunnableC5098u0
    /* JADX INFO: renamed from: b */
    public final void mo23771b() {
        if (C11605n0.m43275j(this.f40949e)) {
            super.mo23843a(new C11568b(-2, null));
            return;
        }
        if (C11605n0.m43274i(this.f40949e, 0)) {
            super.mo23843a(new C11568b(-14, null));
            return;
        }
        try {
            C11605n0 c11605n0 = this.f40949e;
            ((InterfaceC5080l0) c11605n0.f40993f.m23792e()).mo23811L0(C11605n0.m43269b(c11605n0, this.f40947c, 0), new BinderC11599l0(this.f40949e, this.f40948d));
        } catch (RemoteException e10) {
            this.f40949e.f40988a.m23840b(e10, "warmUpIntegrityToken(%s)", Long.valueOf(this.f40947c));
            this.f40948d.m42329d(new C11568b(-100, e10));
        }
    }
}

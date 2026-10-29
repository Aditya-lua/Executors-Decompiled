package td;

import android.os.RemoteException;
import ee.InterfaceC5080l0;
import sb.C11264k;

/* JADX INFO: renamed from: td.h0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C11587h0 extends AbstractC11602m0 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC11571c.d f40951c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f40952d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ long f40953e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C11264k f40954f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C11605n0 f40955g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11587h0(C11605n0 c11605n0, C11264k c11264k, int i10, InterfaceC11571c.d dVar, long j10, long j11, C11264k c11264k2) {
        super(c11605n0, c11264k);
        this.f40951c = dVar;
        this.f40952d = j10;
        this.f40953e = j11;
        this.f40954f = c11264k2;
        this.f40955g = c11605n0;
    }

    @Override // ee.AbstractRunnableC5098u0
    /* JADX INFO: renamed from: b */
    public final void mo23771b() {
        if (C11605n0.m43275j(this.f40955g)) {
            super.mo23843a(new C11568b(-2, null));
            return;
        }
        if (C11605n0.m43274i(this.f40955g, 0)) {
            super.mo23843a(new C11568b(-14, null));
            return;
        }
        try {
            C11605n0 c11605n0 = this.f40955g;
            ((InterfaceC5080l0) c11605n0.f40993f.m23792e()).mo23812m1(C11605n0.m43268a(c11605n0, this.f40951c, this.f40952d, this.f40953e, 0), new BinderC11596k0(this.f40955g, this.f40954f, this.f40952d));
        } catch (RemoteException e10) {
            this.f40955g.f40988a.m23840b(e10, "requestExpressIntegrityToken(%s, %s, %s)", this.f40951c.mo43239b(), this.f40951c.mo43240c(), Long.valueOf(this.f40952d));
            this.f40954f.m42329d(new C11568b(-100, e10));
        }
    }
}

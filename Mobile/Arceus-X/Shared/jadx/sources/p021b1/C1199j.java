package p021b1;

import java.util.Collection;
import ne.InterfaceFutureC9440x;
import p140g0.AbstractC5952w2;
import p296n0.InterfaceC8722a3;
import p296n0.InterfaceC8784l0;
import p296n0.InterfaceC8799o0;
import p296n0.InterfaceC8804p0;
import p347p0.C10110z;

/* JADX INFO: renamed from: b1.j */
/* JADX INFO: loaded from: classes.dex */
public class C1199j implements InterfaceC8804p0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC8804p0 f4984a;

    /* JADX INFO: renamed from: b */
    public final C1205p f4985b;

    /* JADX INFO: renamed from: c */
    public final C1206q f4986c;

    /* JADX INFO: renamed from: d */
    public final AbstractC5952w2.c f4987d;

    public C1199j(InterfaceC8804p0 interfaceC8804p0, AbstractC5952w2.c cVar, C1196g.a aVar) {
        this.f4984a = interfaceC8804p0;
        this.f4987d = cVar;
        this.f4985b = new C1205p(interfaceC8804p0.mo6694e(), aVar);
        this.f4986c = new C1206q(interfaceC8804p0.mo6698k());
    }

    @Override // p296n0.InterfaceC8804p0
    /* JADX INFO: renamed from: a */
    public InterfaceFutureC9440x<Void> mo6692a() {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // p296n0.InterfaceC8804p0
    /* JADX INFO: renamed from: b */
    public InterfaceC8722a3<InterfaceC8804p0.a> mo6693b() {
        return this.f4984a.mo6693b();
    }

    @Override // p296n0.InterfaceC8804p0
    /* JADX INFO: renamed from: e */
    public InterfaceC8784l0 mo6694e() {
        return this.f4985b;
    }

    @Override // p140g0.AbstractC5952w2.c
    /* JADX INFO: renamed from: g */
    public void mo6695g(AbstractC5952w2 abstractC5952w2) {
        C10110z.m39008b();
        this.f4987d.mo6695g(abstractC5952w2);
    }

    @Override // p296n0.InterfaceC8804p0
    /* JADX INFO: renamed from: i */
    public void mo6696i(Collection<AbstractC5952w2> collection) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // p296n0.InterfaceC8804p0
    /* JADX INFO: renamed from: j */
    public void mo6697j(Collection<AbstractC5952w2> collection) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // p296n0.InterfaceC8804p0
    /* JADX INFO: renamed from: k */
    public InterfaceC8799o0 mo6698k() {
        return this.f4986c;
    }

    @Override // p140g0.AbstractC5952w2.c
    /* JADX INFO: renamed from: m */
    public void mo6699m(AbstractC5952w2 abstractC5952w2) {
        C10110z.m39008b();
        this.f4987d.mo6699m(abstractC5952w2);
    }

    @Override // p140g0.AbstractC5952w2.c
    /* JADX INFO: renamed from: n */
    public void mo6700n(AbstractC5952w2 abstractC5952w2) {
        C10110z.m39008b();
        this.f4987d.mo6700n(abstractC5952w2);
    }

    @Override // p296n0.InterfaceC8804p0
    /* JADX INFO: renamed from: q */
    public boolean mo6701q() {
        return false;
    }

    @Override // p140g0.AbstractC5952w2.c
    /* JADX INFO: renamed from: s */
    public void mo6702s(AbstractC5952w2 abstractC5952w2) {
        C10110z.m39008b();
        this.f4987d.mo6702s(abstractC5952w2);
    }

    /* JADX INFO: renamed from: t */
    public void m6703t(int i10) {
        this.f4986c.m6748B(i10);
    }
}

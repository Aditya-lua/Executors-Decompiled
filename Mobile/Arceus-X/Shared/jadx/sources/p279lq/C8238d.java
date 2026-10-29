package p279lq;

import p136ft.C5834h;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;
import p256ku.InterfaceC7906p0;

/* JADX INFO: renamed from: lq.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C8238d implements InterfaceC5830d<InterfaceC7906p0> {

    /* JADX INFO: renamed from: a */
    public final C8237c f30539a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<C8235a> f30540b;

    public C8238d(C8237c c8237c, InterfaceC5835i<C8235a> interfaceC5835i) {
        this.f30539a = c8237c;
        this.f30540b = interfaceC5835i;
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC7906p0 m33604a(C8237c c8237c, C8235a c8235a) {
        return (InterfaceC7906p0) C5834h.m26194e(c8237c.m33601a(c8235a));
    }

    /* JADX INFO: renamed from: b */
    public static C8238d m33605b(C8237c c8237c, InterfaceC5835i<C8235a> interfaceC5835i) {
        return new C8238d(c8237c, interfaceC5835i);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC7906p0 get() {
        return m33604a(this.f30539a, this.f30540b.get());
    }
}

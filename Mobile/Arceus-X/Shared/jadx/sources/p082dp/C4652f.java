package p082dp;

import fo.InterfaceC5720a;
import p136ft.C5834h;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;

/* JADX INFO: renamed from: dp.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C4652f implements InterfaceC5830d<InterfaceC5720a> {

    /* JADX INFO: renamed from: a */
    public final C4649c f19043a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<C4655i> f19044b;

    public C4652f(C4649c c4649c, InterfaceC5835i<C4655i> interfaceC5835i) {
        this.f19043a = c4649c;
        this.f19044b = interfaceC5835i;
    }

    /* JADX INFO: renamed from: a */
    public static C4652f m22884a(C4649c c4649c, InterfaceC5835i<C4655i> interfaceC5835i) {
        return new C4652f(c4649c, interfaceC5835i);
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC5720a m22885b(C4649c c4649c, C4655i c4655i) {
        return (InterfaceC5720a) C5834h.m26194e(c4649c.m22876c(c4655i));
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC5720a get() {
        return m22885b(this.f19043a, this.f19044b.get());
    }
}

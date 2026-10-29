package p582yn;

import p136ft.C5834h;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;

/* JADX INFO: renamed from: yn.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C13247j implements InterfaceC5830d<InterfaceC13250m> {

    /* JADX INFO: renamed from: a */
    public final C13242e f46596a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<C13237b0> f46597b;

    public C13247j(C13242e c13242e, InterfaceC5835i<C13237b0> interfaceC5835i) {
        this.f46596a = c13242e;
        this.f46597b = interfaceC5835i;
    }

    /* JADX INFO: renamed from: a */
    public static C13247j m48997a(C13242e c13242e, InterfaceC5835i<C13237b0> interfaceC5835i) {
        return new C13247j(c13242e, interfaceC5835i);
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC13250m m48998c(C13242e c13242e, C13237b0 c13237b0) {
        return (InterfaceC13250m) C5834h.m26194e(c13242e.m48984e(c13237b0));
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC13250m get() {
        return m48998c(this.f46596a, this.f46597b.get());
    }
}

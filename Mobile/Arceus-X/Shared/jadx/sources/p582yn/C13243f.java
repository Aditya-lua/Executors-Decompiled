package p582yn;

import p136ft.C5834h;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;

/* JADX INFO: renamed from: yn.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C13243f implements InterfaceC5830d<InterfaceC13248k> {

    /* JADX INFO: renamed from: a */
    public final C13242e f46588a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<C13263z> f46589b;

    public C13243f(C13242e c13242e, InterfaceC5835i<C13263z> interfaceC5835i) {
        this.f46588a = c13242e;
        this.f46589b = interfaceC5835i;
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC13248k m48985a(C13242e c13242e, C13263z c13263z) {
        return (InterfaceC13248k) C5834h.m26194e(c13242e.m48980a(c13263z));
    }

    /* JADX INFO: renamed from: b */
    public static C13243f m48986b(C13242e c13242e, InterfaceC5835i<C13263z> interfaceC5835i) {
        return new C13243f(c13242e, interfaceC5835i);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC13248k get() {
        return m48985a(this.f46588a, this.f46589b.get());
    }
}

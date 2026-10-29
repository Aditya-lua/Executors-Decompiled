package p582yn;

import p136ft.C5834h;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;

/* JADX INFO: renamed from: yn.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C13245h implements InterfaceC5830d<InterfaceC13236b> {

    /* JADX INFO: renamed from: a */
    public final C13242e f46592a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<C13255r> f46593b;

    public C13245h(C13242e c13242e, InterfaceC5835i<C13255r> interfaceC5835i) {
        this.f46592a = c13242e;
        this.f46593b = interfaceC5835i;
    }

    /* JADX INFO: renamed from: a */
    public static C13245h m48991a(C13242e c13242e, InterfaceC5835i<C13255r> interfaceC5835i) {
        return new C13245h(c13242e, interfaceC5835i);
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC13236b m48992b(C13242e c13242e, C13255r c13255r) {
        return (InterfaceC13236b) C5834h.m26194e(c13242e.m48982c(c13255r));
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC13236b get() {
        return m48992b(this.f46592a, this.f46593b.get());
    }
}

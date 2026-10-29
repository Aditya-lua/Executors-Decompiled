package p582yn;

import p136ft.C5834h;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;

/* JADX INFO: renamed from: yn.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C13244g implements InterfaceC5830d<InterfaceC13234a> {

    /* JADX INFO: renamed from: a */
    public final C13242e f46590a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<C13253p> f46591b;

    public C13244g(C13242e c13242e, InterfaceC5835i<C13253p> interfaceC5835i) {
        this.f46590a = c13242e;
        this.f46591b = interfaceC5835i;
    }

    /* JADX INFO: renamed from: a */
    public static C13244g m48988a(C13242e c13242e, InterfaceC5835i<C13253p> interfaceC5835i) {
        return new C13244g(c13242e, interfaceC5835i);
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC13234a m48989b(C13242e c13242e, C13253p c13253p) {
        return (InterfaceC13234a) C5834h.m26194e(c13242e.m48981b(c13253p));
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC13234a get() {
        return m48989b(this.f46590a, this.f46591b.get());
    }
}

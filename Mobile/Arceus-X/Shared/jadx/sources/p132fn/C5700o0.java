package p132fn;

import kn.C7640c;
import nu.InterfaceC9564b0;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;

/* JADX INFO: renamed from: fn.o0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5700o0 implements InterfaceC5830d<C5698n0> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<C5706r0> f21890a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<InterfaceC9564b0<C7640c>> f21891b;

    public C5700o0(InterfaceC5835i<C5706r0> interfaceC5835i, InterfaceC5835i<InterfaceC9564b0<C7640c>> interfaceC5835i2) {
        this.f21890a = interfaceC5835i;
        this.f21891b = interfaceC5835i2;
    }

    /* JADX INFO: renamed from: a */
    public static C5700o0 m25839a(InterfaceC5835i<C5706r0> interfaceC5835i, InterfaceC5835i<InterfaceC9564b0<C7640c>> interfaceC5835i2) {
        return new C5700o0(interfaceC5835i, interfaceC5835i2);
    }

    /* JADX INFO: renamed from: c */
    public static C5698n0 m25840c(C5706r0 c5706r0, InterfaceC9564b0<C7640c> interfaceC9564b0) {
        return new C5698n0(c5706r0, interfaceC9564b0);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C5698n0 get() {
        return m25840c(this.f21890a.get(), this.f21891b.get());
    }
}

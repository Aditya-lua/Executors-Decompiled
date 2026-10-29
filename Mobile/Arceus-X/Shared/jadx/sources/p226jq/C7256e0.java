package p226jq;

import p136ft.C5834h;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;
import p420rq.C11069c;
import p420rq.InterfaceC11067a;

/* JADX INFO: renamed from: jq.e0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7256e0 implements InterfaceC5830d<InterfaceC11067a> {

    /* JADX INFO: renamed from: a */
    public final C7252c0 f28016a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<C11069c> f28017b;

    public C7256e0(C7252c0 c7252c0, InterfaceC5835i<C11069c> interfaceC5835i) {
        this.f28016a = c7252c0;
        this.f28017b = interfaceC5835i;
    }

    /* JADX INFO: renamed from: a */
    public static C7256e0 m30255a(C7252c0 c7252c0, InterfaceC5835i<C11069c> interfaceC5835i) {
        return new C7256e0(c7252c0, interfaceC5835i);
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC11067a m30256c(C7252c0 c7252c0, C11069c c11069c) {
        return (InterfaceC11067a) C5834h.m26194e(c7252c0.m30224b(c11069c));
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC11067a get() {
        return m30256c(this.f28016a, this.f28017b.get());
    }
}

package p226jq;

import p136ft.C5834h;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;

/* JADX INFO: renamed from: jq.d0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7254d0 implements InterfaceC5830d<InterfaceC7267k> {

    /* JADX INFO: renamed from: a */
    public final C7252c0 f27997a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<C7286x> f27998b;

    public C7254d0(C7252c0 c7252c0, InterfaceC5835i<C7286x> interfaceC5835i) {
        this.f27997a = c7252c0;
        this.f27998b = interfaceC5835i;
    }

    /* JADX INFO: renamed from: a */
    public static C7254d0 m30226a(C7252c0 c7252c0, InterfaceC5835i<C7286x> interfaceC5835i) {
        return new C7254d0(c7252c0, interfaceC5835i);
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC7267k m30227b(C7252c0 c7252c0, C7286x c7286x) {
        return (InterfaceC7267k) C5834h.m26194e(c7252c0.m30223a(c7286x));
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC7267k get() {
        return m30227b(this.f27997a, this.f27998b.get());
    }
}

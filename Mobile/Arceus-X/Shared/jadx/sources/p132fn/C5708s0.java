package p132fn;

import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;
import p152go.C6159e;

/* JADX INFO: renamed from: fn.s0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5708s0 implements InterfaceC5830d<C5706r0> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<C6159e> f21939a;

    public C5708s0(InterfaceC5835i<C6159e> interfaceC5835i) {
        this.f21939a = interfaceC5835i;
    }

    /* JADX INFO: renamed from: a */
    public static C5708s0 m25877a(InterfaceC5835i<C6159e> interfaceC5835i) {
        return new C5708s0(interfaceC5835i);
    }

    /* JADX INFO: renamed from: c */
    public static C5706r0 m25878c(C6159e c6159e) {
        return new C5706r0(c6159e);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C5706r0 get() {
        return m25878c(this.f21939a.get());
    }
}

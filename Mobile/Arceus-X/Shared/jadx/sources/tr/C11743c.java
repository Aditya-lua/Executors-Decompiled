package tr;

import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;

/* JADX INFO: renamed from: tr.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C11743c implements InterfaceC5830d<C11742b.a> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<InterfaceC11741a> f41418a;

    public C11743c(InterfaceC5835i<InterfaceC11741a> interfaceC5835i) {
        this.f41418a = interfaceC5835i;
    }

    /* JADX INFO: renamed from: a */
    public static C11743c m43966a(InterfaceC5835i<InterfaceC11741a> interfaceC5835i) {
        return new C11743c(interfaceC5835i);
    }

    /* JADX INFO: renamed from: c */
    public static C11742b.a m43967c(InterfaceC11741a interfaceC11741a) {
        return new C11742b.a(interfaceC11741a);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C11742b.a get() {
        return m43967c(this.f41418a.get());
    }
}

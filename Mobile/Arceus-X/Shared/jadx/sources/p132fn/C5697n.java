package p132fn;

import kn.C7640c;
import nu.InterfaceC9564b0;
import p136ft.C5834h;
import p136ft.InterfaceC5830d;

/* JADX INFO: renamed from: fn.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C5697n implements InterfaceC5830d<InterfaceC9564b0<C7640c>> {

    /* JADX INFO: renamed from: a */
    public final C5691k f21874a;

    public C5697n(C5691k c5691k) {
        this.f21874a = c5691k;
    }

    /* JADX INFO: renamed from: a */
    public static C5697n m25831a(C5691k c5691k) {
        return new C5697n(c5691k);
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC9564b0<C7640c> m25832c(C5691k c5691k) {
        return (InterfaceC9564b0) C5834h.m26194e(c5691k.m25823c());
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC9564b0<C7640c> get() {
        return m25832c(this.f21874a);
    }
}

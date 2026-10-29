package p132fn;

import nu.InterfaceC9564b0;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;
import p229jt.C7347n;

/* JADX INFO: renamed from: fn.y */
/* JADX INFO: loaded from: classes3.dex */
public final class C5718y implements InterfaceC5830d<C5717x> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<InterfaceC9564b0<C7347n<InterfaceC5690j0>>> f21981a;

    public C5718y(InterfaceC5835i<InterfaceC9564b0<C7347n<InterfaceC5690j0>>> interfaceC5835i) {
        this.f21981a = interfaceC5835i;
    }

    /* JADX INFO: renamed from: a */
    public static C5718y m25899a(InterfaceC5835i<InterfaceC9564b0<C7347n<InterfaceC5690j0>>> interfaceC5835i) {
        return new C5718y(interfaceC5835i);
    }

    /* JADX INFO: renamed from: c */
    public static C5717x m25900c(InterfaceC9564b0<C7347n<InterfaceC5690j0>> interfaceC9564b0) {
        return new C5717x(interfaceC9564b0);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C5717x get() {
        return m25900c(this.f21981a.get());
    }
}

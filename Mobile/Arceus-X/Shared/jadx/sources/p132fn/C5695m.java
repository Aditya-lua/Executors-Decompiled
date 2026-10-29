package p132fn;

import nu.InterfaceC9564b0;
import p136ft.C5834h;
import p136ft.InterfaceC5830d;
import p229jt.C7347n;

/* JADX INFO: renamed from: fn.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C5695m implements InterfaceC5830d<InterfaceC9564b0<C7347n<InterfaceC5690j0>>> {

    /* JADX INFO: renamed from: a */
    public final C5691k f21873a;

    public C5695m(C5691k c5691k) {
        this.f21873a = c5691k;
    }

    /* JADX INFO: renamed from: a */
    public static C5695m m25828a(C5691k c5691k) {
        return new C5695m(c5691k);
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC9564b0<C7347n<InterfaceC5690j0>> m25829c(C5691k c5691k) {
        return (InterfaceC9564b0) C5834h.m26194e(c5691k.m25822b());
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC9564b0<C7347n<InterfaceC5690j0>> get() {
        return m25829c(this.f21873a);
    }
}

package p610zo;

import gp.InterfaceC6203w;
import np.C9539b;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;
import p256ku.InterfaceC7906p0;
import p471um.C11888w;

/* JADX INFO: renamed from: zo.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C13966j implements InterfaceC5830d<C13964i> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<InterfaceC6203w> f48803a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<C11888w> f48804b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5835i<C9539b> f48805c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC5835i<InterfaceC7906p0> f48806d;

    public C13966j(InterfaceC5835i<InterfaceC6203w> interfaceC5835i, InterfaceC5835i<C11888w> interfaceC5835i2, InterfaceC5835i<C9539b> interfaceC5835i3, InterfaceC5835i<InterfaceC7906p0> interfaceC5835i4) {
        this.f48803a = interfaceC5835i;
        this.f48804b = interfaceC5835i2;
        this.f48805c = interfaceC5835i3;
        this.f48806d = interfaceC5835i4;
    }

    /* JADX INFO: renamed from: a */
    public static C13966j m50479a(InterfaceC5835i<InterfaceC6203w> interfaceC5835i, InterfaceC5835i<C11888w> interfaceC5835i2, InterfaceC5835i<C9539b> interfaceC5835i3, InterfaceC5835i<InterfaceC7906p0> interfaceC5835i4) {
        return new C13966j(interfaceC5835i, interfaceC5835i2, interfaceC5835i3, interfaceC5835i4);
    }

    /* JADX INFO: renamed from: c */
    public static C13964i m50480c(InterfaceC6203w interfaceC6203w, C11888w c11888w, C9539b c9539b, InterfaceC7906p0 interfaceC7906p0) {
        return new C13964i(interfaceC6203w, c11888w, c9539b, interfaceC7906p0);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C13964i get() {
        return m50480c(this.f48803a.get(), this.f48804b.get(), this.f48805c.get(), this.f48806d.get());
    }
}

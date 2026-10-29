package p475uq;

import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;
import p152go.C6159e;
import p256ku.InterfaceC7906p0;
import p363pq.InterfaceC10311e;

/* JADX INFO: renamed from: uq.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C11931b implements InterfaceC5830d<C11930a> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<InterfaceC10311e> f42340a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<C6159e> f42341b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5835i<InterfaceC7906p0> f42342c;

    public C11931b(InterfaceC5835i<InterfaceC10311e> interfaceC5835i, InterfaceC5835i<C6159e> interfaceC5835i2, InterfaceC5835i<InterfaceC7906p0> interfaceC5835i3) {
        this.f42340a = interfaceC5835i;
        this.f42341b = interfaceC5835i2;
        this.f42342c = interfaceC5835i3;
    }

    /* JADX INFO: renamed from: a */
    public static C11931b m44532a(InterfaceC5835i<InterfaceC10311e> interfaceC5835i, InterfaceC5835i<C6159e> interfaceC5835i2, InterfaceC5835i<InterfaceC7906p0> interfaceC5835i3) {
        return new C11931b(interfaceC5835i, interfaceC5835i2, interfaceC5835i3);
    }

    /* JADX INFO: renamed from: c */
    public static C11930a m44533c(InterfaceC10311e interfaceC10311e, C6159e c6159e, InterfaceC7906p0 interfaceC7906p0) {
        return new C11930a(interfaceC10311e, c6159e, interfaceC7906p0);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C11930a get() {
        return m44533c(this.f42340a.get(), this.f42341b.get(), this.f42342c.get());
    }
}

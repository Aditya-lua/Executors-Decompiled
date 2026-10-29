package p610zo;

import com.withpersona.sdk2.inquiry.internal.C3714q;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;
import p256ku.AbstractC7888l0;

/* JADX INFO: renamed from: zo.j0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13967j0 implements InterfaceC5830d<C3714q> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<C13969k0> f48807a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<AbstractC7888l0> f48808b;

    public C13967j0(InterfaceC5835i<C13969k0> interfaceC5835i, InterfaceC5835i<AbstractC7888l0> interfaceC5835i2) {
        this.f48807a = interfaceC5835i;
        this.f48808b = interfaceC5835i2;
    }

    /* JADX INFO: renamed from: a */
    public static C13967j0 m50482a(InterfaceC5835i<C13969k0> interfaceC5835i, InterfaceC5835i<AbstractC7888l0> interfaceC5835i2) {
        return new C13967j0(interfaceC5835i, interfaceC5835i2);
    }

    /* JADX INFO: renamed from: c */
    public static C3714q m50483c(C13969k0 c13969k0, AbstractC7888l0 abstractC7888l0) {
        return new C3714q(c13969k0, abstractC7888l0);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3714q get() {
        return m50483c(this.f48807a.get(), this.f48808b.get());
    }
}

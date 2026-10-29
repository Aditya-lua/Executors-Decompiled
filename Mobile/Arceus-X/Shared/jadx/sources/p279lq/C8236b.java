package p279lq;

import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;
import p256ku.AbstractC7888l0;

/* JADX INFO: renamed from: lq.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C8236b implements InterfaceC5830d<C8235a> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<AbstractC7888l0> f30538a;

    public C8236b(InterfaceC5835i<AbstractC7888l0> interfaceC5835i) {
        this.f30538a = interfaceC5835i;
    }

    /* JADX INFO: renamed from: a */
    public static C8236b m33598a(InterfaceC5835i<AbstractC7888l0> interfaceC5835i) {
        return new C8236b(interfaceC5835i);
    }

    /* JADX INFO: renamed from: c */
    public static C8235a m33599c(AbstractC7888l0 abstractC7888l0) {
        return new C8235a(abstractC7888l0);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C8235a get() {
        return m33599c(this.f30538a.get());
    }
}

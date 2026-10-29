package p279lq;

import p136ft.C5834h;
import p136ft.InterfaceC5830d;
import p256ku.AbstractC7888l0;

/* JADX INFO: renamed from: lq.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C8240f implements InterfaceC5830d<AbstractC7888l0> {

    /* JADX INFO: renamed from: a */
    public final C8237c f30542a;

    public C8240f(C8237c c8237c) {
        this.f30542a = c8237c;
    }

    /* JADX INFO: renamed from: a */
    public static C8240f m33610a(C8237c c8237c) {
        return new C8240f(c8237c);
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC7888l0 m33611c(C8237c c8237c) {
        return (AbstractC7888l0) C5834h.m26194e(c8237c.m33603c());
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC7888l0 get() {
        return m33611c(this.f30542a);
    }
}

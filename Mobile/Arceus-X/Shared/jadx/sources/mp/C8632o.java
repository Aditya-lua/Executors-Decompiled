package mp;

import p136ft.C5834h;
import p136ft.InterfaceC5830d;
import p139g.AbstractC5854c;
import p139g.C5859h;

/* JADX INFO: renamed from: mp.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C8632o implements InterfaceC5830d<AbstractC5854c<C5859h>> {

    /* JADX INFO: renamed from: a */
    public final C8625i f31621a;

    public C8632o(C8625i c8625i) {
        this.f31621a = c8625i;
    }

    /* JADX INFO: renamed from: a */
    public static C8632o m34698a(C8625i c8625i) {
        return new C8632o(c8625i);
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC5854c<C5859h> m34699c(C8625i c8625i) {
        return (AbstractC5854c) C5834h.m26194e(c8625i.m34683b());
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC5854c<C5859h> get() {
        return m34699c(this.f31621a);
    }
}

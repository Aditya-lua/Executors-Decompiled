package mp;

import p136ft.C5834h;
import p136ft.InterfaceC5830d;
import p139g.AbstractC5854c;

/* JADX INFO: renamed from: mp.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C8621g implements InterfaceC5830d<AbstractC5854c<InterfaceC8611b>> {

    /* JADX INFO: renamed from: a */
    public final C8615d f31607a;

    public C8621g(C8615d c8615d) {
        this.f31607a = c8615d;
    }

    /* JADX INFO: renamed from: a */
    public static C8621g m34676a(C8615d c8615d) {
        return new C8621g(c8615d);
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC5854c<InterfaceC8611b> m34677b(C8615d c8615d) {
        return (AbstractC5854c) C5834h.m26194e(c8615d.m34664a());
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public AbstractC5854c<InterfaceC8611b> get() {
        return m34677b(this.f31607a);
    }
}

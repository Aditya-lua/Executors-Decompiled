package mp;

import p136ft.C5834h;
import p136ft.InterfaceC5830d;
import p139g.AbstractC5854c;

/* JADX INFO: renamed from: mp.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C8637t implements InterfaceC5830d<AbstractC5854c<String[]>> {

    /* JADX INFO: renamed from: a */
    public final C8634q f31624a;

    public C8637t(C8634q c8634q) {
        this.f31624a = c8634q;
    }

    /* JADX INFO: renamed from: a */
    public static C8637t m34708a(C8634q c8634q) {
        return new C8637t(c8634q);
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC5854c<String[]> m34709c(C8634q c8634q) {
        return (AbstractC5854c) C5834h.m26194e(c8634q.m34704a());
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC5854c<String[]> get() {
        return m34709c(this.f31624a);
    }
}

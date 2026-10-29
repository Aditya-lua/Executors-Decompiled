package mp;

import p136ft.C5834h;
import p136ft.InterfaceC5830d;
import p139g.AbstractC5854c;

/* JADX INFO: renamed from: mp.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C8631n implements InterfaceC5830d<AbstractC5854c<String[]>> {

    /* JADX INFO: renamed from: a */
    public final C8625i f31620a;

    public C8631n(C8625i c8625i) {
        this.f31620a = c8625i;
    }

    /* JADX INFO: renamed from: a */
    public static C8631n m34695a(C8625i c8625i) {
        return new C8631n(c8625i);
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC5854c<String[]> m34696c(C8625i c8625i) {
        return (AbstractC5854c) C5834h.m26194e(c8625i.m34682a());
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC5854c<String[]> get() {
        return m34696c(this.f31620a);
    }
}

package mp;

import p136ft.C5834h;
import p136ft.InterfaceC5830d;
import p139g.AbstractC5854c;

/* JADX INFO: renamed from: mp.z */
/* JADX INFO: loaded from: classes3.dex */
public final class C8643z implements InterfaceC5830d<AbstractC5854c<String>> {

    /* JADX INFO: renamed from: a */
    public final C8640w f31632a;

    public C8643z(C8640w c8640w) {
        this.f31632a = c8640w;
    }

    /* JADX INFO: renamed from: a */
    public static C8643z m34717a(C8640w c8640w) {
        return new C8643z(c8640w);
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC5854c<String> m34718c(C8640w c8640w) {
        return (AbstractC5854c) C5834h.m26194e(c8640w.m34713a());
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC5854c<String> get() {
        return m34718c(this.f31632a);
    }
}

package mp;

import androidx.activity.result.IntentSenderRequest;
import p136ft.C5834h;
import p136ft.InterfaceC5830d;
import p139g.AbstractC5854c;

/* JADX INFO: renamed from: mp.f0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8620f0 implements InterfaceC5830d<AbstractC5854c<IntentSenderRequest>> {

    /* JADX INFO: renamed from: a */
    public final C8614c0 f31606a;

    public C8620f0(C8614c0 c8614c0) {
        this.f31606a = c8614c0;
    }

    /* JADX INFO: renamed from: a */
    public static C8620f0 m34673a(C8614c0 c8614c0) {
        return new C8620f0(c8614c0);
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC5854c<IntentSenderRequest> m34674c(C8614c0 c8614c0) {
        return (AbstractC5854c) C5834h.m26194e(c8614c0.m34663a());
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC5854c<IntentSenderRequest> get() {
        return m34674c(this.f31606a);
    }
}

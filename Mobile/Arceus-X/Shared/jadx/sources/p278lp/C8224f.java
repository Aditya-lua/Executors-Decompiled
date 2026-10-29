package p278lp;

import com.withpersona.sdk2.inquiry.jpmynumber.JpMyNumberNfcReaderConfig;
import p136ft.C5834h;
import p136ft.InterfaceC5830d;
import p139g.AbstractC5854c;

/* JADX INFO: renamed from: lp.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C8224f implements InterfaceC5830d<AbstractC5854c<JpMyNumberNfcReaderConfig>> {

    /* JADX INFO: renamed from: a */
    public final C8221c f30494a;

    public C8224f(C8221c c8221c) {
        this.f30494a = c8221c;
    }

    /* JADX INFO: renamed from: a */
    public static C8224f m33565a(C8221c c8221c) {
        return new C8224f(c8221c);
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC5854c<JpMyNumberNfcReaderConfig> m33566c(C8221c c8221c) {
        return (AbstractC5854c) C5834h.m26194e(c8221c.m33561a());
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC5854c<JpMyNumberNfcReaderConfig> get() {
        return m33566c(this.f30494a);
    }
}

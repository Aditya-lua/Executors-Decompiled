package p390qp;

import com.withpersona.sdk2.inquiry.nfc.PassportNfcReaderConfig;
import p136ft.C5834h;
import p136ft.InterfaceC5830d;
import p139g.AbstractC5854c;

/* JADX INFO: renamed from: qp.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C10694h implements InterfaceC5830d<AbstractC5854c<PassportNfcReaderConfig>> {

    /* JADX INFO: renamed from: a */
    public final C10691e f38217a;

    public C10694h(C10691e c10691e) {
        this.f38217a = c10691e;
    }

    /* JADX INFO: renamed from: a */
    public static C10694h m40767a(C10691e c10691e) {
        return new C10694h(c10691e);
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC5854c<PassportNfcReaderConfig> m40768c(C10691e c10691e) {
        return (AbstractC5854c) C5834h.m26194e(c10691e.m40763a());
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC5854c<PassportNfcReaderConfig> get() {
        return m40768c(this.f38217a);
    }
}

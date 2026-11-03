package op;

import com.withpersona.sdk2.inquiry.nfc.PassportNfcReaderConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements dt.d<g.c<PassportNfcReaderConfig>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f28137a;

    public h(e eVar) {
        this.f28137a = eVar;
    }

    public static h a(e eVar) {
        return new h(eVar);
    }

    public static g.c<PassportNfcReaderConfig> c(e eVar) {
        return (g.c) dt.h.e(eVar.a());
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g.c<PassportNfcReaderConfig> get() {
        return c(this.f28137a);
    }
}

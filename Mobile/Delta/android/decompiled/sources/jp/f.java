package jp;

import com.withpersona.sdk2.inquiry.jpmynumber.JpMyNumberNfcReaderConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements dt.d<g.c<JpMyNumberNfcReaderConfig>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f22148a;

    public f(c cVar) {
        this.f22148a = cVar;
    }

    public static f a(c cVar) {
        return new f(cVar);
    }

    public static g.c<JpMyNumberNfcReaderConfig> c(c cVar) {
        return (g.c) dt.h.e(cVar.a());
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g.c<JpMyNumberNfcReaderConfig> get() {
        return c(this.f22148a);
    }
}

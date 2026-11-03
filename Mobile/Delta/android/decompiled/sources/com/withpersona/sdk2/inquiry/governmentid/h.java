package com.withpersona.sdk2.inquiry.governmentid;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements GovernmentIdAnalyzeWorker.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f10995a;

    public h(g gVar) {
        this.f10995a = gVar;
    }

    public static dt.i<GovernmentIdAnalyzeWorker.a> b(g gVar) {
        return dt.e.a(new h(gVar));
    }

    @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdAnalyzeWorker.a
    public GovernmentIdAnalyzeWorker a(IdConfig.b bVar, String str) {
        return this.f10995a.b(bVar, str);
    }
}

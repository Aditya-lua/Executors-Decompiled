package vo;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements GovernmentIdAnalyzeWorker.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f34954a;

    public q(p pVar) {
        this.f34954a = pVar;
    }

    public static wt.i<GovernmentIdAnalyzeWorker.a> b(p pVar) {
        return wt.e.a(new q(pVar));
    }

    @Override // vo.GovernmentIdAnalyzeWorker.a
    public GovernmentIdAnalyzeWorker a(IdConfig.e eVar, String str) {
        return this.f34954a.b(eVar, str);
    }
}

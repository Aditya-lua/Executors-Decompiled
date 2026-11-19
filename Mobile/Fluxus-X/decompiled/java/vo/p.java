package vo;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<Context> f34943a;
    public final wt.i<sn.h0> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wt.i<er.c> f34944c;

    public p(wt.i<Context> iVar, wt.i<sn.h0> iVar2, wt.i<er.c> iVar3) {
        this.f34943a = iVar;
        this.b = iVar2;
        this.f34944c = iVar3;
    }

    public static p a(wt.i<Context> iVar, wt.i<sn.h0> iVar2, wt.i<er.c> iVar3) {
        return new p(iVar, iVar2, iVar3);
    }

    public static GovernmentIdAnalyzeWorker c(Context context, sn.h0 h0Var, er.c cVar, IdConfig.e eVar, String str) {
        return new GovernmentIdAnalyzeWorker(context, h0Var, cVar, eVar, str);
    }

    public GovernmentIdAnalyzeWorker b(IdConfig.e eVar, String str) {
        return c(this.f34943a.get(), this.b.get(), this.f34944c.get(), eVar, str);
    }
}

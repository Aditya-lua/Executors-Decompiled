package cp;

import android.content.Context;
import sn.h0;
import vo.IdConfig;
import wt.i;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<Context> f11505a;
    public final i<h0> b;

    public b(i<Context> iVar, i<h0> iVar2) {
        this.f11505a = iVar;
        this.b = iVar2;
    }

    public static b a(i<Context> iVar, i<h0> iVar2) {
        return new b(iVar, iVar2);
    }

    public static GovernmentIdHintWorker c(Context context, h0 h0Var, IdConfig.e eVar) {
        return new GovernmentIdHintWorker(context, h0Var, eVar);
    }

    public GovernmentIdHintWorker b(IdConfig.e eVar) {
        return c(this.f11505a.get(), this.b.get(), eVar);
    }
}

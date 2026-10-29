package oo;

import android.content.Context;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import fn.x;
import ft.i;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<Context> f27566a;
    public final i<x> b;

    public b(i<Context> iVar, i<x> iVar2) {
        this.f27566a = iVar;
        this.b = iVar2;
    }

    public static b a(i<Context> iVar, i<x> iVar2) {
        return new b(iVar, iVar2);
    }

    public static GovernmentIdHintWorker c(Context context, x xVar, IdConfig.b bVar) {
        return new GovernmentIdHintWorker(context, xVar, bVar);
    }

    public GovernmentIdHintWorker b(IdConfig.b bVar) {
        return c(this.f27566a.get(), this.b.get(), bVar);
    }
}

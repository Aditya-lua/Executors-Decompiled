package zd;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class b0 implements ae.y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ae.y0 f37454a;

    public b0(ae.y0 y0Var) {
        this.f37454a = y0Var;
    }

    @Override // ae.y0, ae.u0
    public final /* bridge */ /* synthetic */ Object zza() {
        Context contextA = ((k) this.f37454a).a();
        return new a0(contextA, contextA.getPackageName());
    }
}

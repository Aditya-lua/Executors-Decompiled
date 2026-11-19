package ce;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class b0 implements de.y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final de.y0 f4957a;

    public b0(de.y0 y0Var) {
        this.f4957a = y0Var;
    }

    @Override // de.y0
    public final /* bridge */ /* synthetic */ Object zza() {
        Context contextA = ((k) this.f4957a).a();
        return new a0(contextA, contextA.getPackageName());
    }
}

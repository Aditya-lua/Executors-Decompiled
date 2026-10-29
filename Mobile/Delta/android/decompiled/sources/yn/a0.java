package yn;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 implements ft.d<z> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.i<Context> f35987a;

    public a0(ft.i<Context> iVar) {
        this.f35987a = iVar;
    }

    public static a0 a(ft.i<Context> iVar) {
        return new a0(iVar);
    }

    public static z c(Context context) {
        return new z(context);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public z get() {
        return c(this.f35987a.get());
    }
}

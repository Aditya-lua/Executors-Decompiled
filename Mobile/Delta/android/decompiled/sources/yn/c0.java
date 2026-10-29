package yn;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 implements ft.d<b0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.i<Context> f35992a;

    public c0(ft.i<Context> iVar) {
        this.f35992a = iVar;
    }

    public static c0 a(ft.i<Context> iVar) {
        return new c0(iVar);
    }

    public static b0 c(Context context) {
        return new b0(context);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b0 get() {
        return c(this.f35992a.get());
    }
}

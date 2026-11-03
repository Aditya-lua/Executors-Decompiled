package wn;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 implements dt.d<b0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dt.i<Context> f34621a;

    public c0(dt.i<Context> iVar) {
        this.f34621a = iVar;
    }

    public static c0 a(dt.i<Context> iVar) {
        return new c0(iVar);
    }

    public static b0 c(Context context) {
        return new b0(context);
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b0 get() {
        return c(this.f34621a.get());
    }
}

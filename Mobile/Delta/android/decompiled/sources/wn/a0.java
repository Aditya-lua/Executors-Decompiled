package wn;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 implements dt.d<z> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dt.i<Context> f34616a;

    public a0(dt.i<Context> iVar) {
        this.f34616a = iVar;
    }

    public static a0 a(dt.i<Context> iVar) {
        return new a0(iVar);
    }

    public static z c(Context context) {
        return new z(context);
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public z get() {
        return c(this.f34616a.get());
    }
}

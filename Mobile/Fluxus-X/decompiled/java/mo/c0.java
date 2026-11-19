package mo;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 implements wt.d<b0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<Context> f23405a;

    public c0(wt.i<Context> iVar) {
        this.f23405a = iVar;
    }

    public static c0 a(wt.i<Context> iVar) {
        return new c0(iVar);
    }

    public static b0 c(Context context) {
        return new b0(context);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b0 get() {
        return c(this.f23405a.get());
    }
}

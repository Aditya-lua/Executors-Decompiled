package mo;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 implements wt.d<z> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<Context> f23400a;

    public a0(wt.i<Context> iVar) {
        this.f23400a = iVar;
    }

    public static a0 a(wt.i<Context> iVar) {
        return new a0(iVar);
    }

    public static z c(Context context) {
        return new z(context);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public z get() {
        return c(this.f23400a.get());
    }
}

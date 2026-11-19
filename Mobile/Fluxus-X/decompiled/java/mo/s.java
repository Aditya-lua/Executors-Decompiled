package mo;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements wt.d<r> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<Context> f23426a;

    public s(wt.i<Context> iVar) {
        this.f23426a = iVar;
    }

    public static s a(wt.i<Context> iVar) {
        return new s(iVar);
    }

    public static r c(Context context) {
        return new r(context);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public r get() {
        return c(this.f23426a.get());
    }
}

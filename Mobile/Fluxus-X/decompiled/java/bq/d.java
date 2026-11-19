package bq;

import android.content.Context;
import wt.i;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements wt.d<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<Context> f4550a;

    public d(i<Context> iVar) {
        this.f4550a = iVar;
    }

    public static d a(i<Context> iVar) {
        return new d(iVar);
    }

    public static b c(Context context) {
        return new b(context);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b get() {
        return c(this.f4550a.get());
    }
}

package lp;

import android.content.Context;
import dt.i;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements dt.d<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<Context> f23917a;

    public d(i<Context> iVar) {
        this.f23917a = iVar;
    }

    public static d a(i<Context> iVar) {
        return new d(iVar);
    }

    public static b c(Context context) {
        return new b(context);
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b get() {
        return c(this.f23917a.get());
    }
}

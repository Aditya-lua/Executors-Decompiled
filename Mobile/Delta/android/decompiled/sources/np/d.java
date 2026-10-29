package np;

import android.content.Context;
import ft.i;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements ft.d<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<Context> f26628a;

    public d(i<Context> iVar) {
        this.f26628a = iVar;
    }

    public static d a(i<Context> iVar) {
        return new d(iVar);
    }

    public static b c(Context context) {
        return new b(context);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b get() {
        return c(this.f26628a.get());
    }
}

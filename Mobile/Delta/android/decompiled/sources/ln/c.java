package ln;

import android.content.Context;
import ft.d;
import ft.i;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements d<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<Context> f23373a;

    public c(i<Context> iVar) {
        this.f23373a = iVar;
    }

    public static c a(i<Context> iVar) {
        return new c(iVar);
    }

    public static b c(Context context) {
        return new b(context);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b get() {
        return c(this.f23373a.get());
    }
}

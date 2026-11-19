package la;

import android.content.Intent;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public class m extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tb.k f22031a;

    public m(tb.k kVar) {
        this.f22031a = kVar;
    }

    public void E(f fVar) {
        P0(new Status(10));
    }

    @Override // la.w
    public final void P0(Status status) {
        this.f22031a.d(o9.b.a(status));
    }

    public void g(Intent intent) {
        P0(new Status(10));
    }
}

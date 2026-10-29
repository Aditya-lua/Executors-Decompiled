package p358pd;

import android.os.Bundle;
import java.util.Objects;
import p193ib.C6722d;
import p193ib.C6733o;
import p378qd.InterfaceC10504b;
import sb.C11264k;

/* JADX INFO: renamed from: pd.k */
/* JADX INFO: loaded from: classes2.dex */
public final class BinderC10206k extends InterfaceC10504b.a {

    /* JADX INFO: renamed from: a */
    public final C6722d f36805a;

    /* JADX INFO: renamed from: b */
    public final C11264k f36806b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C10207l f36807c;

    public BinderC10206k(C10207l c10207l, C11264k c11264k) {
        Objects.requireNonNull(c10207l);
        this.f36807c = c10207l;
        this.f36805a = new C6722d("OnCheckAgeSignalsCallback");
        this.f36806b = c11264k;
    }

    @Override // p378qd.InterfaceC10504b
    /* JADX INFO: renamed from: C0 */
    public final void mo39290C0(Bundle bundle) {
        C6733o c6733o = this.f36807c.f36810b;
        C11264k c11264k = this.f36806b;
        c6733o.m28846u(c11264k);
        int i10 = bundle.getInt("error.code");
        this.f36805a.m28819a("onError(%d)", Integer.valueOf(i10));
        c11264k.m42329d(new C10196a(i10));
    }

    @Override // p378qd.InterfaceC10504b
    /* JADX INFO: renamed from: O */
    public final void mo39291O(Bundle bundle) {
        C6733o c6733o = this.f36807c.f36810b;
        C11264k c11264k = this.f36806b;
        c6733o.m28846u(c11264k);
        this.f36805a.m28821c("onCompleteCheckAgeSignals", new Object[0]);
        c11264k.m42330e(AbstractC10200e.m39277g(bundle));
    }
}

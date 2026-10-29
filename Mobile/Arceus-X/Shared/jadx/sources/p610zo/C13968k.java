package p610zo;

import com.withpersona.sdk2.inquiry.internal.C3677f;
import com.withpersona.sdk2.inquiry.internal.network.C3706e;
import p136ft.InterfaceC5835i;

/* JADX INFO: renamed from: zo.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C13968k {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<C3706e> f48809a;

    public C13968k(InterfaceC5835i<C3706e> interfaceC5835i) {
        this.f48809a = interfaceC5835i;
    }

    /* JADX INFO: renamed from: a */
    public static C13968k m50485a(InterfaceC5835i<C3706e> interfaceC5835i) {
        return new C13968k(interfaceC5835i);
    }

    /* JADX INFO: renamed from: c */
    public static C3677f m50486c(String str, C3706e c3706e) {
        return new C3677f(str, c3706e);
    }

    /* JADX INFO: renamed from: b */
    public C3677f m50487b(String str) {
        return m50486c(str, this.f48809a.get());
    }
}

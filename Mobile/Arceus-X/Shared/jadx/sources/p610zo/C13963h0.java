package p610zo;

import com.withpersona.sdk2.inquiry.internal.C3694m;
import com.withpersona.sdk2.inquiry.internal.network.C3706e;
import p136ft.InterfaceC5835i;

/* JADX INFO: renamed from: zo.h0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13963h0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<C3706e> f48779a;

    public C13963h0(InterfaceC5835i<C3706e> interfaceC5835i) {
        this.f48779a = interfaceC5835i;
    }

    /* JADX INFO: renamed from: a */
    public static C13963h0 m50464a(InterfaceC5835i<C3706e> interfaceC5835i) {
        return new C13963h0(interfaceC5835i);
    }

    /* JADX INFO: renamed from: c */
    public static C3694m m50465c(String str, C3706e c3706e) {
        return new C3694m(str, c3706e);
    }

    /* JADX INFO: renamed from: b */
    public C3694m m50466b(String str) {
        return m50465c(str, this.f48779a.get());
    }
}

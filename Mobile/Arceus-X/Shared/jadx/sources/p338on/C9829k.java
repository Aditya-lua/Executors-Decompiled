package p338on;

import p388qn.AbstractC10623s;
import sn.C11424h;
import sn.InterfaceC11422f;

/* JADX INFO: renamed from: on.k */
/* JADX INFO: loaded from: classes3.dex */
public class C9829k implements InterfaceC11422f {

    /* JADX INFO: renamed from: a */
    public final a f35636a;

    /* JADX INFO: renamed from: b */
    public final AbstractC10623s f35637b;

    /* JADX INFO: renamed from: c */
    public final C11424h f35638c;

    /* JADX INFO: renamed from: d */
    public boolean f35639d = false;

    /* JADX INFO: renamed from: on.k$a */
    public enum a {
        WRAP,
        REPLACE
    }

    public C9829k(a aVar, AbstractC10623s abstractC10623s, C11424h c11424h) {
        this.f35636a = aVar;
        this.f35637b = abstractC10623s;
        this.f35638c = c11424h;
    }

    @Override // sn.InterfaceC11422f
    /* JADX INFO: renamed from: b */
    public InterfaceC11422f mo38697b() {
        this.f35639d = true;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public AbstractC10623s m38698d() {
        return this.f35637b;
    }

    /* JADX INFO: renamed from: e */
    public C11424h m38699e() {
        return this.f35638c;
    }

    /* JADX INFO: renamed from: f */
    public a m38700f() {
        return this.f35636a;
    }

    /* JADX INFO: renamed from: g */
    public boolean m38701g() {
        return this.f35639d;
    }
}

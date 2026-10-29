package p306nb;

import p305n9.C8953m;
import p462u9.InterfaceC11814e;

/* JADX INFO: renamed from: nb.pd */
/* JADX INFO: loaded from: classes.dex */
public final class C9244pd {

    /* JADX INFO: renamed from: a */
    public final InterfaceC11814e f33359a;

    /* JADX INFO: renamed from: b */
    public long f33360b;

    public C9244pd(InterfaceC11814e interfaceC11814e) {
        C8953m.m36047l(interfaceC11814e);
        this.f33359a = interfaceC11814e;
    }

    /* JADX INFO: renamed from: a */
    public final void m36628a() {
        this.f33360b = this.f33359a.mo44176b();
    }

    /* JADX INFO: renamed from: b */
    public final void m36629b() {
        this.f33360b = 0L;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m36630c(long j10) {
        return this.f33360b == 0 || this.f33359a.mo44176b() - this.f33360b >= 3600000;
    }
}

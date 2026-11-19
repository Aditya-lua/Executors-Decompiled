package zr;

import android.app.Application;
import av.p0;
import mv.d0;
import wt.i;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements wt.d<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<d0> f39467a;
    public final i<Application> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i<p0> f39468c;

    public f(i<d0> iVar, i<Application> iVar2, i<p0> iVar3) {
        this.f39467a = iVar;
        this.b = iVar2;
        this.f39468c = iVar3;
    }

    public static f a(i<d0> iVar, i<Application> iVar2, i<p0> iVar3) {
        return new f(iVar, iVar2, iVar3);
    }

    public static c c(d0 d0Var, Application application, p0 p0Var) {
        return new c(d0Var, application, p0Var);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c(this.f39467a.get(), this.b.get(), this.f39468c.get());
    }
}

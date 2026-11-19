package bo;

import eo.s;

/* JADX INFO: loaded from: classes3.dex */
public class k implements go.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f4509a;
    public final s b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final go.h f4510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4511d = false;

    public enum a {
        WRAP,
        REPLACE
    }

    public k(a aVar, s sVar, go.h hVar) {
        this.f4509a = aVar;
        this.b = sVar;
        this.f4510c = hVar;
    }

    @Override // go.f
    public go.f c() {
        this.f4511d = true;
        return this;
    }

    public s d() {
        return this.b;
    }

    public go.h e() {
        return this.f4510c;
    }

    public a f() {
        return this.f4509a;
    }

    public boolean g() {
        return this.f4511d;
    }
}

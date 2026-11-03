package mn;

import on.s;

/* JADX INFO: loaded from: classes3.dex */
public class k implements qn.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f24933a;
    public final s b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qn.h f24934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f24935d = false;

    public enum a {
        WRAP,
        REPLACE
    }

    public k(a aVar, s sVar, qn.h hVar) {
        this.f24933a = aVar;
        this.b = sVar;
        this.f24934c = hVar;
    }

    @Override // qn.f
    public qn.f c() {
        this.f24935d = true;
        return this;
    }

    public s d() {
        return this.b;
    }

    public qn.h e() {
        return this.f24934c;
    }

    public a f() {
        return this.f24933a;
    }

    public boolean g() {
        return this.f24935d;
    }
}

package l1;

import g0.r1;
import n0.a2;
import n0.a4;

/* JADX INFO: loaded from: classes.dex */
public final class c implements x2.h<m1.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22889a;
    public final a4 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22890c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f1.a f22891d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i1.a f22892e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a2.a f22893f;

    public c(String str, int i10, a4 a4Var, f1.a aVar, i1.a aVar2, a2.a aVar3) {
        this.f22889a = str;
        this.f22890c = i10;
        this.b = a4Var;
        this.f22891d = aVar;
        this.f22892e = aVar2;
        this.f22893f = aVar3;
    }

    @Override // x2.h
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public m1.a get() {
        r1.a("AudioEncAdPrflRslvr", "Using resolved AUDIO bitrate from AudioProfile");
        return m1.a.d().h(this.f22889a).i(this.f22890c).g(this.b).e(this.f22892e.f()).d(this.f22892e.e()).f(this.f22892e.g()).c(b.h(this.f22893f.b(), this.f22892e.f(), this.f22893f.c(), this.f22892e.g(), this.f22893f.g(), this.f22891d.b())).b();
    }
}

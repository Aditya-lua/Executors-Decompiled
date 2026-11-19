package l1;

import g0.r1;
import n0.a2;
import n0.a4;

/* JADX INFO: loaded from: classes.dex */
public final class c implements x2.h<m1.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21834a;
    public final a4 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f1.a f21836d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i1.a f21837e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a2.a f21838f;

    public c(String str, int i10, a4 a4Var, f1.a aVar, i1.a aVar2, a2.a aVar3) {
        this.f21834a = str;
        this.f21835c = i10;
        this.b = a4Var;
        this.f21836d = aVar;
        this.f21837e = aVar2;
        this.f21838f = aVar3;
    }

    @Override // x2.h
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public m1.a get() {
        r1.a("AudioEncAdPrflRslvr", "Using resolved AUDIO bitrate from AudioProfile");
        return m1.a.d().h(this.f21834a).i(this.f21835c).g(this.b).e(this.f21837e.f()).d(this.f21837e.e()).f(this.f21837e.g()).c(b.h(this.f21838f.b(), this.f21837e.f(), this.f21838f.c(), this.f21837e.g(), this.f21838f.g(), this.f21836d.b())).b();
    }
}

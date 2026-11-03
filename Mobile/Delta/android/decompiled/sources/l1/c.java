package l1;

import g0.r1;
import n0.a2;
import n0.a4;

/* JADX INFO: loaded from: classes.dex */
public final class c implements x2.h<m1.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23283a;
    public final a4 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f1.a f23285d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i1.a f23286e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a2.a f23287f;

    public c(String str, int i10, a4 a4Var, f1.a aVar, i1.a aVar2, a2.a aVar3) {
        this.f23283a = str;
        this.f23284c = i10;
        this.b = a4Var;
        this.f23285d = aVar;
        this.f23286e = aVar2;
        this.f23287f = aVar3;
    }

    @Override // x2.h
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public m1.a get() {
        r1.a("AudioEncAdPrflRslvr", "Using resolved AUDIO bitrate from AudioProfile");
        return m1.a.d().h(this.f23283a).i(this.f23284c).g(this.b).e(this.f23286e.f()).d(this.f23286e.e()).f(this.f23286e.g()).c(b.h(this.f23287f.b(), this.f23286e.f(), this.f23287f.c(), this.f23286e.g(), this.f23287f.g(), this.f23285d.b())).b();
    }
}

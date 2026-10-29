package l1;

import android.util.Range;
import g0.r1;
import n0.a4;

/* JADX INFO: loaded from: classes.dex */
public final class d implements x2.h<m1.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22894a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f1.a f22895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i1.a f22896d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a4 f22897e;

    public d(String str, int i10, a4 a4Var, f1.a aVar, i1.a aVar2) {
        this.f22894a = str;
        this.b = i10;
        this.f22897e = a4Var;
        this.f22895c = aVar;
        this.f22896d = aVar2;
    }

    @Override // x2.h
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public m1.a get() {
        Range<Integer> rangeB = this.f22895c.b();
        r1.a("AudioEncCfgDefaultRslvr", "Using fallback AUDIO bitrate");
        return m1.a.d().h(this.f22894a).i(this.b).g(this.f22897e).e(this.f22896d.f()).d(this.f22896d.e()).f(this.f22896d.g()).c(b.h(156000, this.f22896d.f(), 2, this.f22896d.g(), 48000, rangeB)).b();
    }
}

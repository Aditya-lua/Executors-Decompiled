package ob;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class e6 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d6 f27287a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Throwable f27288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f27289d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f27290e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f27291f;

    public /* synthetic */ e6(String str, d6 d6Var, int i10, Throwable th2, byte[] bArr, Map map, byte[] bArr2) {
        o9.s.l(d6Var);
        this.f27287a = d6Var;
        this.b = i10;
        this.f27288c = th2;
        this.f27289d = bArr;
        this.f27290e = str;
        this.f27291f = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f27287a.a(this.f27290e, this.b, this.f27288c, this.f27289d, this.f27291f);
    }
}

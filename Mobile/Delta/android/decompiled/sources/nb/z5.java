package nb;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class z5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y5 f27033a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Throwable f27034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f27035d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f27036e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f27037f;

    public /* synthetic */ z5(String str, y5 y5Var, int i10, Throwable th2, byte[] bArr, Map map, byte[] bArr2) {
        n9.m.l(y5Var);
        this.f27033a = y5Var;
        this.b = i10;
        this.f27034c = th2;
        this.f27035d = bArr;
        this.f27036e = str;
        this.f27037f = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f27033a.a(this.f27036e, this.b, this.f27034c, this.f27035d, this.f27037f);
    }
}

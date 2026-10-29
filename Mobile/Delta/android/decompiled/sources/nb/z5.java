package nb;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class z5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y5 f26212a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Throwable f26213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f26214d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f26215e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f26216f;

    public /* synthetic */ z5(String str, y5 y5Var, int i10, Throwable th2, byte[] bArr, Map map, byte[] bArr2) {
        n9.m.l(y5Var);
        this.f26212a = y5Var;
        this.b = i10;
        this.f26213c = th2;
        this.f26214d = bArr;
        this.f26215e = str;
        this.f26216f = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f26212a.a(this.f26215e, this.b, this.f26213c, this.f26214d, this.f26216f);
    }
}

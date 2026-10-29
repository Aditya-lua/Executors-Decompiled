package p306nb;

import java.util.Map;
import p305n9.C8953m;

/* JADX INFO: renamed from: nb.z5 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9396z5 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final InterfaceC9380y5 f33821a;

    /* JADX INFO: renamed from: b */
    public final int f33822b;

    /* JADX INFO: renamed from: c */
    public final Throwable f33823c;

    /* JADX INFO: renamed from: d */
    public final byte[] f33824d;

    /* JADX INFO: renamed from: e */
    public final String f33825e;

    /* JADX INFO: renamed from: f */
    public final Map f33826f;

    public /* synthetic */ RunnableC9396z5(String str, InterfaceC9380y5 interfaceC9380y5, int i10, Throwable th2, byte[] bArr, Map map, byte[] bArr2) {
        C8953m.m36047l(interfaceC9380y5);
        this.f33821a = interfaceC9380y5;
        this.f33822b = i10;
        this.f33823c = th2;
        this.f33824d = bArr;
        this.f33825e = str;
        this.f33826f = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f33821a.mo36150a(this.f33825e, this.f33822b, this.f33823c, this.f33824d, this.f33826f);
    }
}

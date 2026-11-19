package ob;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class p7 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f27707a;
    public final /* synthetic */ String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f27708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f27709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n8 f27710e;

    public p7(n8 n8Var, String str, String str2, String str3, long j10) {
        this.f27707a = str;
        this.b = str2;
        this.f27708c = str3;
        this.f27709d = j10;
        Objects.requireNonNull(n8Var);
        this.f27710e = n8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.f27707a;
        if (str == null) {
            n8 n8Var = this.f27710e;
            n8Var.z2().t0(this.b, null);
        } else {
            gb gbVar = new gb(this.f27708c, str, this.f27709d);
            n8 n8Var2 = this.f27710e;
            n8Var2.z2().t0(this.b, gbVar);
        }
    }
}

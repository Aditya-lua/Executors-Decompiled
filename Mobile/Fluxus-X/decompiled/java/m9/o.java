package m9;

import androidx.annotation.NonNull;
import l9.a.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class o<A extends l9.a.b, L> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f23044a;
    public final k9.d[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f23045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f23046d;

    public o(@NonNull k<L> kVar, k9.d[] dVarArr, boolean z10, int i10) {
        this.f23044a = kVar;
        this.b = dVarArr;
        this.f23045c = z10;
        this.f23046d = i10;
    }

    public void a() {
        this.f23044a.a();
    }

    public k.a<L> b() {
        return this.f23044a.b();
    }

    public k9.d[] c() {
        return this.b;
    }

    public abstract void d(@NonNull A a10, @NonNull tb.k<Void> kVar);

    public final int e() {
        return this.f23046d;
    }

    public final boolean f() {
        return this.f23045c;
    }
}

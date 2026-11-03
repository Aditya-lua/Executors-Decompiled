package l9;

import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import k9.a.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class o<A extends k9.a.b, L> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f23453a;
    public final Feature[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f23454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f23455d;

    public o(@NonNull k<L> kVar, Feature[] featureArr, boolean z10, int i10) {
        this.f23453a = kVar;
        this.b = featureArr;
        this.f23454c = z10;
        this.f23455d = i10;
    }

    public void a() {
        this.f23453a.a();
    }

    public k.a<L> b() {
        return this.f23453a.b();
    }

    public Feature[] c() {
        return this.b;
    }

    public abstract void d(@NonNull A a10, @NonNull sb.k<Void> kVar);

    public final int e() {
        return this.f23455d;
    }

    public final boolean f() {
        return this.f23454c;
    }
}

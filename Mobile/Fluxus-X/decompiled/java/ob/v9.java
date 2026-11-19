package ob;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class v9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f27870a;
    public final /* synthetic */ String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f27871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f27872d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ va f27873e;

    public v9(va vaVar, AtomicReference atomicReference, String str, String str2, String str3, boolean z10) {
        this.f27870a = atomicReference;
        this.b = str2;
        this.f27871c = str3;
        this.f27872d = z10;
        Objects.requireNonNull(vaVar);
        this.f27873e = vaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f27873e.f27641a.J().g0(this.f27870a, null, this.b, this.f27871c, this.f27872d);
    }
}

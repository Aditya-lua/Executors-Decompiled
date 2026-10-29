package nb;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class q9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f25887a;
    public final /* synthetic */ String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f25888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f25889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qa f25890e;

    public q9(qa qaVar, AtomicReference atomicReference, String str, String str2, String str3, boolean z10) {
        this.f25887a = atomicReference;
        this.b = str2;
        this.f25888c = str3;
        this.f25889d = z10;
        Objects.requireNonNull(qaVar);
        this.f25890e = qaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f25890e.f25625a.J().g0(this.f25887a, null, this.b, this.f25888c, this.f25889d);
    }
}

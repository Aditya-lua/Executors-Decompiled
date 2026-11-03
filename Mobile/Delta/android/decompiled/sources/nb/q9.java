package nb;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class q9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f26708a;
    public final /* synthetic */ String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f26709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f26710d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qa f26711e;

    public q9(qa qaVar, AtomicReference atomicReference, String str, String str2, String str3, boolean z10) {
        this.f26708a = atomicReference;
        this.b = str2;
        this.f26709c = str3;
        this.f26710d = z10;
        Objects.requireNonNull(qaVar);
        this.f26711e = qaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f26711e.f26446a.J().g0(this.f26708a, null, this.b, this.f26709c, this.f26710d);
    }
}

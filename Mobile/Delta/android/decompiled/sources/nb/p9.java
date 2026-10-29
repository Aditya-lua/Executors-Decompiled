package nb;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class p9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f25856a;
    public final /* synthetic */ String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f25857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qa f25858d;

    public p9(qa qaVar, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f25856a = atomicReference;
        this.b = str2;
        this.f25857c = str3;
        Objects.requireNonNull(qaVar);
        this.f25858d = qaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f25858d.f25625a.J().e0(this.f25856a, null, this.b, this.f25857c);
    }
}

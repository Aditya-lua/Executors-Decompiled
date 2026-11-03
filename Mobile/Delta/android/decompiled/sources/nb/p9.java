package nb;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class p9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f26677a;
    public final /* synthetic */ String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f26678c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qa f26679d;

    public p9(qa qaVar, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f26677a = atomicReference;
        this.b = str2;
        this.f26678c = str3;
        Objects.requireNonNull(qaVar);
        this.f26679d = qaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f26679d.f26446a.J().e0(this.f26677a, null, this.b, this.f26678c);
    }
}

package ob;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class u9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f27848a;
    public final /* synthetic */ String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f27849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ va f27850d;

    public u9(va vaVar, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f27848a = atomicReference;
        this.b = str2;
        this.f27849c = str3;
        Objects.requireNonNull(vaVar);
        this.f27850d = vaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f27850d.f27641a.J().e0(this.f27848a, null, this.b, this.f27849c);
    }
}

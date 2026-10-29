package nb;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class x9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Boolean f26110a;
    public final /* synthetic */ qa b;

    public x9(qa qaVar, Boolean bool) {
        this.f26110a = bool;
        Objects.requireNonNull(qaVar);
        this.b = qaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.W(this.f26110a, true);
    }
}

package nb;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class e9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qa f25487a;

    public e9(qa qaVar) {
        Objects.requireNonNull(qaVar);
        this.f25487a = qaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f25487a.f25906r.a();
    }
}

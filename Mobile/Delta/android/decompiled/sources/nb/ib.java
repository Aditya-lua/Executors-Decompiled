package nb;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ib implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jb f25609a;

    public ib(jb jbVar) {
        Objects.requireNonNull(jbVar);
        this.f25609a = jbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f25609a.E(null);
    }
}

package nb;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class eb implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jb f25490a;

    public eb(jb jbVar) {
        Objects.requireNonNull(jbVar);
        this.f25490a = jbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jb jbVar = this.f25490a;
        jbVar.f25633e = jbVar.D();
    }
}

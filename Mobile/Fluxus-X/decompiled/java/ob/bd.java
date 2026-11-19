package ob;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class bd implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ve f27125a;
    public final /* synthetic */ Runnable b;

    public bd(gd gdVar, ve veVar, Runnable runnable) {
        this.f27125a = veVar;
        this.b = runnable;
        Objects.requireNonNull(gdVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        ve veVar = this.f27125a;
        veVar.E();
        veVar.D(this.b);
        veVar.r();
    }
}

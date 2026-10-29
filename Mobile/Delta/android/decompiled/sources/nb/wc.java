package nb;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class wc implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ me f26076a;
    public final /* synthetic */ Runnable b;

    public wc(bd bdVar, me meVar, Runnable runnable) {
        this.f26076a = meVar;
        this.b = runnable;
        Objects.requireNonNull(bdVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        me meVar = this.f26076a;
        meVar.E();
        meVar.D(this.b);
        meVar.r();
    }
}

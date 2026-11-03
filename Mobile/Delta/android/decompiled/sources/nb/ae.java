package nb;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ae implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ne f26163a;
    public final /* synthetic */ me b;

    public ae(me meVar, ne neVar) {
        this.f26163a = neVar;
        Objects.requireNonNull(meVar);
        this.b = meVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        me meVar = this.b;
        meVar.u0(this.f26163a);
        meVar.A0();
    }
}

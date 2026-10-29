package nb;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class v implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l8 f26018a;
    public final /* synthetic */ w b;

    public v(w wVar, l8 l8Var) {
        this.f26018a = l8Var;
        Objects.requireNonNull(wVar);
        this.b = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l8 l8Var = this.f26018a;
        l8Var.c();
        if (f.a()) {
            l8Var.b().t(this);
            return;
        }
        w wVar = this.b;
        boolean zC = wVar.c();
        wVar.e(0L);
        if (zC) {
            wVar.a();
        }
    }
}

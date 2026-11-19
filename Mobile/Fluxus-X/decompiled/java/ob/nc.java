package ob;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class nc implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i5 f27627a;
    public final /* synthetic */ sc b;

    public nc(sc scVar, i5 i5Var) {
        this.f27627a = i5Var;
        Objects.requireNonNull(scVar);
        this.b = scVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sc scVar = this.b;
        synchronized (scVar) {
            try {
                scVar.d(false);
                yc ycVar = scVar.f27802c;
                if (!ycVar.W()) {
                    ycVar.f27641a.a().v().a("Connected to remote service");
                    ycVar.z(this.f27627a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        yc ycVar2 = this.b.f27802c;
        if (ycVar2.P() != null) {
            ycVar2.P().shutdownNow();
            ycVar2.Q(null);
        }
    }
}
